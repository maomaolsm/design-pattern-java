package adapter.adpaters;

public class LoginForQQAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public String login(String id, Object adapter) {
        return super.loginForRegist(id, null);
    }
}
