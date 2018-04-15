package fresh.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by maomao on 2018/4/14.
 */
public class CglibMeipo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) {

        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的父类
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务的增强

        System.out.println("我是媒婆，我要给你找对象，现在已经拿到需求了");
        System.out.println("开始物色");

        methodProxy.invokeSuper(o, objects);

        System.out.println("合适的话，就准备办事");


        return null;
    }
}
