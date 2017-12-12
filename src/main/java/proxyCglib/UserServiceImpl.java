package proxyCglib;

/**
 * Author: jianliangzhang
 * TestDate: 2017/12/11
 * Time: 18:22
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getName(int id) {
        System.out.println("------getName------");
        return "Tom";
    }

    @Override
    public Integer getAge(int id) {
        System.out.println("------getAge------");
        return 10;
    }
}
