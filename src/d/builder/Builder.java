package d.builder;

import a.factory.MailSender;
import a.factory.Sender;
import a.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maomao on 17/8/9.
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
        for (Sender sender : list) {
            sender.send();
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

}
