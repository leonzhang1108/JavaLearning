package proxy;

/**
 * Author: jianliangzhang
 * TestDate: 2017/12/11
 * Time: 16:04
 */
public class Main {
    public static void main(String[] args) {
        HelloProxy proxy = new HelloProxy();
        HelloService h = (HelloService) proxy.bind(new HelloServiceImpl());
        h.sayHello("leon");
    }
}
