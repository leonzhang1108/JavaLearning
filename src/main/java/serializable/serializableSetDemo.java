package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 13:59
 */
public class serializableSetDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(2123123);
        user.setJob("programmer");
        user.setName("leon zhang");
        user.setSex(true);
        try {
            FileOutputStream fileOut = new FileOutputStream("src/main/java/serializable/test.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in text.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
