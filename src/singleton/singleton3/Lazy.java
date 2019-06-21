package singleton.singleton3;

/**
 * Add some description about this class.
 *
 * @author senmao.li
 * @since 2019/6/21 11:15
 */
public class Lazy {
    private static Lazy lazy = null;

    private Lazy() {
    }

    // 这里可能会出现并发问题，使用 synchronized 关键字解决
    // 虽然 jdk 1.6 之后有优化，但还是有性能问题
    public static Lazy getLazy() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
