package old.decorator;

/**
 * Created by maomao on 17/8/24.
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {

        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");

    }
}
