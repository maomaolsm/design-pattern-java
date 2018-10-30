package factory.factory2.func;

import factory.factory2.Huawei;
import factory.factory2.Phone;

/**
 * Created by maomao on 2018/4/1.
 */
public class HuaweiFactor implements Factor {
    @Override
    public Phone getPhone() {
        return new Huawei();
    }
}
