package old.abstractfactory;

import factory.factory1.Sender;
import factory.factory1.SmsSender;

/**
 * Created by maomao on 17/8/9.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
