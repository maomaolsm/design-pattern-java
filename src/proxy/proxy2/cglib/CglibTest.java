package proxy.proxy2.cglib;

/**
 * Created by maomao on 2018/4/14.
 */
public class CglibTest {
    public static void main(String[] args) {
        LiSi liSi=(LiSi)new CglibMeipo().getInstance(LiSi.class);
        liSi.findLove();
        System.out.println(liSi.getClass());
    }
}
