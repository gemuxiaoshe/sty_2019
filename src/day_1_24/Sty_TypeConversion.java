package day_1_24;
/**
 * ���ݵ�����ת��
 * @author MaYaP
 *��Ϊ��ʽ����ת������ʽ����ת����
 */
public class Sty_TypeConversion {
/*
 * ��ʽ����ת����
 * �ӵͼ�������߼�����ת����ϵͳ���Զ�ִ�С�����ת����Ϊ��ʽת������������˳��Ϊ��
 * Byte<short<int<long<float<double��
 */
    public static void ImplicitTypeConversion() {
    byte a=127;  // �������ֲ�ͬ���͵ı�������ֵ�� 
    int a1=150; 
    char a4=11; 
    float a2=324.34f;   
    double a3=344.123;  
    System.out.println("byte��float��ӣ�"+(a+a2)); // �����ͬ���͵����������ĺͣ�ϵͳ���Զ���߾���ת������ʽת������
    System.out.println("byte��int��ӣ�"+(a+a1));
    System.out.println("byte��char��ӣ�"+(a+a4));
    System.out.println("double��char��ӣ�"+(a3+a4));
    }
    /*
     * ��ʽ����ת��
     * ���߾��ȵı�����ֵ�����;��ȵı���ʱ������ʹ����ʽ����ת������ǿ������ת����
     * ��ִ����ʽ����ת��ʱ���ܵ��¾�����ʧ��ֻҪ��boolean����������������֮���ת����
     * ȫ������������ʾ����ת���ķ����ﵽ�ġ�
     */
    public static void ExplicitTypeConversion() {
        int a =(int) 45.234; //ǿ������ת���������ᶪʧС����Ĳ��֣���ɾ��ȶ�ʧ��
        long y=(long) 3543.56f;
        int b = 'd';  // ����Ƚ���ֵ���char����int���ǿ��Բ���Ҫ��ǿ������ת���ģ���һ����ʽת�������͡�
        System.out.println(a);
        System.out.println(b);
        System.out.println(y);
    }
    /*
     * ���������������ڳ���ִ�С�
     */
    public static void main(String[] args) {
        ImplicitTypeConversion(); // ���÷�����
        ExplicitTypeConversion();
    }
}
