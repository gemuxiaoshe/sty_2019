package day_1_24;
/**
 * java���Ի�����С����ϰ��
 * @author MaYaP
 *java���Ի�����Ҫ����java���ԵĻ����������ͣ������볣���Լ����������֪ʶ�㡣
 *String�Ͳ�����java���ԵĻ����������͡�
 *��ʹ�ñ���ʱ����Ҫע�������ȡֵ��Χ���������ֱ��������˷��ڴ���Դ��
 */
public class Text_JavaLanguageFoundation {
/*
 * ���ֻ����������͵������ϰ��
 */
    public static void Text_1(){
        System.out.println("byte�����ֵ��"+Byte.MAX_VALUE+"��Сֵ��"+Byte.MIN_VALUE);
        System.out.println("byte���ֽ�����bytes����"+Byte.BYTES);
        System.out.println("byte��λ�����֣���"+Byte.SIZE);
        System.out.println("short�����ֵ��"+Short.MAX_VALUE+"��Сֵ��"+Short.MIN_VALUE);
        System.out.println("short���ֽ�����bytes����"+Short.BYTES);
        System.out.println("short��λ�����֣���"+Short.SIZE);
        System.out.println("char�����ֵ��"+Character.MAX_VALUE+"��Сֵ��"+Character.MIN_VALUE);
        System.out.println("character(char)���ֽ�����bytes����"+Character.BYTES);
        System.out.println("char��λ�����֣���"+Character.SIZE);
        System.out.println("int�����ֵ��"+Integer.MAX_VALUE+"��Сֵ��"+Integer.MIN_VALUE);
        System.out.println("integer(int)���ֽ�����bytes����"+Integer.BYTES);
        System.out.println("int��λ�����֣���"+Integer.SIZE);
        System.out.println("long�����ֵ��"+Long.MAX_VALUE+"��Сֵ��"+Long.MIN_VALUE);
        System.out.println("long���ֽ�����bytes����"+Long.BYTES);
        System.out.println("long��λ�����֣���"+Long.SIZE);
        System.out.println("float�����ֵ��"+Float.MAX_VALUE+"��Сֵ��"+Float.MIN_VALUE);
        System.out.println("float���ֽ�����bytes����"+Float.BYTES);
        System.out.println("float��λ�����֣���"+Float.SIZE);
        System.out.println("double�����ֵ��"+Double.MAX_VALUE+"��Сֵ��"+Double.MIN_VALUE);
        System.out.println("double���ֽ�����bytes����"+Double.BYTES);
        System.out.println("double��λ�����֣���"+Double.SIZE);
        byte a=127;
        short a1=32767;
        int a2=2147483647;
        long a3=5435664;
       System.out.println(a+a1);
       System.out.println(a2+a3);
        float f=123.123456789f;
        double f1=123.123456789012346789;
        System.out.println(f);
        System.out.println(f1);
    }
    /*
     * ���ڱ����������ϰ��
     */
    static int x=10,y=20; // ��������������̬��Ա������ȫ�ֱ����������������ڱ����ã�Ҳ�����ⲿ����á�
    public static void Text_2() {
        int a=2,b=3,c; // �����ֲ�������
        c=a+b; // �������ڣ��ֲ������ĵ��á�
        System.out.println(c);
        c=x+a*y; // ��̬�����е��þ�̬��Ա������
        System.out.println(c);
    }
    
    public static void Text_3() {
        byte a1=127;
        short a2=3435;
        long a3=243435463;
        int x=a1;
        System.out.println("x1="+x);
        x=a2;
        System.out.println("x2="+x);
        x=(int) a3;
        System.out.println("x3="+x);
    }
    /*
     * �����������ڳ�������С�
     */
    public static void main(String[] args) {
//     Text_1();
        Text_2();
        Text_3();
    }
}
