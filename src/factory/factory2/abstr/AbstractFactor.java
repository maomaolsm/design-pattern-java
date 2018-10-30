package factory.factory2.abstr;

import factory.factory2.Phone;

/**
 * 抽象工厂是用户的主入口
 * Created by maomao on 2018/4/1.
 */
public abstract class AbstractFactor {
    public abstract Phone getHuawei();

    public abstract Phone getOppo();

    public abstract Phone getXiaomi();
}
