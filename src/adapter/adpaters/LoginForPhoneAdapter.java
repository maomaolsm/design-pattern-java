package adapter.adpaters;

public class LoginForPhoneAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForPhoneAdapter;
    }

    @Override
    public String login(String id, Object adapter) {
        return super.loginForRegist(id, null);
    }
}
