package old.abstractfactory;

import old.factory.Sender;

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
