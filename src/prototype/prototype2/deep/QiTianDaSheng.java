package prototype.prototype2.deep;

import java.io.*;
import java.util.Date;

/**
 * Created by maomao on 2018/4/7.
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public QiTianDaSheng() {

        //这里的new只是初始化
        this.jinGuBang=new JinGuBang();
        this.birthday = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();

            copy.birthday = new Date();

            return copy;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
