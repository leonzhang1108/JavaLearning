package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 14:19
 */
public class serializableGetDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/serializable/test.txt");
            ObjectInputStream in = new ObjectInputStream(fis);
            User user = (User)in.readObject();
            System.out.println(user.getName());
            System.out.println(user.getJob());
            System.out.println(user.getAge());
            in.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
