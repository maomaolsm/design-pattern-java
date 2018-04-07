package old.factory.ordinary;

import old.factory.MailSender;
import old.factory.Sender;
import old.factory.SmsSender;

/**
 * Created by maomao on 16/12/12.
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
