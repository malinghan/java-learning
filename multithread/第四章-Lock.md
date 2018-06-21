#### Lock的使用
主要包括：
- ReentrantLock类的使用
- ReentrantReadWriteLock类的使用


####  ReentrantLock类的使用
JDK1.5 新增ReentrantLock，能实现synchronized的全部功能，还有更多扩展功能，如嗅探锁定、多路分支通知等功能;比synchronized更加灵活（可手动释放锁）

- 使用ReentrantLock实现同步:test01
- 使用ReentrantLock实现同步:test02 

- 使用Condition实现等待/通知:错误用法:condition.await()需配合lock.lock()中使用
  - synchronized wait/notify/notify
  - reentrantLock lock/condition
- 使用Condition实现等待/通知:正确用法 test03 test04

- 使用多个Condition实现通知部分线程:错误用法:condition.await() condition.signalAll() 唤醒同一condition的waiting线程
- 使用多个Condition实现通知部分线程:正确用法  test05 test06
    - 如何使用signal唤醒某一个线程？？？
    - 
- 使用ReentrantLock实现生产者/消费者模型:一对一 test07
- 使用ReentrantLock实现生产者/消费者模型:多对多 test08
- 公平锁与非公平锁 test09

- getHoldCount()、getQueueLength()、getWaitQueueLength()
    * lock.getHoldCount()  查询当前线程保存锁定的个数，调用lock.lock()的数量
    * lock.getQueueLength()  查询正等待获取此锁定的线程估计数
    * lock.getWaitQueueLength(condition) 查询等待与此锁定相关条件Condition的线程数
    
- hasQueueThread()、hasQueueThreads()、hasWaiters()
    
- isFair()、isHeldByCurrentThread()、isLocked()
- lockInterruptibly()、tryLock()、tryLock(Long timeout,TimeUnit unit)
- awaitUninterruptibly()
- awaitUntil
- 使用Condition实现顺序执行

####  ReentrantReadWriteLock类的使用


问题
- condition与wait/notifyAll的区别？
    Condition对象，可以实现多路通知功能:<br>
    在一个Lock对象中可以创建多个Condition对象实例，对象可以注册在指定的Condition，有选择的进行线程通知；<br>
    而使用wait/notify被通知的线程是由JVM随机选择的,synchronized相当于整个Lock对象只有一个Condition,所有线程注册在一个对象上;线程notifyAll时,通知所有线程，没有选择权；
    
    Object类中的wait() <==> Condition类中的await()
    Object类中的wait(long timeout) <==> Condition类中的await(long time,TimeUnit unit)
    Object类中的notify() <==> Condition类中的signal()
    Object类中的notifyAll() <==> Condition类中的signalAll()

-  什么是公平锁？非公平锁？区别是啥？
    Lock分为公平锁，非公平锁。
    - 公平锁表示线程获取锁的顺序是按照线程加锁的顺序分配，先来先到FIFO。排队获取锁。
    - 非公平锁是获取锁的抢占机制，随机获取锁。
    
- ReentrantLock
```
    //ReentrantLock
    public class ReentrantLock implements Lock, java.io.Serializable
    //method
    ReentrantLock(boolean fair)
    lock()
    public void unlock()
    public void lockInterruptibly() throws InterruptedException
    public boolean tryLock()
    public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException
    public Condition newCondition()
    public int getHoldCount()
    public boolean isHeldByCurrentThread()
    public boolean isLocked()
    public final boolean isFair()
    public final boolean hasQueuedThreads()
    public final boolean hasQueuedThread(Thread thread)
    public final int getQueueLength()
    public boolean hasWaiters(Condition condition)
    public int getWaitQueueLength(Condition condition)
    protected Thread getOwner()
    protected Collection<Thread> getQueuedThreads()
    protected Collection<Thread> getWaitingThreads(Condition condition)
    //parameter
    abstract static class Sync extends AbstractQueuedSynchronizer
    static final class NonfairSync extends Sync
    static final class FairSync extends Sync
 ```