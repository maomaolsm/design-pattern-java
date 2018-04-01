package fresh.factory.abstr;

import fresh.factory.Huawei;
import fresh.factory.Oppo;
import fresh.factory.Phone;
import fresh.factory.Xiaomi;

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
