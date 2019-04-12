package java01.day_4_3;
import java.util.Scanner;

/**
 * @outhor xiaoshe
 * @date 2019/4/3  - @time 18:29
 * 字符串的学习
 */
public class Sty_String {

    public static void main(String[] args) {
        Sty_String styString = new Sty_String();
        styString.sty_createString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入主字符串:");
        String mstr = scanner.nextLine();
        System.out.println("输入需要查询的字符(或字符串):");
        String instr = scanner.next();
        System.out.println("输入指定字符的位置:");
        int aint = scanner.nextInt();
        styString.Sty_getStringInfo(mstr,instr,aint);
        styString.sty_setString(mstr);
    }

    /**
     * String类中的两种构造字符串的方法.
     */
    public void sty_createString(){
        String astr= "hello"; // 引用字符串常量创建一个字符串变量.
        char a[] = {'a','b','c'};  // 字符数组
        byte b[] = {2,54,23,12};  // byte型数组
        /**
         * String(char[])构造方法,将字符数组所有的值连接起来创建一个字符串对象.
         * */
        String s=new String(a);

        /**
         *  String(char a[],int offset,int length)方法
         *  抽取字符数组中的一段字符创建字符串对象.offset 开始截取的位置.
         */
        String astr3 = new String(a,0,2);
        String astr4 = new String(b);
        String astr5 = new String(b,0,2);
        System.out.println(astr+"\n"+astr3+"\n"+astr4+"\n"+astr5);
    }
    /**
     * 获取字符串信息
     */
    public void Sty_getStringInfo(String mstr ,String Instr,int aint){

        // 获取字符串长度.length()方法
        System.out.println("主字符串的长度是"+mstr.length());
        // 检索字符串 ,indexOf()方法,lastIndex()方法
        int fint = mstr.indexOf(Instr);
        int lint = mstr.lastIndexOf(Instr);
        System.out.println(Instr+"字符(串)首次出现的位置是:"+fint);
        System.out.println(Instr+"字符(串)最后出现的位置是:"+lint);
        //获取指定位置的字符,charAt()方法
        char setchar = mstr.charAt(aint);
        System.out.println(aint+"位置的字符是:"+setchar);
    }
    /**
     * 字符串操作
     */
    public void sty_setString(String mstr){
        /**
         * 获取子字符串 substring()方法,按下标值截取子字符串,下标是由0开始的.
         * substring()方法有两种不同的重载方法,分别代表两种不同的截取方式.
         */

        String cstr = mstr.substring(3); // substring(int beginindex),传一个int型参数,表示从参数开始截取到结尾.
        String cstr2 = mstr.substring(3,6); // substring(int beginindex,int endindex)两个参数,表示截取两个参数之间的字符串.
        System.out.println("从第3开始获取子字符串"+cstr);
        System.out.println("截取3到6字符串"+cstr2);


        //去除空格,trim()方法可以直接返回字符串的副本,忽略前导和尾部空格.通常用于储存信息时,去除首尾无意义的空格.
        String vstr = mstr.trim();
        System.out.println("去除首位空格的字符串副本:"+vstr);

        //字符串替换,replace()方法可以实现将指定字符或字符串替换成新的字符串.replace(char oldchar,char newchar)
        String nstr= mstr.replace('a','b');
        String nstr2 = mstr.replace("str","asr");
        System.out.println("替换后的字符串"+nstr);
        System.out.println("替换后的字符串"+nstr2);

        //判断字符串是否相等,equals()方法用于比较两个字符串是否相等.
        System.out.println("字符串是否和abc相等:"+mstr.equals("abc"));
        System.out.println("字符串是否和abc相等:"+(mstr=="abc"));

        //判断字符串的开始结尾 startsWith(),endsWith()方法分别判断字符串是否以指定的形式结束.返回值为布尔类型.
        System.out.println("字符串是否以a开始:"+mstr.startsWith("a"));
        System.out.println("字符串是否以.结束:"+mstr.endsWith("."));

        /**
         * 按字典顺序比较两个字符串,compareTo()方法为按字典排序比较两个字符串,比较是其unicode值.
         * 将两个String对象表示的字符序列与参数字符串所表示的字符串序列进行比较.
         * 按字符序列,如果String对象在参数字符序列的前面,返回一个负值,在后面返回一个正值,如果相等,则返回0
         */
        System.out.println("与字符串hyz按字典排序相比较"+mstr.compareTo("hyz"));

        //字母大小写转换,toLowerCase(),toUpperCase()方法.前者将字符串所有字符大写改为小写,后者从小写改为大写.
        System.out.println("字符串全转为小写:"+mstr.toLowerCase());
        System.out.println("字符串全转为大写:"+mstr.toUpperCase());

        //字符串分割split()方法,重载有两种不同的分割方式,split(String regex)参数为指定的分割符,
        String[] regexmstr = mstr.split("e");
        String[] regexmstr2 = mstr.split("e",3);
        for (String a: regexmstr){  // 对字符串数组遍历打印.
            System.out.print("["+a+"]");
        }
        System.out.println(); // 换行
        for (String a:regexmstr2){
            System.out.print("["+a+"]");
        }
    }
}
