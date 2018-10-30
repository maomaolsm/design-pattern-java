package factory.factory1;

/**
 * Created by maomao on 16/12/12.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
