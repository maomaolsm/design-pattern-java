package old.abstractfactory;

import old.factory.MailSender;
import old.factory.Sender;

/**
 * Created by maomao on 17/8/9.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
