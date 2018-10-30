package singleton.singleton2.lazy;

import java.util.concurrent.CountDownLatch;

/**
 * Created by maomao on 2018/4/6.
 */
public class LazyOneTest {
    public static void main(String[] args) {
        int count = 2000;

        //发令枪
        final CountDownLatch countDownLatch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        //阻塞
                        //count=0 就会释放所有的共享锁
                        //万箭齐发
                        countDownLatch.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Object object = LazyOne.getInstance();
                    System.out.println(System.currentTimeMillis() + ":" + object);
                }
            }.start();
            countDownLatch.countDown();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时:" + (end - start));
    }
}
