package old.abstractfactory;

import old.factory.Sender;

/**
 * Created by maomao on 17/8/9.
 */
public interface Provider {
    Sender produce();
}
