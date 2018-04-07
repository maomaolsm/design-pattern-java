package fresh.singleton.hungry;

/**
 * Created by maomao on 2018/4/6.
 *
 * 饿汉式单例
 * 在类加载的时候就立即初始化，且创建单例对象
 *
 * 优点：没有加任何锁，执行效率高
 *
 * 缺点：在类加载的时候就初始化，不管用不用，都占用空间，浪费内存
 *
 * 绝对的线程安全，在线程还没有出现之前就已经实例化了，不可能存在访问安全问题
 */
public class Hungry {

    private Hungry() {
    }

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }
}
