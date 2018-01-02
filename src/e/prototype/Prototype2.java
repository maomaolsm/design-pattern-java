package e.prototype;

import java.io.*;

/**
 * Created by maomao on 17/12/27.
 * 原型模式
 */
public class Prototype2 implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private String string;

    private SerializableObject obj;

    //浅复制
    public Object clone() throws CloneNotSupportedException {
        Prototype2 prototype2 = (Prototype2) super.clone();
        return prototype2;
    }

    //深复制
    public Object deepClone() throws IOException, CloneNotSupportedException, ClassNotFoundException {

        //写入当前对象的二进制流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        //读出二进制流产生的新对象
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

    public String getString(String string) {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}
