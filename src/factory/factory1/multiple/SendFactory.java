package factory.factory1.multiple;

import factory.factory1.MailSender;
import factory.factory1.Sender;
import factory.factory1.SmsSender;

/**
 * Created by maomao on 17/8/9.
 * 什么是工厂:就是用一个单独类来做这个创造实例的过程
 * 例如:这个工厂类,就控制着该去实例化SmsSender还是MailSender.
 */
public class SendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
