在 Java 9 之前，启动类加载器负责加载最为基础、最为重要的类，
比如存放在 JRE 的 lib 目录下 jar 包中的类（以及由虚拟机参数 -Xbootclasspath 指定的类）。除了启动类加载器之外，另外两个重要的类加载器是扩展类加载器（extension class loader）
和应用类加载器（application class loader），
均由 Java 核心类库提供。

扩展类加载器的父类加载器是启动类加载器。
它负责加载相对次要、但又通用的类，比如存放在 JRE 的 lib/ext 目录下 jar 包中的类（以及由系统变量 java.ext.dirs 指定的类）。

应用类加载器的父类加载器则是扩展类加载器。它负责加载应用程序路径下的类。
（这里的应用程序路径，便是指虚拟机参数 -cp/-classpath、系统变量 java.class.path 或环境变量 CLASSPATH 所指定的路径。）

默认情况下，应用程序中包含的类便是由应用类加载器加载的。Java 9 引入了模块系统，并且略微更改了上述的类加载器1。
扩展类加载器被改名为平台类加载器（platform class loader）。
Java SE 中除了少数几个关键模块，比如说 java.base 是由启动类加载器加载之外，其他的模块均由平台类加载器所加载。

在 Java 虚拟机中，类的唯一性是由类加载器实例以及类的全名一同确定的。
即便是同一串字节流，经由不同的类加载器加载，也会得到两个不同的类。在大型应用中，我们往往借助这一特性，来运行同一个类的不同版本。


- 加载
- 链接(验证、准备、解析)
  - 验证: 
  - 准备：静态资源
  - 解析：符号引用变为实际引用
- 初始化
  - 什么时候触发初始化
    1. 当虚拟机启动时，初始化用户指定的主类；
    2. 当遇到用以新建目标类实例的 new 指令时，初始化 new 指令的目标类；
    3. 当遇到调用静态方法的指令时，初始化该静态方法所在的类；
    4. 当遇到访问静态字段的指令时，初始化该静态字段所在的类；
    5. 子类的初始化会触发父类的初始化；
    6. 如果一个接口定义了 default 方法，那么直接实现或者间接实现该接口的类的初始化，会触发该接口的初始化；
    7. 使用反射 API 对某个类进行反射调用时，初始化这个类；
    8. 当初次调用 MethodHandle 实例时，初始化该 MethodHandle 指向的方法所在的类。
```java
public class Singleton {
  private Singleton() {}
  private static class LazyHolder {
    static final Singleton INSTANCE = new Singleton();
  }
  public static Singleton getInstance() {
    return LazyHolder.INSTANCE;
  }
}
```

```

$ echo '
public class Singleton {
  private Singleton() {}
  private static class LazyHolder {
    static final Singleton INSTANCE = new Singleton();
    static {
      System.out.println("LazyHolder.<clinit>");
    }
  }
  public static Object getInstance(boolean flag) {
    if (flag) return new LazyHolder[2];
    return LazyHolder.INSTANCE;
  }
  public static void main(String[] args) {
    getInstance(true);
    System.out.println("----");
    getInstance(false);
  }
}' > Singleton.java
$ javac Singleton.java
$ java -verbose:class Singleton
```
通过 JVM 参数 -verbose:class 来打印类加载的先后顺序

问题 1：新建数组（第 11 行）会导致 LazyHolder 的加载吗？会导致它的初始化吗？
```shell
$ java -cp /path/to/asmtools.jar org.openjdk.asmtools.jdis.Main Singleton\$LazyHolder.class > Singleton\$LazyHolder.jasm.1
$ awk 'NR==1,/stack 1/{sub(/stack 1/, "stack 0")} 1' Singleton\$LazyHolder.jasm.1 > Singleton\$LazyHolder.jasm
$ java -cp /path/to/asmtools.jar org.openjdk.asmtools.jasm.Main Singleton\$LazyHolder.jasm
$ java -verbose:class Singleton
```
问题 2：新建数组会导致 LazyHolder 的链接吗？