package java01.day_4_1;  // 包名

import java.util.Date;

/**
 * @outhor xiaoshe
 * @date 2019/4/1  - @time 20:01
 * Java语言基础练习，
 * 包括：主类结构，基本数据类型，变量与常量，运算符，数据类型的转换。
 */

public class sty_foundation {  // 主类 sty_foundation。
    static String author ="小舍先生";  // 静态成员变量的声明，在类体中，可以跨类调用。
    int Time=5; // 声明普通的成员变量。

    // 定义main主方法，这里主方法是一个静态的。
    public static void main(String[] args){
        // 先实例化一个对象，然后调用其实例方法。
        sty_foundation foundation = new sty_foundation();
        //调用方法。
        foundation.sty_integer(); // 整数类型方法。

        // 通过实例化对象调用方法输出两种浮点型数据。
        System.out.println("the double type:"+foundation.sty_double());
        System.out.println("the float type:"+foundation.sty_float());

        foundation.sty_char(); // 字符类型方法
        foundation.sty_boolean();// 布尔类型方法
        foundation.sty_AssignmentOperator();  //赋值运算符
        foundation.sty_ArithmeticOperators(); //算数运算符
        foundation.sty_Self_IDOperators(); //自增自减运算符
        foundation.sty_ComperisonOperators(); // 比较运算符
        foundation.sty_LogicalOperators(); // 逻辑运算符
        foundation.sty_BitOperators(); // 位运算符
        foundation.sty_shiftOperators(); // 移位运算符
        foundation.sty_TernaryOprator(); // 三元运算符
        foundation.sty_Dataconversion(); // 数据类型转换
    }
    // 类体内，可以声明多个方法体，但只有主方法才能被执行，
    /**
     * 整数类型。
     * 根据占用内存大小分为 byte，short，int，long。
     */
    public void sty_integer(){
        // 几种基本整型数据类型的定义与输出,数据类型的选择通常需要考虑所储存的数据的大小范围。
        // 基本数据类型的变量的定义，在这里也相当于是一些局部变量的声明，在方法体内。
        //局部变量的生命周期与其调用有关，在调用它时，JVM为其分配空间，在方法结束后，就会释放掉。
        byte abyte=34;
        short ashort=14556;
        int aint=34546453;
        long along = -34358234;
        // 输出，可以让字符串和变量多层复合输出。
        System.out.println("abyte:"+abyte+"ashort:"+ashort+"aint:"+aint+"along:"+along);
    }
    /**
     * 浮点类型
     * 浮点类型表示有小数部分的数，
     * Java语言浮点类型分为单精度浮点类型（float）双精度浮点类型（double）
     * 它们具有不同的取值范围
     * @return
     */
    public double sty_double(){
        double adouble=23.14356;
        return adouble;
    }
    public float sty_float(){
        float afloat = 34.2343f;
        return afloat;
    }
    /**
     * char型用于储存单个字符，占用2个字节（byte）16位（bit）。
     * 在定义字符型变量时，要使用单引号表示。
     * 也可通过整数表示。
     */
    public void sty_char(){
        // 声明字符型变量。java语言也可以将字符作为整数对待，unicode编码可以储存65536个字符。
        // 我们可以通过char转换0~65536之间的任意字符。
        char achar ='b';
        char achar1 = 34564;
        System.out.println("the char:"+achar);
        System.out.println("the char1:"+achar1);
    }
    /**
     * boolean数据类型（逻辑类型），只有true和false两个值。
     * boolean类型不能和整数类型转换。
     * boolean类型通常用在流程控制中作为判断条件。
     */
    public void sty_boolean(){
        boolean c;
        int a=3,b=4;
        boolean aboolean = a>b;
        System.out.println(aboolean);
    }
    /**
     * 赋值运算符
     * =表示，是一个二元运算符
     * 其功能是将右边的操作数的值赋给左边的操作数
     * 可以复合多重使用
     */
    public void sty_AssignmentOperator(){
        int a,b=4;
        a = b=b+4;
        System.out.println("a="+a+"b="+b);
    }
    /**
     * 算数运算符
     * java中的算数运算符主要有加减乘除取余。
     * 二元运算符。
     */
    public void sty_ArithmeticOperators(){
        float afloat = 45.346f;
        int aint = 35;
        System.out.println("afloat+aint="+(afloat+aint));
        System.out.println("afloat-aint="+(afloat-aint));
        System.out.println("afloat*aint="+(afloat*aint));
        System.out.println(("afloat/aint="+afloat/aint));
        System.out.println("afloat%aint="+(afloat%aint));
    }
    /**
     * 自增自减运算符
     * 单目运算符
     * 放在操作数前，先加减后运算，放在操作数后，先运算后加减
     * 操作数必须是一个整型或浮点型变量
     */
    public void sty_Self_IDOperators(){
        int a=4;
        int b=++a;
        System.out.println("b=++a:"+b);
        a=4;
        b=a++;
        System.out.println("b=a++:"+b);
        System.out.println("a="+a);
    }
    /**
     * 比较运算符
     * 二元运算符
     * 用于变量，自变量之间的比较
     * 结果位布尔型
     */
    public void sty_ComperisonOperators(){
    int a=4,b=6;
    boolean aboolean = a<b;
    boolean aboolean1 = a>b;
    boolean aboolean2 = a==b;
    boolean aboolean3 = a>=b;
    boolean aboolean4 = a<=b;
    boolean aboolean5 = a!=b;
        System.out.println("a<b："+aboolean);
        System.out.println("a>b："+aboolean1);
        System.out.println("a==b："+aboolean2);
        System.out.println("a>=b："+aboolean3);
        System.out.println("a<=b："+aboolean4);
        System.out.println("a!=b："+aboolean5);
    }
    /**
     * 逻辑运算符
     * 返回值位布尔值的表达式如比较运算符，可以组合在一起构成一个更复杂的表达式。
     * 就是通过逻辑运算符来实现的。
     * 逻辑运算符包括：&，&&（逻辑与），||（逻辑或），！（逻辑非）
     * 逻辑运算符操作元必须是Boolean型数据。
     * 在逻辑运算符除了！是医院运算符，其他都是二元运算符。
     */
    public void sty_LogicalOperators(){
        int a=2,b=5;
        boolean aboolean = ((a>b)&&(a!=b));
        boolean aboolean1 =((a>b)||(a!=b));
        System.out.println("逻辑与："+aboolean);
        System.out.println("逻辑||："+aboolean1);
    }
    /**
     * 位运算符
     * 按位与，两个整型数据对应位都是1，则结果位为1，否则为0。
     * 按位或，两个整型数据对应位都是0，则结果位0，否则为1。
     * 按位取反，就是将操作数中的1改为0，0改为1.
     * 按位异或，当两个操作数的对应位相同的时，结果为0，否则为1。
     */
    public void sty_BitOperators(){
        int a=6,b=4;
        System.out.println("a=6,b=4按位与："+(a&b));
        System.out.println("a=6,b=4按位或："+(a|b));
        System.out.println("a=6按位取反："+~a);
        System.out.println("a6,b=4按位异或："+(a^b));
    }
    /**
     * 移位运算符
     * << 左移，>>右移，>>>无符号右移
     * 移位运算符适用于整数类型
     * 移位可以实现乘除2^n的效果
     */
    public void sty_shiftOperators(){
        int a=4;
        System.out.println("a=4右移："+(a>>1));
        System.out.println("a=4左移："+(a<<1));
    }
    /**
     * 三元运算符
     * 条件式？值1：值2，当关系式结果为true时取值1，否则取值2。
     * 三元运算符等价于if...esle语句。。
     */
    public void sty_TernaryOprator(){
        boolean b=20<45?true:false;
        System.out.println(b);
    }
    /**
     * 数据类型转换
     * 隐式类型转换，低级类型向高级类型转换时，系统自动执行。
     * 显示类型转换，即强制类型转换,高精度变量的值赋给低精度的变量。
     * 显示类型转换会导致信息损失，除了Boolean型，其他数据类型都可以通过强制类型转换得到。
     */
    public void sty_Dataconversion(){
        // 声明不同数据类型变量
        byte abyte=125;
        int aint = 234;
        float afloat = 345.342f;
        char achar = 30;
        double adouble = 312.56;

        System.out.println("byte型与float型相加："+(abyte+afloat)); // 隐式类型转换
        System.out.println("byte型与char型相加："+(abyte+achar));
        System.out.println("int型与double相加："+(aint+adouble));

        System.out.println("char强制类型转换为int："+(int) achar); // 强制类型转换
        System.out.println("double强制类型转换为int："+(int) adouble);
    }
}
