package a.factory.multiple;

import a.factory.MailSender;
import a.factory.Sender;
import a.factory.SmsSender;

/**
 * Created by maomao on 17/8/9.
 */
public class SendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
