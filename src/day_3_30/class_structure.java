package day_3_30;

import My_tools.FormatTimetool;

/**
 * @outhor xiaoshe
 * @date 2019/3/30  - @time 0:27
 */
public class class_structure {  // ����
    public static void main(String[] args) {  // ��������
        //��ʾʱ������ָ�ʽ
        FormatTimetool.ShowTime_colon(); // ʱ:��
        FormatTimetool.ShowAlltime_colon(); // ʱ:��:��
        //��ʾ���ڵ����ָ�ʽ
        FormatTimetool.Showdate_Minus(); // ��-��-��
        FormatTimetool.Showdate_Slash(); // ��/��/��
        // ������ʾ����ʱ��ĸ�ʽ
        FormatTimetool.SdateTime_mc(); // ��-��-�� ʱ:��
        FormatTimetool.SdateAllTime_mc(); // ��-��-�� ʱ:��:��
        FormatTimetool.Sdatetime_sc(); // ��/��/�� ʱ:��
        //�����Զ�������ʱ�����
        FormatTimetool.Sdate_china(); // x��x��x��
        FormatTimetool.Stime_china(); // xʱx��
        // ��ʾ���ڵ����ָ�ʽ
        FormatTimetool.ShowWeek(); // �������ڼ�
        FormatTimetool.ShowWeek_e(); // Ӣ������ȫ��
    }
}
