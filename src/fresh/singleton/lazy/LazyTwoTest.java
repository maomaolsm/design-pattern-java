package fresh.singleton.lazy;

/**
 * Created by maomao on 2018/4/7.
 */
public class LazyTwoTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 200000000; i++) {
//            Object object = LazyOne.getInstance();
            Object object2 = LazyTwo.getInstance();
        }

        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }
}
