package day_1_16;
//������������ѧϰ�Ĳ�����
public class Sty_DateTypeText {                             //��������
	public static void main(String[] args) {               // ������
	    byte mybyte = 124;                                           // ����byte����������ֵ��
	    short myshort = 32564;                                    //
	    int myint = 457845435;                                    //
	    long result = mybyte + myshort + myint;           //����long����������ǰ���������ĺ͸�ֵ������
//	    System.out.println(result);                                //���long�ͱ�����
	    
	    //�ַ���char��Unicode����λ�õĻ���ת����
	    char word = 'd',word2 = '@';                              
	    int p = 12435,p1 = 34524;
	    // ���ø�ʽǿת���鿴�ַ���Unicode��Ķ�Ӧλ�á�
//	    System.out.println((int)word);
//	    System.out.println((int)word2);
//	    System.out.println((char)p);
//	    System.out.println((char)p1);
//	    
	    //����һЩ�ַ���java���������⺬�壬��һ���ַ���Ϊת���ַ���
	    
	    char c = '\\';           //   ��б��
	    char c1 = '\123';    //    �˽�������ʾ���ַ�
	    char c2 = '\u2605';//  16��������ʾ���ַ�
	    char c3 = '\b';        //  �˸�
	    char c4 = '\t';        //  ��ֱ�Ʊ����������Ƶ���һ���Ʊ����λ�á�
	    char c5= '\r';         //  �س�
	    char c6 = '\n';        // ����
	    char c7 = '\f';        //  ��ҳ
	    
	    System.out.println(c2);
	}
	
	
}
