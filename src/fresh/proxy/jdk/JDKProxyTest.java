package fresh.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by maomao on 2018/4/14.
 * 在代理之前，所有的东西都是未知的（自动化）
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        Person object = (Person) new JDK58().getInstance(new ZhangSan());
        System.out.println(object.getClass());
        object.findJob();


        //字节码重组的原理
        //1、拿到被代理对象的引用，并且获取到他的所有接口，反射获取
        //2、JDK Proxy类重新生成一个新的类，同时新的类要实现被代理类所有实现的所有接口
        //3、动态生成java代码，把自己新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
        //4、编译新生成的java代码 .class
        //5、再重新加载到jvm中运行


        //jdk中有个规范，只要是$开头的一般都是自动生成的（$Proxy0），0是第0个自动生成的类

        //通过反编译工具可以看到源代码
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
