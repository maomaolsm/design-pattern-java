package old.factory.staticfactory;

import old.factory.MailSender;
import old.factory.Sender;
import old.factory.SmsSender;

/**
 * Created by maomao on 17/8/9.
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
