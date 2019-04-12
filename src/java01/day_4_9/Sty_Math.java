package java01.day_4_9;

import My_tools.Boundlinetool;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * @outhor xiaoshe
 * @date 2019/4/10  - @time 19:06
 * ��ѧ������Math
 * Math���еĴ����������������Ϊ��̬��.
 * ��������ò���Ҫͨ��ʵ��������������.
 * Math��Ϊ�����ṩ������ѧ�ϵ��ڶ����㷽��
 */
public class Sty_Math {
    final  double Pi = Math.PI;  // �����ڶ��峣����ʱ�����Math���еĳ���.
    public static void main(String[] args) {
        Sty_Math styMath = new Sty_Math();
        styMath.styMathconstant(12);
        Boundlinetool.Minus();
        styMath.styTriangle(0.34,60);
        Boundlinetool.Minus();
        styMath.styindex(2,4);
        Boundlinetool.Minus();
        styMath.styAdjustment(3.45,5.3f);
        Boundlinetool.Minus();
        styMath.stytakequals(23.14,45.23);
        Boundlinetool.Minus();
        styMath.styrandom();
        Boundlinetool.Minus();
        styMath.styRandom(100);
        Boundlinetool.Minus();
        styMath.styBigInteger();
        Boundlinetool.Minus();
        styMath.styBigDecimal();
    }

    // �������������Բ���.
    private void styMathconstant(float r){
    double aarea = Math.PI*r*r;  // Ҳ����ֱ���ڳ����е���Math���еĳ���.
        System.out.println(aarea);
    }
    // ���Ǻ�������
    private void styTriangle(double subtense,double angdeg){
        System.out.println(Math.sin(subtense)); // ��������
        System.out.println(Math.cos(subtense)); // ��������
        System.out.println(Math.tan(subtense)); // ��������
        System.out.println(Math.asin(subtense)); // ����һ��ֵ�ķ�����
        System.out.println(Math.acos(subtense)); // ����һ��ֵ�ķ�����
        System.out.println(Math.atan(subtense)); // ����һ��ֵ�ķ�����
        System.out.println(Math.toRadians(angdeg)); // ���Ƕ�ת��Ϊ����
        System.out.println(Math.toDegrees(angdeg)); // ������ת��Ϊ�Ƕ�
    }
    // ָ����������
    private void styindex(double adouble,double adouble1){
        System.out.println(Math.exp(adouble)); // ���ڻ�ȡe��a�η�
        System.out.println(Math.log(adouble)); // ����ȡ��Ȼ����,lna��ֵ
        System.out.println(Math.log10(adouble)); // ����ȡ����Ϊ10������
        System.out.println(Math.sqrt(adouble)); // ����ȡa��ƽ����,����a��ֵ����Ϊ��ֵ.
        System.out.println(Math.cbrt(adouble)); // ����ȡa��������
        System.out.println(Math.pow(adouble,adouble1)); // ����ȡa��b�η�
    }
    // ȡ����������
    private void styAdjustment(double adouble,float afloat){
        System.out.println(Math.ceil(adouble)); // ���ش��ڵ��ڲ�������С����.
        System.out.println(Math.floor(adouble)); // ����С�ڵ��ڲ������������.
        System.out.println(Math.rint(adouble)); // �����������ӽ�������(��Ϊ0.5ȡż��,����һ)
        System.out.println(Math.round(adouble)); // ����������0.5������������������
        System.out.println(Math.round(afloat)); // ����������0.5�󷵻���������������,Ȼ��ǿתΪ������.
    }
    /**
     *  ȡ���ֵ,��Сֵ,����ֵ��������.
     *  �䷽���������ж�����͵�,���㲻ͬ���Ͳ����������Сֵ,����ֵ�Ļ�ȡ.
     */
    private void stytakequals(double adouble,double adouble1){
        System.out.println(Math.max(adouble,adouble1)); // ȡ����double�Ͳ��������ֵ
        System.out.println(Math.min(adouble,adouble1));
        System.out.println(Math.abs(adouble)); // ����double�Ͳ����ľ���ֵ
    }
    /**
     * �����
     * Math�������ṩrandom���������������.
     * �÷���Ĭ������0.0-1.0֮���double�������.
     * ���÷���ͨ��������ǿ��������κη�Χ���������.
     * ;���÷���*n��ǿתΪint�����,���Եõ�0-n��Χ�������.
     * ��m+(int)Math.random()*n,�������ʽ��+m��,�Ϳ��Եõ�m-(m+n)��Χ�������.
     */
    private void styrandom(){
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));
        System.out.println((int)(10+Math.random()*15));
        System.out.println((char)('a'+ Math.random()*('z'-'a'+1))); // ������ʵ���Է�װ��һ����ȡ�̶���Χ������ַ�.
    }
    /**
     * Random��
     * Random���ṩ��������������Ĺ��췽��
     * ͨ��ʵ�����������.
     * ��Math.random��Ϊǿ��.
     */
    private void styRandom(int n){ // �������n ���Ʒ�Χ
        Random random = new Random(10000);
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());
    }
    /**
     * �����ֵ�����
     * BigInteger���ṩ�����ֽ�Integer���ṩ�Ĵ�Ķ�,����֪��int�����ֵΪ2^31-1,
     * �����Ҫ��������ֵ���������Ҫ�õ�BigInteger��,
     * BigInteger��֧���κξ��ȵ�����,
     * �൱����������,BigInteger���Ϳ��Ծ�ȷ��ʾ�κδ�С������ֵ.������ʧ��Ϣ.
     * BigInteger��ķ���ͨ��ʵ�����������.
     * BigInteger�໹�ṩ���˶����������.
     */
    private void styBigInteger(){
        BigInteger bigInteger = new BigInteger("12345678901234567890"); // ֱ��ͨ�����취����,��ֵתΪBigInteger��.
        BigInteger bigInteger1 = new BigInteger("43534645376574567314253543");
        System.out.println(bigInteger.add(bigInteger1)); // �򵥵�����
    }
    private void styBigDecimal(){
        BigDecimal bigDecimal = new BigDecimal(1231234345634.546756734563);
        BigDecimal bigDecimal1 = new BigDecimal("124235345645765.783452352342534");
        System.out.println(bigDecimal.max(bigDecimal1));
    }
}
