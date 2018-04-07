package old.facade;

/**
 * Created by maomao on 17/12/28.
 * 外观模式
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
