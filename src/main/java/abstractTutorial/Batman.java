package abstractTutorial;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 11:47
 */
public class Batman extends SuperHero{

    public Batman(String name, String sex, String power) {
        super(name, sex, power);
    }

    @Override
    public void fight() {

        System.out.println("batman fight");
    }
}
