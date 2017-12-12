package specifiers;

/**
 * Author: jianliangzhang
 * TestDate: 2017/12/11
 * Time: 19:01
 */
public class TestWithoutVolatile {
    private static boolean bChanged;

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 10; i++){
            new Thread() {
                @Override
                public void run() {
                    for (;;) {
                        if (bChanged == !bChanged) {
                            System.out.println("!=");
                            System.exit(0);
                        }
                    }
                }
            }.start();
        }

        Thread.sleep(1);

        new Thread() {
            @Override
            public void run() {
                for (;;) {
                    bChanged = !bChanged;
                }
            }
        }.start();
    }
}