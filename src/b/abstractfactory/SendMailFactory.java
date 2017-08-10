package b.abstractfactory;

import a.factory.MailSender;
import a.factory.Sender;

/**
 * Created by maomao on 17/8/9.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
