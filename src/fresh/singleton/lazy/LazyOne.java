package fresh.singleton.lazy;

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
            return new LazyOne();
        }
        return lazyOne;
    }
}
