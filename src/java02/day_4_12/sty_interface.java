package java02.day_4_12;

/**
 * @outhor xiaoshe
 * @date 2019/4/13  - @time 1:35
 */
public class sty_interface {
    public static void main(String[] args) {
        // Ȼ�����ͨ��ʵ�����ӿڵ�ʵ����Ķ���,�������䷽��,
        achieveman achieveman = new achieveman();
        achieveman.eat();
        achieveman.work();
    }
}
// ����һ��man�ӿ�
interface man{
    public void eat();  // ���󷽷�
    public void work();
}
class achieveman implements man {
// �̳нӿں�,�ӿ��ڵķ��������ȫ��ʵ��
    @Override
    public void eat() {
        System.out.println("���˳Է�");
    }
    @Override
    public void work() {
        System.out.println("���˹���");
    }
}
