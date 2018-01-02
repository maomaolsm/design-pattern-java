package a.factory.multiple;

import a.factory.Sender;

/**
 * Created by maomao on 17/8/9.
 * 多个工厂方法模式
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
