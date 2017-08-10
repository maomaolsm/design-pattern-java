package a.factory.staticfactory;

import a.factory.MailSender;
import a.factory.Sender;
import a.factory.SmsSender;

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
