package MixThreadEx;

import java.util.concurrent.Semaphore;

public class ThreadTest extends Thread{
	private static Object lock = new Object();
	private static int currentCount =0;
	int flag;
	String name ;
	ThreadTest(int flag,String name){
		this.flag = flag;
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (lock) {
				while(currentCount%3!=flag) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(name);
				currentCount++;
				lock.notifyAll();
			}
		}		
	}
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest(0,"A");
		ThreadTest t2 = new ThreadTest(1,"B");
		ThreadTest t3 = new ThreadTest(2,"C");
		t1.start();
		t2.start();
		t3.start();
	}
}
