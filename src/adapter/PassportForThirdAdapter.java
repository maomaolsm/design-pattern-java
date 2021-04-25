package adapter;

import adapter.adpaters.ILoginAdapter;
import adapter.adpaters.LoginForPhoneAdapter;

/**
 * 适配器
 */
public class PassportForThirdAdapter implements IPassportForThird {
    @Override
    public String loginForQQ(String openId) {
        return processLogin(openId, LoginForPhoneAdapter.class);
    }

    @Override
    public String loginForPhone(String phone) {
        return processLogin(phone, LoginForPhoneAdapter.class);
    }

    private String processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(id, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
