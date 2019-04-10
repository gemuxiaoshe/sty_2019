package day_3_30;

import My_tools.FormatTimetool;

/**
 * @outhor xiaoshe
 * @date 2019/3/30  - @time 0:27
 */
public class class_structure {  // 主类
    public static void main(String[] args) {  // 主方法。
        //显示时间的两种格式
        FormatTimetool.ShowTime_colon(); // 时:分
        FormatTimetool.ShowAlltime_colon(); // 时:分:秒
        //显示日期的两种格式
        FormatTimetool.Showdate_Minus(); // 年-月-日
        FormatTimetool.Showdate_Slash(); // 月/日/年
        // 三种显示日期时间的格式
        FormatTimetool.SdateTime_mc(); // 年-月-日 时:分
        FormatTimetool.SdateAllTime_mc(); // 年-月-日 时:分:秒
        FormatTimetool.Sdatetime_sc(); // 月/日/年 时:分
        //两种自定义日期时间输出
        FormatTimetool.Sdate_china(); // x年x月x日
        FormatTimetool.Stime_china(); // x时x分
        // 显示星期的两种格式
        FormatTimetool.ShowWeek(); // 中文星期几
        FormatTimetool.ShowWeek_e(); // 英文星期全称
    }
}
