package java02.day_4_12;

/**
 * @outhor xiaoshe
 * @date 2019/4/13  - @time 0:55
 * ������
 */
public class sty_Polymorphism {
    public static void main(String[] args) {
        woman woman = new woman("Ů", "��"); // ���ܲ���ʵ��������,������ʵ�����������.
        System.out.println(woman.getSex()); // ����ֱ�ӵ��ó���������ķ���.
        System.out.println( woman.getColor()); // ����ֱ�ӵ��ó���������ķ���.
    }
}
// �������������
abstract class humanity{  // abstact�ؼ����������������
    private String sex;
    private String color;
    public String getSex() {
        return sex;
    }
    public String getColor() {
        return color;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setColor(String color) {
        this.color = color;
    }
   humanity(String sex,String color){  //���췽��
        this.color=color;
        this.sex=sex;
   }
    @Override
    public String toString() {  //��дtoString����
        return("�Ա�:"+this.sex+"��ɫ:"+this.color);
    }
}
class woman extends humanity{  // �̳г�����.woman�������Ϊhumanity���һ������,���������ת��.
    woman(String sex, String color) {  // ����Ҫ�й��췽��.
        super(sex, color);
    }
}