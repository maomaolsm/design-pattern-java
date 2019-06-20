package factory.factory1.abstractfactory;

import factory.factory1.Sender;

/**
 * Created by maomao on 17/8/9.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
