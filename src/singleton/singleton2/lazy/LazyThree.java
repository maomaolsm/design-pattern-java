package singleton.singleton2.lazy;

/**
 * Created by maomao on 2018/4/7.
 * <p>
 * 使用内部类
 * 特点：内部类只有被外部类店用的时候他才会被加载
 * 内部类一定是要在方法调用之前初始化
 * 巧妙的避免了线程安全问题
 * <p>
 * 这种形式兼顾了饿汉式的浪费内存，也兼顾了synchronized的性能问题
 * 完美的屏蔽了这两个缺点
 * 史上最牛逼的单例模式
 */
public class LazyThree {

    private static boolean initialized = false;

    private LazyThree() {

        //避免反射入侵
        synchronized (LazyThree.class) {
            if (initialized == false) {
//                initialized = !initialized;
                initialized = true;
            } else {
                throw new RuntimeException("单例被入侵");
            }
        }
    }

    private static class LazyHolder {
        private static final LazyThree LAZY_THREE = new LazyThree();
    }

    //每一个关键字都不是多余的
    //static是为了单例的空间共享
    //final保证了方法不会被重写，重载
    public static final LazyThree getInstance() {
        //在返回结果之前，一定会先加载内部类
        return LazyHolder.LAZY_THREE;
    }

}
