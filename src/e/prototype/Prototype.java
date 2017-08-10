package e.prototype;

/**
 * Created by maomao on 17/8/9.
 */
public class Prototype {
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
