package factory.factory1.staticfactory;

import factory.factory1.Sender;

/**
 * Created by maomao on 17/8/9.
 * 静态工厂方法模式
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
