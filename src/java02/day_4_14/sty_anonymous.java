package java02.day_4_14;

/**
 * @outhor xiaoshe
 * @date 2019/4/15  - @time 1:55
 * �����ڲ���
 */
public class sty_anonymous {
    public void outman(man m){
        System.out.println(m.toout());
    }
    public static void main(String[] args) {
        sty_anonymous styAnonymous = new sty_anonymous();
        // �����ڲ����ʹ��
        styAnonymous.outman(new man() {
            @Override
            String sex() {
              return "��";
            }
            @Override
            String name() {
            return "����";
            }
            @Override
            String toout() {
                return(this.name()+"\n"+this.sex());
            }
        });  // ͨ�������ڲ����������ֱ��ʵ����������.
    }
}
// ����һ��������
abstract class man{
    private String name;
    private String sex;
    abstract String sex(); // ����һ�����󷽷�
    abstract String name(); // ����һ�����󷽷�
    abstract String toout();
}