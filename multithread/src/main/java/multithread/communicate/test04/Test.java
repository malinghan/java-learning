package multithread.communicate.test04;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.setName("a");
		a.start();

		NotifyThread notifyThread = new NotifyThread(lock);//
		notifyThread.setName("b");
		notifyThread.start();

		synNotifyMethodThread c = new synNotifyMethodThread(lock);//
		c.setName("c");
		c.start();

		/**
		     begin wait() ThreadName=a
			 begin notify() ThreadName=Thread-1 time=1517312666252   ....在这停顿。。。5秒
			 end notify() ThreadName=Thread-1 time=1517312671256    notify不释放锁。。。
			 end wait() ThreadName=a                               c执行完后，a获取到锁，继续执行
			 begin notify() ThreadName=c time=1517312671256
			 end notify() ThreadName=c time=1517312676258
		 */

	}

}
