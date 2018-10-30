package singleton.singleton2.hungry;

import java.util.concurrent.CountDownLatch;

/**
 * Created by maomao on 2018/10/11.
 */
public class HungryTest {
    public static void main(String[] args) {
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i <= count; i++) {
            new Thread() {
                @Override
                public void run() {
                    Hungry.getInstance();
                }
            }.start();
        }
        latch.countDown();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}