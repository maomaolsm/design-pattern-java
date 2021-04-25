package adapter.adpaters;

public interface ILoginAdapter {

    boolean support(Object adapter);

    String login(String id, Object adapter);

}
