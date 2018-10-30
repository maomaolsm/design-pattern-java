package prototype.prototype2.deep;

import java.io.Serializable;

/**
 * Created by maomao on 2018/4/7.
 */
public class JinGuBang implements Serializable{

    private float h = 100;
    private float d = 100;

    public void big() {
        this.h *= 2;
        this.d *= 2;
    }

    public void small() {
        this.h /= 2;
        this.d /= 2;
    }
}
