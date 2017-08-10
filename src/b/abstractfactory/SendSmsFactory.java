package b.abstractfactory;

import a.factory.Sender;
import a.factory.SmsSender;

/**
 * Created by maomao on 17/8/9.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
