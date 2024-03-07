```shell
# Foo.main编译后的字节码
 0: iconst_2       // 我们用AsmTools更改了这一指令
 1: istore_1
 2: iload_1
 3: ifeq 14        // 第一个if语句 即操作数栈上数值为0时跳转
 6: getstatic java.lang.System.out
 9: ldc "吃了"
11: invokevirtual java.io.PrintStream.println
14: iload_1
15: iconst_1
16: if_icmpne 27   // 第二个if语句 即操作数栈上两个数值不相同时跳转
19: getstatic java.lang.System.out
22: ldc "真吃了"
24: invokevirtual java.io.PrintStream.println
27: return
```