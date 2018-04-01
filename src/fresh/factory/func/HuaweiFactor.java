package fresh.factory.func;

import fresh.factory.Huawei;
import fresh.factory.Phone;

/**
 * Created by maomao on 2018/4/1.
 */
public class HuaweiFactor implements Factor {
    @Override
    public Phone getPhone() {
        return new Huawei();
    }
}
