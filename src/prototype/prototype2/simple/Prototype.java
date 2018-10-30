package prototype.prototype2.simple;

/**
 * Created by maomao on 2018/4/7.
 */
public class Prototype implements Cloneable {
    public String name;
    public CloneTarget cloneTarget;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
