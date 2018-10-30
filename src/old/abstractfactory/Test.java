package old.abstractfactory;

import factory.factory1.Sender;

/**
 * Created by maomao on 17/8/9.
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
