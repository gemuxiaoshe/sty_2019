package java02.day_4_14;

/**
 * @outhor xiaoshe
 * @date 2019/4/14  - @time 22:33
 */
public class sty_internalClass {
    public static void main(String[] args) {
        // �����ڲ���ʵ��������ĵ�һ�ַ�ʽ..
        textclass text = new textclass(); // ʵ�����ⲿ�����
        textclass.internaltextclass internaltextclass = text.new internaltextclass();  // ʵ�����ڲ���Ķ���Ҫͨ���ⲿ�������ʵ��.
        // �����ڲ����ʵ��������ĵڶ��ַ�ʽ
        textclass.internaltextclass internaltextclass1 = new textclass().new internaltextclass();
        // ������̬�ڲ���ʵ��������
        textclass.astaticinclass astaticinclass = new textclass.astaticinclass(); // ��̬�ڲ����ʵ��������Ҫ�����ⲿ��.
    }
}

 class textclass{
    private String name;
    static private int age;
    public class internaltextclass{  // �ڲ���
        String sex="��";
        internaltextclass(){ // ���췽��
            name = "С��";
            age = 23;
        }
        void input(){
            System.out.println("�����ڲ����һ������");
            ainput();  // ����û���κ����Ƶĵ����ⲿ��ķ���.
        }
    }
     void ainput(){  // �ⲿ���һ������,�����ڲ�������Ժͷ���.
         final String[] a = new String[0];
         internaltextclass internaltextclass = new internaltextclass(); // ͨ��ʵ�����ڲ����������ڲ���ĳ�Ա����.
         internaltextclass.sex = "��";
         // ����ֲ��ڲ���
         class Localinclass{

             void Local(){
                 a[0] = "�ⲿ�������еı���";
                 System.out.println("�ֲ��ڲ����еķ���");
                 System.out.println(a[0]);
             }
         }
         //�ڷ������е��þֲ��ڲ���.
         Localinclass localinclass = new Localinclass();
         localinclass.Local();
     }

    public static class astaticinclass{
        void funtion(){
            System.out.println(age);
        }
    }

    public internaltextclass getinternaltextclass(){
        return new internaltextclass();
    }



}
