package fresh.prototype.deep;

/**
 * Created by maomao on 2018/4/7.
 *
 * spring中大部分的原型模式，用的反射
 *
 * 这个例子用的序列化
 */
public class Test {
    public static void main(String[] args) {

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {

            QiTianDaSheng qiTianDaSheng1 = (QiTianDaSheng) qiTianDaSheng.clone();

            System.out.println(qiTianDaSheng.jinGuBang == qiTianDaSheng1.jinGuBang);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
