package singleton.singleton2.lazy;

import java.lang.reflect.Constructor;

/**
 * Created by maomao on 2018/4/7.
 */
public class LazyThreeTest {
    public static void main(String[] args) {

        try {
            Class<?> clazz = LazyThree.class;

            //通过反射拿到私有的构造方法
            Constructor constructor = clazz.getDeclaredConstructor(null);
            //强制访问
            constructor.setAccessible(true);

            //暴力初始化
            Object object = constructor.newInstance();

            //调用两次，相当于new了两次
            Object object2 = constructor.newInstance();

            System.out.println(object == object2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
