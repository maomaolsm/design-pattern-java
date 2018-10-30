package prototype.prototype2.simple;

/**
 * Created by maomao on 2018/4/7.
 */
public class CloneTest {
    public static void main(String[] args) {
        Prototype p = new Prototype();
        p.name = "maomao";
        p.cloneTarget=new CloneTarget();
        System.out.println(p.cloneTarget);

        try {
            Prototype prototype = (Prototype) p.clone();

            //浅克隆cloneTarget的地址一样
            System.out.println(prototype.cloneTarget);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
