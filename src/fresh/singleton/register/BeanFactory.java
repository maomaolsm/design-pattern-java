package fresh.singleton.register;

import com.sun.glass.ui.ClipboardAssistance;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by maomao on 2018/4/7.
 * spring中就是用这种注册式的单例
 */
public class BeanFactory {

    private BeanFactory() {
    }

    //线程安全
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {

        if (ioc.containsKey(className)) {
            return ioc.get(className);
        } else {
            try {
                Object object = Class.forName(className).newInstance();
                return ioc.put(className, object);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;

        }
    }

}
