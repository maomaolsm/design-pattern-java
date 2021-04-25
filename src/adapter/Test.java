package adapter;

public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForPhone("123");
    }
}
