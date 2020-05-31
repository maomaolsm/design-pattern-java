package singleton.singleton2.lazy;

/**
 * 双重检查
 * 1、不允许2、3进行重排序,加入了volatile关键字.
 * 2、允许一个线程进行重排序，但不允许另外线程看到他的重排序。
 * 划重点：
 * 1、在多线程的时候，cpu有共享内存。
 * 2、加入了volatile关键字之后，所有线程都能看到共享内存的最新状态，保证内存可见性。
 * <p>
 * 怎么保持内存一致性？
 * 用volatile修饰的共享变量，在进行写操作的时候，会多出来很多汇编代码，起到两个作用。
 * 1、是将当前处理器缓存行的数据写回到系统内存，写回内存的操作，会使在其他cpu里缓存了该内存的数据无效，其他cpu缓存的数据无效了，就会从共享内存同步数据。保证了内存的可见性。
 * 主要使用的是缓存一致性协议
 * <p>
 * 优点：
 * 既兼顾了性能，又兼顾了线程安全。
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 1、分配内存给这个对象
                    // 2、初始化对象
                    // 3、设置lazyDoubleCheckSingleton，指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
