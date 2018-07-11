package fresh.factory.simple;

/**
 * Created by maomao on 2018/4/1.
 */
public class SimpleFactorTest {
    public static void main(String[] args) {
        //没用工厂之前，我们需要自己去new一个手机
        //System.out.println(new Huawei());

        //引入简单工厂模式，只需要我们去new一个工厂
        //用户不需要关心生产过程，只需要关心结果
        SimpleFactor factor =new SimpleFactor();
        System.out.println(factor.getPhone("华为"));

    }
}
