package day_1_16;
/**
 * 基本的整数类型
 * @author MaYaP
 *在java中有8种基本的数据类型来存储数值，字符和布尔值。
 *数值型最多包括五种：整数型（byte，short，int，long）浮点型（float，double）
 *字符型，布尔型。
 */
public class Sty_DataType {
	public static void main(String[] args) {
	//整型变量的定义的几种方式。需要注意的是变量的取值范围，超出取值范围就会出错，。
		int x;
		int x1,y;
		int x2=340;
		int y1=240;
		int x3=240,y2=350;
		//当给一个long型变量赋值超过int型范围时，需要在值后面加上l或L表示是长整数，否则报错，。
		long num = 2147483650L;
		// 浮点类型表示有小数部分的数字，
		//在java中，浮点类型分为单精度与双精度浮点类型，他们具有不同的取值范围。
		float f1 = 13.543f;       // 在给float型小数赋值时必须在后面加f或F；否则会默认为double型数据报错。
		double d1 = 3424.342d;
		double d2 = 433245.234245;
		
		// 字符型char，用于储存单个字符，占用16个字节的内存空间。在定义字符变量的时候，要以单引号表示。
		char a = 'a';
		char a2 = 97; // 字符表中，97表示的就是a，所以也可以以字符表中的位置给char型赋值。
		int x4 = 'b';
		System.out.println(x4);
		System.out.println((int)a);   // 显而易见的，也可以通过强制类型转化，来实现字符和字符表位置之间的转换。
		 
		//还有一些字符在java中有着特殊含义，这一类字符成为转义字符。
		
		char c = '\\';           //   反斜杠
        char c1 = '\123';    //    八进制数表示的字符
        char c2 = '\u2605';//  16进制数表示的字符
        char c3 = '\b';        //  退格
        char c4 = '\t';        //  垂直制表符，将光标移到下一个制表符的位置。
        char c5= '\r';         //  回车
        char c6 = '\n';        // 换行
        char c7 = '\f';        //  换页
        
		// 关于布尔类型，布尔类型又称为逻辑类型，通过boolean来定义布尔类型变量，
        // 只有两个值true和false两个值。
        
        boolean b;  // 单独定义布尔类型变量b。
        boolean b1,b2;  // 同时定义布尔类型变量b1，b2；
        boolean b3=true;    // 定义布尔类型变量b并赋初始值true。
        
        b=false;    // 给变量b赋值。
	}
}
