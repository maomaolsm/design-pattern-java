package old.abstractfactory;

import old.factory.Sender;
import old.factory.SmsSender;

/**
 * Created by maomao on 17/8/9.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
