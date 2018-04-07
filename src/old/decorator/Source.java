package old.decorator;

/**
 * Created by maomao on 17/8/24.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
