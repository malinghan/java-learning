下面我给你留一个小作业，
通过观察两个条件判断语句的运行结果，来思考 Java 语言和 Java 虚拟机看待 boolean 类型的方式是否不同。下载 asmtools.jar [2] ，并在命令行中运行下述指令（不包含提示符 $）：
```shell
$ echo '
public class Foo {
 public static void main(String[] args) {
  boolean flag = true;
  if (flag) System.out.println("Hello, Java!");
  if (flag == true) System.out.println("Hello, JVM!");
 }
}' > Foo.java
$ javac Foo.java
$ java Foo
$ java -cp /path/to/asmtools.jar org.openjdk.asmtools.jdis.Main Foo.class > Foo.jasm.1
$ awk 'NR==1,/iconst_1/{sub(/iconst_1/, "iconst_2")} 1' Foo.jasm.1 > Foo.jasm
$ java -cp /path/to/asmtools.jar org.openjdk.asmtools.jasm.Main Foo.jasm
$ java Foo
```

https://en.wikipedia.org/wiki/Java_processor
[2]: https://wiki.openjdk.java.net/display/CodeTools/asmtools
[3]: https://asm.ow2.io/

# 理解
jvm把boolean当做int来处理
flag = iconst_1 = true
awk把stackframe中的flag改为iconst_2
if（flag）比较时ifeq指令做是否为零判断，常数2仍为true，打印输出
if（true == flag）比较时if_cmpne做整数比较，iconst_1是否等于flag，比较失败，不再打印输出