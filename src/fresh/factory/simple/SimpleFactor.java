package fresh.factory.simple;

import fresh.factory.Huawei;
import fresh.factory.Phone;

/**
 * Created by maomao on 2018/4/1.
 */
public class SimpleFactor {
    public Phone getPhone(String name) {
        if ("华为".equals(name)) {
            return new Huawei();
        } else {
            return null;
        }
    }
}
