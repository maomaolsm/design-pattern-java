package factory.ordinary;

/**
 * Created by maomao on 16/12/12.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("sms");
        sender.Send();
    }
}
