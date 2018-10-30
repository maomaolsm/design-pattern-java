package factory.factory2.abstr;

import factory.factory2.Huawei;
import factory.factory2.Oppo;
import factory.factory2.Phone;
import factory.factory2.Xiaomi;

/**
 * Created by maomao on 2018/4/1.
 */
public class PhoneFactor extends AbstractFactor {
    @Override
    public Phone getHuawei() {
        return new Huawei();
    }

    @Override
    public Phone getOppo() {
        return new Oppo();
    }

    @Override
    public Phone getXiaomi() {
        return new Xiaomi();
    }
}
