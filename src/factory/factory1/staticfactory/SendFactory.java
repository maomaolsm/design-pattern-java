package factory.factory1.staticfactory;

import factory.factory1.MailSender;
import factory.factory1.Sender;
import factory.factory1.SmsSender;

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
