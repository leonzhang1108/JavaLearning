package serializable;

import java.io.Serializable;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 14:00
 */
public class User implements Serializable {
    private String name;
    private int age;
    private boolean sex;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
