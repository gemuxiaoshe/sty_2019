package java01.day_4_1;  // ����

import java.util.Date;

/**
 * @outhor xiaoshe
 * @date 2019/4/1  - @time 20:01
 * Java���Ի�����ϰ��
 * ����������ṹ�������������ͣ������볣������������������͵�ת����
 */

public class sty_foundation {  // ���� sty_foundation��
    static String author ="С������";  // ��̬��Ա�������������������У����Կ�����á�
    int Time=5; // ������ͨ�ĳ�Ա������

    // ����main��������������������һ����̬�ġ�
    public static void main(String[] args){
        // ��ʵ����һ������Ȼ�������ʵ��������
        sty_foundation foundation = new sty_foundation();
        //���÷�����
        foundation.sty_integer(); // �������ͷ�����

        // ͨ��ʵ����������÷���������ָ��������ݡ�
        System.out.println("the double type:"+foundation.sty_double());
        System.out.println("the float type:"+foundation.sty_float());

        foundation.sty_char(); // �ַ����ͷ���
        foundation.sty_boolean();// �������ͷ���
        foundation.sty_AssignmentOperator();  //��ֵ�����
        foundation.sty_ArithmeticOperators(); //���������
        foundation.sty_Self_IDOperators(); //�����Լ������
        foundation.sty_ComperisonOperators(); // �Ƚ������
        foundation.sty_LogicalOperators(); // �߼������
        foundation.sty_BitOperators(); // λ�����
        foundation.sty_shiftOperators(); // ��λ�����
        foundation.sty_TernaryOprator(); // ��Ԫ�����
        foundation.sty_Dataconversion(); // ��������ת��
    }
    // �����ڣ�����������������壬��ֻ�����������ܱ�ִ�У�
    /**
     * �������͡�
     * ����ռ���ڴ��С��Ϊ byte��short��int��long��
     */
    public void sty_integer(){
        // ���ֻ��������������͵Ķ��������,�������͵�ѡ��ͨ����Ҫ��������������ݵĴ�С��Χ��
        // �����������͵ı����Ķ��壬������Ҳ�൱����һЩ�ֲ��������������ڷ������ڡ�
        //�ֲ�����������������������йأ��ڵ�����ʱ��JVMΪ�����ռ䣬�ڷ��������󣬾ͻ��ͷŵ���
        byte abyte=34;
        short ashort=14556;
        int aint=34546453;
        long along = -34358234;
        // ������������ַ����ͱ�����㸴�������
        System.out.println("abyte:"+abyte+"ashort:"+ashort+"aint:"+aint+"along:"+along);
    }
    /**
     * ��������
     * �������ͱ�ʾ��С�����ֵ�����
     * Java���Ը������ͷ�Ϊ�����ȸ������ͣ�float��˫���ȸ������ͣ�double��
     * ���Ǿ��в�ͬ��ȡֵ��Χ
     * @return
     */
    public double sty_double(){
        double adouble=23.14356;
        return adouble;
    }
    public float sty_float(){
        float afloat = 34.2343f;
        return afloat;
    }
    /**
     * char�����ڴ��浥���ַ���ռ��2���ֽڣ�byte��16λ��bit����
     * �ڶ����ַ��ͱ���ʱ��Ҫʹ�õ����ű�ʾ��
     * Ҳ��ͨ��������ʾ��
     */
    public void sty_char(){
        // �����ַ��ͱ�����java����Ҳ���Խ��ַ���Ϊ�����Դ���unicode������Դ���65536���ַ���
        // ���ǿ���ͨ��charת��0~65536֮��������ַ���
        char achar ='b';
        char achar1 = 34564;
        System.out.println("the char:"+achar);
        System.out.println("the char1:"+achar1);
    }
    /**
     * boolean�������ͣ��߼����ͣ���ֻ��true��false����ֵ��
     * boolean���Ͳ��ܺ���������ת����
     * boolean����ͨ���������̿�������Ϊ�ж�������
     */
    public void sty_boolean(){
        boolean c;
        int a=3,b=4;
        boolean aboolean = a>b;
        System.out.println(aboolean);
    }
    /**
     * ��ֵ�����
     * =��ʾ����һ����Ԫ�����
     * �书���ǽ��ұߵĲ�������ֵ������ߵĲ�����
     * ���Ը��϶���ʹ��
     */
    public void sty_AssignmentOperator(){
        int a,b=4;
        a = b=b+4;
        System.out.println("a="+a+"b="+b);
    }
    /**
     * ���������
     * java�е������������Ҫ�мӼ��˳�ȡ�ࡣ
     * ��Ԫ�������
     */
    public void sty_ArithmeticOperators(){
        float afloat = 45.346f;
        int aint = 35;
        System.out.println("afloat+aint="+(afloat+aint));
        System.out.println("afloat-aint="+(afloat-aint));
        System.out.println("afloat*aint="+(afloat*aint));
        System.out.println(("afloat/aint="+afloat/aint));
        System.out.println("afloat%aint="+(afloat%aint));
    }
    /**
     * �����Լ������
     * ��Ŀ�����
     * ���ڲ�����ǰ���ȼӼ������㣬���ڲ��������������Ӽ�
     * ������������һ�����ͻ򸡵��ͱ���
     */
    public void sty_Self_IDOperators(){
        int a=4;
        int b=++a;
        System.out.println("b=++a:"+b);
        a=4;
        b=a++;
        System.out.println("b=a++:"+b);
        System.out.println("a="+a);
    }
    /**
     * �Ƚ������
     * ��Ԫ�����
     * ���ڱ������Ա���֮��ıȽ�
     * ���λ������
     */
    public void sty_ComperisonOperators(){
    int a=4,b=6;
    boolean aboolean = a<b;
    boolean aboolean1 = a>b;
    boolean aboolean2 = a==b;
    boolean aboolean3 = a>=b;
    boolean aboolean4 = a<=b;
    boolean aboolean5 = a!=b;
        System.out.println("a<b��"+aboolean);
        System.out.println("a>b��"+aboolean1);
        System.out.println("a==b��"+aboolean2);
        System.out.println("a>=b��"+aboolean3);
        System.out.println("a<=b��"+aboolean4);
        System.out.println("a!=b��"+aboolean5);
    }
    /**
     * �߼������
     * ����ֵλ����ֵ�ı��ʽ��Ƚ�����������������һ�𹹳�һ�������ӵı��ʽ��
     * ����ͨ���߼��������ʵ�ֵġ�
     * �߼������������&��&&���߼��룩��||���߼��򣩣������߼��ǣ�
     * �߼����������Ԫ������Boolean�����ݡ�
     * ���߼���������ˣ���ҽԺ��������������Ƕ�Ԫ�������
     */
    public void sty_LogicalOperators(){
        int a=2,b=5;
        boolean aboolean = ((a>b)&&(a!=b));
        boolean aboolean1 =((a>b)||(a!=b));
        System.out.println("�߼��룺"+aboolean);
        System.out.println("�߼�||��"+aboolean1);
    }
    /**
     * λ�����
     * ��λ�룬�����������ݶ�Ӧλ����1������λΪ1������Ϊ0��
     * ��λ�������������ݶ�Ӧλ����0������λ0������Ϊ1��
     * ��λȡ�������ǽ��������е�1��Ϊ0��0��Ϊ1.
     * ��λ��򣬵������������Ķ�Ӧλ��ͬ��ʱ�����Ϊ0������Ϊ1��
     */
    public void sty_BitOperators(){
        int a=6,b=4;
        System.out.println("a=6,b=4��λ�룺"+(a&b));
        System.out.println("a=6,b=4��λ��"+(a|b));
        System.out.println("a=6��λȡ����"+~a);
        System.out.println("a6,b=4��λ���"+(a^b));
    }
    /**
     * ��λ�����
     * << ���ƣ�>>���ƣ�>>>�޷�������
     * ��λ�������������������
     * ��λ����ʵ�ֳ˳�2^n��Ч��
     */
    public void sty_shiftOperators(){
        int a=4;
        System.out.println("a=4���ƣ�"+(a>>1));
        System.out.println("a=4���ƣ�"+(a<<1));
    }
    /**
     * ��Ԫ�����
     * ����ʽ��ֵ1��ֵ2������ϵʽ���Ϊtrueʱȡֵ1������ȡֵ2��
     * ��Ԫ������ȼ���if...esle��䡣��
     */
    public void sty_TernaryOprator(){
        boolean b=20<45?true:false;
        System.out.println(b);
    }
    /**
     * ��������ת��
     * ��ʽ����ת�����ͼ�������߼�����ת��ʱ��ϵͳ�Զ�ִ�С�
     * ��ʾ����ת������ǿ������ת��,�߾��ȱ�����ֵ�����;��ȵı�����
     * ��ʾ����ת���ᵼ����Ϣ��ʧ������Boolean�ͣ������������Ͷ�����ͨ��ǿ������ת���õ���
     */
    public void sty_Dataconversion(){
        // ������ͬ�������ͱ���
        byte abyte=125;
        int aint = 234;
        float afloat = 345.342f;
        char achar = 30;
        double adouble = 312.56;

        System.out.println("byte����float����ӣ�"+(abyte+afloat)); // ��ʽ����ת��
        System.out.println("byte����char����ӣ�"+(abyte+achar));
        System.out.println("int����double��ӣ�"+(aint+adouble));

        System.out.println("charǿ������ת��Ϊint��"+(int) achar); // ǿ������ת��
        System.out.println("doubleǿ������ת��Ϊint��"+(int) adouble);
    }
}
