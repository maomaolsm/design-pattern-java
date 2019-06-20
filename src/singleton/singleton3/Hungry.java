package singleton.singleton3;

/**
 * Add some description about this class.
 *
 * @author senmao.li
 * @since 2019/6/20 18:26
 */
// 缺点：浪费内存空间
public class Hungry {

    private static final Hungry HUNGRY = new Hungry();

    private Hungry() {
    }

    public static Hungry getHUNGRY() {
        return HUNGRY;
    }
}
