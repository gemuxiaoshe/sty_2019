package java02.day_4_12;

import My_tools.Boundlinetool;
import My_tools.FormatTimetool;

/**
 * @outhor xiaoshe
 * @date 2019/4/12  - @time 21:36
 */public class sty_extends {
    public
 static void main(String[] args) {
        father father = new father("С��ĸ���", "����");
        son son = new son("С��", "��", "����Ա");
        System.out.println(father.getName());
        father.work();
        Boundlinetool.Minus();
        System.out.println(son.getName());
        son.work();
    }
}
// ��������
class father{
    private String name;
    private String work;
    // ��Ա����
    public String getName() {
        return name;
    }
    public String getWork() {
        return work;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWork(String work) {
        this.work = work;
    }
    //���췽��
    public  father(String name,String work){
        this.work=work;
        this.name=name;
    }
    // ��������
    public void work(){
        System.out.println(this.work);
    }
}
// ��������
class son extends father{  // ͨ��extends �̳и���
     private String sex;  // ���������.

    // ��д���췽��,���Բ����̳��˸�������,�����������������.
    public son(String name, String sex,String work) {
        super(name, work);
        this.sex=sex;
    }
    @Override
    // ֱ�ӵ��ø���ĳ�Ա����,��ȡ�����ó�Ա����.
    public String getName() {
        return super.getName();
    }
    // ��д�����work����
    @Override
    public void work(){
        System.out.println("����"+super.getName()+"�Ĺ�����:"); // ��д����
       super.work();  // ֱ�ӵ��ø��෽��.
    }
}

