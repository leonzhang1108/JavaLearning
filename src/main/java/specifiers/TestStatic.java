package specifiers;

/**
 * Author: jianliangzhang
 * TestDate: 2017/12/11
 * Time: 18:51
 */
public class TestStatic {
    private static int count = 0;
    public static void add() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            TestStatic.add();
        }
        System.out.println(TestStatic.getCount());
    }
}
