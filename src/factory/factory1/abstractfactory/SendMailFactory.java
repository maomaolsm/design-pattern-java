package factory.factory1.abstractfactory;

import factory.factory1.MailSender;
import factory.factory1.Sender;

/**
 * Created by maomao on 17/8/9.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
