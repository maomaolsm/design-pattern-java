package singleton.singleton2.lazy;

/**
 * Created by maomao on 2018/4/6.
 *
 * 懒汉式单例
 *
 * 在外部调用的时候才实例化
 */
public class LazyOne {

    private LazyOne() {
    }

    private static LazyOne lazyOne = null;

    public static LazyOne getInstance() {
        if (lazyOne == null) {
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }
}
