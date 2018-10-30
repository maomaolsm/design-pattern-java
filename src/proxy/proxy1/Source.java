package proxy.proxy1;

/**
 * Created by maomao on 17/8/31.
 */
public class Source implements SourceAble {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
