package fresh.factory.abstr;

/**
 * Created by maomao on 2018/4/1.
 */
public class Test {
    public static void main(String[] args) {

        //对用户而言更加简单，用户只有选择的权利，保证了程序的健壮
        PhoneFactor factor=new PhoneFactor();
        System.out.println(factor.getHuawei());
    }
}
