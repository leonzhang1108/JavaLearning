package thread;

import java.util.Date;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 10:55
 */
public class TestSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(new Date() + "\n");
        Thread.sleep(1000 * 1);
        System.out.println(new Date() + "\n");
    }
}
