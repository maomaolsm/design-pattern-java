package fresh.singleton.lazy;

/**
 * Created by maomao on 2018/4/6.
 */
public class LazyTwo {

    private LazyTwo() {

    }

    private static LazyTwo lazyTwo = null;

    public static synchronized LazyTwo getInstance() {

        if (lazyTwo == null) {
            return new LazyTwo();
        }

        return lazyTwo;
    }

}
