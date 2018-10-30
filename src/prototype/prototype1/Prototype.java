package prototype.prototype1;

/**
 * Created by maomao on 17/8/9.
 */
public class Prototype implements Cloneable{

    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
