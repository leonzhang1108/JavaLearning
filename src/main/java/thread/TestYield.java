package thread;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 16:16
 */
public class TestYield extends Thread{
    public TestYield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
            if (i == 30) {
                this.yield();
            }
        }
    }

    public static void main(String[] args) {
        TestYield yt1 = new TestYield("张三");
        TestYield yt2 = new TestYield("李四");
        yt1.start();
        yt2.start();
    }
}