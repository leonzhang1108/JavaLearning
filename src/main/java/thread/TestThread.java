package thread;


/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 14:34
 */
public class TestThread {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("主线程ID:" + Thread.currentThread().getId());
        MyThread thread1 = new MyThread("thread1");
        thread1.start(); // start运行在新线程
        MyThread thread2 = new MyThread("thread2");
        thread2.run(); //   run运行在主线程

    }
}

class MyThread extends Thread {
    private String name;
    public MyThread(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("name:" + name + " 子线程ID:" + Thread.currentThread().getId());
    }
}
