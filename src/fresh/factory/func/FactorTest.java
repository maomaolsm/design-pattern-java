package fresh.factory.func;

/**
 * Created by maomao on 2018/4/1.
 */
public class FactorTest {
    public static void main(String[] args) {

        Factor factor = new HuaweiFactor();
        System.out.println(factor.getPhone());
    }
}
