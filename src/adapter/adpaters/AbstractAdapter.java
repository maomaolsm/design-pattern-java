package adapter.adpaters;

import adapter.PassportService;

public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {

    public String loginForRegist(String username, String password) {
        if (null == password) {
            password = "123456";

        }
        super.regist(username, password);
        return super.login(username, password);
    }

}
