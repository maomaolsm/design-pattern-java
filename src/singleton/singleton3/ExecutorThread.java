package singleton.singleton3;

import singleton.singleton2.lazy.LazyOne;

/**
 * Add some description about this class.
 *
 * @author senmao.li
 * @since 2019/6/21 16:38
 */
public class ExecutorThread implements Runnable {

    @Override
    public void run() {

        LazyOne lazy = LazyOne.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + lazy);

    }
}
