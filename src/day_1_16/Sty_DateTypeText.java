package day_1_16;
//关于数据类型学习的测试类
public class Sty_DateTypeText {                             //创建方法
	public static void main(String[] args) {               // 主方法
	    byte mybyte = 124;                                           // 声明byte变量，并赋值。
	    short myshort = 32564;                                    //
	    int myint = 457845435;                                    //
	    long result = mybyte + myshort + myint;           //声明long变量，并将前三个变量的和赋值给它。
//	    System.out.println(result);                                //输出long型变量。
	    
	    //字符型char与Unicode表中位置的互相转换。
	    char word = 'd',word2 = '@';                              
	    int p = 12435,p1 = 34524;
	    // 利用格式强转来查看字符和Unicode表的对应位置。
//	    System.out.println((int)word);
//	    System.out.println((int)word2);
//	    System.out.println((char)p);
//	    System.out.println((char)p1);
//	    
	    //还有一些字符在java中有着特殊含义，这一类字符成为转义字符。
	    
	    char c = '\\';           //   反斜杠
	    char c1 = '\123';    //    八进制数表示的字符
	    char c2 = '\u2605';//  16进制数表示的字符
	    char c3 = '\b';        //  退格
	    char c4 = '\t';        //  垂直制表符，将光标移到下一个制表符的位置。
	    char c5= '\r';         //  回车
	    char c6 = '\n';        // 换行
	    char c7 = '\f';        //  换页
	    
	    System.out.println(c2);
	}
	
	
}
