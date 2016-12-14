package factory.ordinary;

/**
 * Created by maomao on 16/12/12.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
