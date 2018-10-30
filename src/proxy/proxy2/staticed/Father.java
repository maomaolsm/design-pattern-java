package proxy.proxy2.staticed;

/**
 * Created by maomao on 2018/4/14.
 */
public class Father {

    private Son son;

    //没有办法扩展
    public Father(Son son){
        this.son=son;
    }

    //目标对象的引用拿到
    public void fingLove(){
        System.out.println("根据你的要求物色");
        son.findLove();
        System.out.println("双方父母是不是同意");
    }
}
