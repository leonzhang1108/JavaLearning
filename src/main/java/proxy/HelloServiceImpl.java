package proxy;

/**
 * Author: jianliangzhang
 * TestDate: 2017/12/11
 * Time: 16:05
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("hello "+ name);
    }
}
