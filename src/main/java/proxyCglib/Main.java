package proxyCglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Author: jianliangzhang
 * TestDate: 2017/12/11
 * Time: 18:21
 */
public class Main {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(cglibProxy);

        UserService o = (UserService)enhancer.create();
        o.getName(1);
        o.getAge(1);
    }
}
