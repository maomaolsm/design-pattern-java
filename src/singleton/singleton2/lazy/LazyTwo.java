package singleton.singleton2.lazy;

/**
 * Created by maomao on 2018/4/6.
 */
public class LazyTwo {

    private LazyTwo() {
    }

    private static LazyTwo lazyTwo = null;

    public static synchronized LazyTwo getInstance() {

        if (lazyTwo == null) {
            lazyTwo = new LazyTwo();
        }

        return lazyTwo;
    }

}
