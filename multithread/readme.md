本模块探讨多线程的相关知识
    主要是《JAVA多线程编程实践》的学习笔记
   
第一章：java多线程技能
      进程和线程的区别：
          进程是操作系统管理的基本运行单元；线程是进程中独立运行的子任务
      如何使用多线程：
          继承Thread类
          实现Runnable接口: 
              Thread(Runnable target, String name) 此构造函数既可以传入Runnable接口，还可以传入Thread类，将一个Thread对象的Run方法交由其他线程调用
          实例变量与线程安全：
              如何构造线程不共享的实例变量和线程共享的实例变量？ 参考 multithread.base.b
              非线程安全：多个线程对同一个对象中的同一个实例变量进行操作时会出现值被更改、值不同步的情况，影响程序的执行流程
           i--与System.out.println()的异常： i--是在println之前就运算的
      currentThread()方法：
           该方法返回代码段正在被哪个线程调用的信息。
      isAlive()方法：该方法判断当前线程是否处于活动状态    
      sleep()方法：指定的毫秒数内让当前“正在执行的线程”休眠，正在执行的线程指的是this.currentThread()     
      getId():  取得线程的唯一标识
      停止线程：在线程处理完任务之前停掉正在做的操作
            Thread.stop()过时：会释放锁造成异常 java.lang.ThreadDeath,造成数据不一致
            Thread.interrupt()：只在当前线程中打一个停止标记，没有真正停止线程
            interrupted()  isInterrupted()用于判断当前线程是否停止，interrupted会清除标记
            使用异常法停止线程:InterruptedException 参考 InterruptExceptionThread
            使用return停止线程：不会抛出异常，不建议  参考 useReturnInterrupt
       在沉睡中停止：会消除停止状态值
      暂停线程：
           suspend和resume缺点：独占,其他线程无法访问公共同步对象;不同步
           yield：放弃当前资源，让给其他任务去占用CPU资源，放弃的时间不确定。
      线程的优先级：setPriority()  
           线程优先级具有继承特性:A启动B，B继承A的优先级
           线程优先级具有规则性：高优先级的线程大部分先执行完，不代表高优先级的线程全部先执行完
           线程的优先级具有随机性：优先级高的不一定每次都先执行完
      守护线程：Daemon 当进程不存在非守护线程，守护线程自动销毁。如垃圾回收线程。
           默认情况,main里run方法的运行不会影响t线程的run方法运行,Deamon则会影响。参考 Deamon
第二章，对象及变量的并发访问
      Synchronized同步方法
           方法内的变量为线程安全
           实例变量非线程安全              
           多个对象多个锁
           synchronized方法与锁对象
           脏读：在读取实例变量时，该值已经被其他线程更改过了
           synchronized锁重入:
               在使用synchronized时，当一个对象得到一个锁时，再次请求此对象的锁是可以再次得到的，也就是在一个synchronized语句块和方法内部调用其他synchronized,是永远可以得到锁的。
               可重入锁：自己可以再次获取自己的内部锁。
               支持父子类：当存在父子类继承关系时，子类完全可以通过"可重入锁"调用父类的同步方法
           出现异常，锁自动释放:当一个线程执行的代码出现异常时，所持有的锁会自动释放
           同步不具有继承性：子类的synchroized不能同步，父类和子类都必须加synchroized才能同步 
           Synchronized申明方法的弊端：同步程序执行效率慢
      Synchronized同步语句块
      volatile关键字：使变量在多个线程间可见 
第三章，wait notify join 
第四章，Lock          
第五章，timer


问题：
synchronized的实现原理？
synchronized和Lock的区别？
线程池的实现原理？ThreadPoolExecutor怎么优化线程调度的？？





           
            
            
             