package singleton.singleton2.lazy;

import singleton.singleton3.ExecutorThread;

/**
 * Add some description about this class.
 *
 * @author senmao.li
 * @since 2019/6/21 16:50
 */
public class LazyOneTest2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("end");
    }
}
