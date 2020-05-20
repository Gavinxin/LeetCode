package MixThreadEx;

public class ThreadTest1 extends Thread{
	public static Object lock = new Object();
	public int flag;
	public String str;
	private static int curcnt=0;
	public ThreadTest1(int flag,String str){
		this.flag = flag;
		this.str = str;
				
	}
	@Override
	public void run() {
		for (int i = 0; i < str.length(); i++) {
			synchronized (lock) {
				while(curcnt%2!=flag) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.print(str.charAt(i));
				curcnt++;
				try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lock.notifyAll();
			}
			
		}
	}
	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1(0,"hlozagpnxn");
		ThreadTest1 t2 = new ThreadTest1(1,"el,hn a i");
		t1.start();
		t2.start();
	}

}
