package MixThreadEx;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
        MyThread thread1 = new MyThread(true, true, "hloaiaa");
        MyThread thread2 = new MyThread(false, true, "el,lbb");
        MyThread thread3 = new MyThread(false, false, null);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class MyThread extends Thread{
        static boolean flag = true;
        static Queue<Character> queue = new LinkedList<>();
        boolean myFlag;
        boolean type;
        String input;
        int i = 0;

        public MyThread(boolean myFlag, boolean type, String input) {
            this.myFlag = myFlag;
            this.type = type;
            this.input = input;
        }

        synchronized static boolean offer(MyThread myThread){
            if (flag == myThread.myFlag){
                queue.add(myThread.input.charAt(myThread.i++));
                flag = !myThread.myFlag;
                return true;
            }
            return false;
        }

        boolean poll(){
            if (!queue.isEmpty()){
                System.out.print(queue.poll());
                return true;
            }
            return false;
        }

        public void run(){
            if (type){
                while (true) {
                    if(offer(this)){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (i == input.length())
                        break;
                }
            }else {
                while (true) {
                    if(poll()){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
