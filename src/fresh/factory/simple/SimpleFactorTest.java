package fresh.factory.simple;

/**
 * Created by maomao on 2018/4/1.
 */
public class SimpleFactorTest {
    public static void main(String[] args) {
        //û�ù���֮ǰ��������Ҫ�Լ�ȥnewһ���ֻ�
        //System.out.println(new Huawei());

        //����򵥹���ģʽ��ֻ��Ҫ����ȥnewһ������
        //�û�����Ҫ�����������̣�ֻ��Ҫ���Ľ��
        SimpleFactor factor =new SimpleFactor();
        System.out.println(factor.getPhone("��Ϊ"));

    }
}
