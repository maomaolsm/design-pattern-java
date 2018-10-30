package proxy.proxy2.jdk;

/**
 * Created by maomao on 2018/4/14.
 */
public class ZhangSan implements Person{

    public void findLove(){
        System.out.println("身高180");
        System.out.println("高富帅");
        System.out.println("胸大");
    }

    @Override
    public void zufangzi() {
        System.out.println("租房子");
    }

    @Override
    public void buy() {
        System.out.println("买东西");

    }

    @Override
    public void findJob() {
        System.out.println("20k月薪");
        System.out.println("找工作");

    }
}
