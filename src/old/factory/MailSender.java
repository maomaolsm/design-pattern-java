package old.factory;

/**
 * Created by maomao on 16/12/12.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
