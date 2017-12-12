package thread;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 15:20
 */
class Thread1 extends Thread {
    public Thread1() {
        super("[Thread1] Thread");
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + " loop at " + i);
                Thread.sleep(1000);
            }
            System.out.println(threadName + " end.");
        } catch (Exception e) {
            System.out.println("exception from " + threadName + ".run");
        }
    }
}

class Thread2 extends Thread {
    Thread1 t1;

    public Thread2(Thread1 thread1) {
        super("[Thread2] Thread");
        this.t1 = thread1;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        try {
            t1.join();
            System.out.println(threadName + " end.");
        } catch (Exception e) {
            System.out.println("exception from" + threadName + ".run");
        }
    }
}


public class TestJoin {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2(t1);
        try {
            t1.start();
            Thread.sleep(2000);
            t2.start();
            t2.join();
        } catch (Exception e) {
            System.out.println("exception from main");
        }

        System.out.println(threadName + " end.");

    }

}