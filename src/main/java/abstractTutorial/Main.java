package abstractTutorial;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 11:47
 */
public class Main {
    public static void main(String[] args) {
        Batman batman = new Batman("bruce wayne", "male", "rich");
        batman.fight();
        System.out.println(batman.getName());
        System.out.println(batman.getSex());
        System.out.println(batman.getPower());
    }
}
