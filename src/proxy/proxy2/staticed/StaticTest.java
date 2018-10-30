package proxy.proxy2.staticed;

/**
 * Created by maomao on 2018/4/14.
 * 静态代理，在代理之前所有的东西都是已知的
 */
public class StaticTest {
    public static void main(String[] args) {
        Father father=new Father(new Son());

        father.fingLove();
    }
}
