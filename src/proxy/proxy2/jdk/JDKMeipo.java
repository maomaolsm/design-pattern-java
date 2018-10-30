package proxy.proxy2.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by maomao on 2018/4/14.
 */
public class JDKMeipo implements InvocationHandler {

    //被代理的对象，把引用给保存下来
    private Person target;

    public Object getInstance(Person target) {
        this.target = target;

        Class<?> clazz = target.getClass();

        //用来声称新的对象（字节码重组来实现）
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，我要给你找对象，现在已经拿到需求了");
        System.out.println("开始物色");

        method.invoke(this.target, args);

        System.out.println("合适的话，就准备办事");
        return null;
    }
}
