package java02.day_4_13;

/**
 * @outhor xiaoshe
 * @date 2019/4/13  - @time 23:05
 * ��ĸ߼�����
 */

public class sty_Object{
// Ĭ�������,�̳�Object��,����ֱ�ӵ���Object���еķ���
public static void main(String[] args) {
    sty_Object sty_classfeature = new sty_Object();
// ����ʵ�������������Ӧ�ĵ��������.
    System.out.println(sty_classfeature.getClass().getName());
    System.out.println(sty_classfeature.equals("123"));
    // toString ����
    System.out.println(sty_classfeature.toString());
}
}
// ͨ��extends��,�̳�Object��,��������д���еķ���.
class text extends Object{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

