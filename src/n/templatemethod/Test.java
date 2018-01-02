package n.templatemethod;

/**
 * Created by maomao on 17/12/27.
 * 模板方法模式
 */
public class Test {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
