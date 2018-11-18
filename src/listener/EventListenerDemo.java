package listener;

import java.beans.PropertyChangeSupport;

/**
 * 事件监听模式
 * <p/>
 * {@link java.util.EventObject} 标准的事件对象
 * {@link java.util.EventListener} 标准的事件监听对象
 * <p/>
 * Created by maomao on 2018/11/18.
 *
 * @see java.util.EventListener
 */
public class EventListenerDemo {
    public static void main(String[] args) {

        Person person = new Person();

        // java beans 规范 -> 内省
        // PropertyChangeEvent 广播源
        // PropertyChangeListener 注册器

        PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(person);

        // 注册
        propertyChangeSupport.addPropertyChangeListener("name",
            (event) -> {
                Person bean = (Person) event.getSource();
                System.out.printf("Person[%s] 的 name 属性，老值：%s，新值：%s\n",
                    bean, event.getOldValue(), event.getNewValue());

                System.out.println(bean.getName());
            });

        // 触发事件
        propertyChangeSupport.firePropertyChange("name", null, "maomao");

    }

    /**
     * POJO Setter/Getter
     */
    private static class Person {

        private String name;

        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}