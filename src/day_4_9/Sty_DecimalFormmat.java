package day_4_9;

import java.text.DecimalFormat;

/**
 * @outhor xiaoshe
 * @date 2019/4/9  - @time 10:47
 * ���ָ�ʽ����
 */
public class Sty_DecimalFormmat {
    public static void main(String[] args) {
        Sty_DecimalFormmat digitalProcessing = new Sty_DecimalFormmat();
        digitalProcessing.NumFormating("000,000.0000",12345.67);
        digitalProcessing.NumFormating1("###,###.####",12345.67);
        digitalProcessing.NumFormating("###,###.####kg",12345.67);
        System.out.println();
        digitalProcessing.NumFormating("#.###%",0.345);
        digitalProcessing.NumFormating("0.000%",0.345);
        System.out.println();
        digitalProcessing.NumFormating("0.0000\u2030",0.123456);
        digitalProcessing.NumFormating("#.####\u2030",0.123456);
        System.out.println();
        digitalProcessing.NumFormating("000,000,000.0000\u00A4",1234567.89);
        digitalProcessing.NumFormating("###,###,###.##'#'",1234567.89);
    }

    // ��һ�ָ�ʽ������,ֱ��ͨ�����췽�������ʽ���Ʋ���patten.
    private void NumFormating(String patten, double adouble){  // ������������,��һ�����Ƹ�ʽ,�ڶ���Ϊ�������ֵ.
    DecimalFormat format = new DecimalFormat(patten);
    System.out.println(format.format(adouble)); // ͨ��format������ʽ������adouble
    }
    // �ڶ��ָ�ʽ������,ͨ����ķ���applyPattern���������ʽ���Ʋ���patten
    private void NumFormating1(String patten,double adouble){
    DecimalFormat format = new DecimalFormat();
    format.applyPattern(patten);
    System.out.println(format.format(adouble)); // ͨ��format����,��ʽ������adouble
    }
}
