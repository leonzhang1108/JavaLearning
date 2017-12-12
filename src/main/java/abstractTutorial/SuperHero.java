package abstractTutorial;


/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 11:45
 */
public abstract class SuperHero {
    private String name;
    private String sex;
    private String power;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }



    public SuperHero(String name, String sex, String power) {
        this.name = name;
        this.sex = sex;
        this.power = power;
    }

    public abstract void fight();
}
