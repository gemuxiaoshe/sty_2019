package My_tools; // ������,�ҵĹ�����

import java.util.Date;
import java.util.Locale;

/**
 * @outhor xiaoshe
 * @date 2019/4/5  - @time 1:22
 * ������ʽʱ��Ĺ�����.
 * ֮ǰѧ���ĸ�ʽ������ʱ��,,������֪��,����ʱ��ı�ʾ,������Ҫ����ʹ�õ�,����������Ϊ��̬����,��Ϊ��������ʹ��.
 */
public class FormatTimetool {

    static Date date = new Date();  // ʵ����һ����̬��Date����.

    //��ʱ�䰴24Сʱ��,��:���ʽ���
    public static void ShowTime_colon(){
        System.out.println(String.format("%tR",date));
    }
    //��ʱ�䰴24Сʱ��,��ʱ:��:��ĸ�ʽ�������
    public static void ShowAlltime_colon(){
        System.out.println(String.format("%tT",date));
    }
    //��ʱ�䰴����,��:��-��-�յĸ�ʽ���.
    public static void Showdate_Minus(){
        System.out.println(String.format("%tF",date));
    }
    // ��ʱ�䰴б��,����/��/��ĸ�ʽ���
    public static void Showdate_Slash(){
        System.out.println(String.format("%tD",date));
    }
    // ����-��-�յĸ�ʽ�����ں�ʱ:�ֵĸ�ʽ��ʱ��������
    public static void SdateTime_mc(){
        System.out.println(String.format("%tF",date)+" "+String.format("%tR",date));
    }
    // ����-��-�յĸ�ʽ�����ں�ʱ:��:��ĸ�ʽ��ʱ��������
    public static void SdateAllTime_mc(){
        System.out.println(String.format("%tF",date)+" "+String.format("%tT",date));
    }
    //����/��/��ĸ�ʽ�����ں�ʱ:�ֵĸ�ʽ��ʱ��������
    public static void Sdatetime_sc(){
        System.out.println(String.format("%tD",date)+" "+String.format("%tR",date));
    }

    //Ӣ���µĵ����ڼ�ȫ�����
    public static void ShowWeek_e(){
        System.out.println(String.format(Locale.ENGLISH,"%tA",date));
    }
    //����������ڼ�
    public static void ShowWeek(){
        System.out.println(String.format(Locale.CHINA,"%tA",date));
    }

    // ���̶���ʽ���: x��x��x��;xʱx��;
    public static void Sdate_china(){
        String ayear = String.format("%tY",date);
        String amonth = String.format("%tm",date);
        String aday = String.format("%te",date);
        System.out.println(ayear+"��"+amonth+"��"+aday+"��");
    }
    //���̶���ʽ���:xʱx��
    public static void Stime_china(){
        String ahour = String.format("%tH",date);
        String aminute = String.format("%tM",date);
        System.out.println(ahour+"ʱ"+aminute+"��");
    }
}
