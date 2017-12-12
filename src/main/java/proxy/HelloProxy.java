package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author: jianliangzhang
 * TestDate: 2017/12/11
 * Time: 16:05
 */
public class HelloProxy implements InvocationHandler {
    private Object obj;

    //绑定委托对象，并返回代理类
    public Object bind(Object obj)
    {
        this.obj = obj;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        before();
        method.invoke(obj, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("in before");
    }

    private void after() {
        System.out.println("in after");
    }
}
