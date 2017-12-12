package thread;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 15:14
 */
public class TestIsAlive {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread = new MyThread2();
        System.out.println("begin == " + myThread.isAlive());
        myThread.start();
        System.out.println("end == " + myThread.isAlive());
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }
}