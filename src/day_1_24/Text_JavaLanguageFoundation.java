package day_1_24;
/**
 * java语言基础的小结练习。
 * @author MaYaP
 *java语言基础主要包括java语言的基本数据类型，变量与常量以及运算符三大知识点。
 *String型并不是java语言的基本数据类型。
 *在使用变量时，需要注意变量的取值范围，否则会出现编译错误或浪费内存资源。
 */
public class Text_JavaLanguageFoundation {
/*
 * 几种基本数据类型的相关练习。
 */
    public static void Text_1(){
        System.out.println("byte型最大值："+Byte.MAX_VALUE+"最小值："+Byte.MIN_VALUE);
        System.out.println("byte型字节数（bytes）："+Byte.BYTES);
        System.out.println("byte型位数（字）："+Byte.SIZE);
        System.out.println("short型最大值："+Short.MAX_VALUE+"最小值："+Short.MIN_VALUE);
        System.out.println("short型字节数（bytes）："+Short.BYTES);
        System.out.println("short型位数（字）："+Short.SIZE);
        System.out.println("char型最大值："+Character.MAX_VALUE+"最小值："+Character.MIN_VALUE);
        System.out.println("character(char)型字节数（bytes）："+Character.BYTES);
        System.out.println("char型位数（字）："+Character.SIZE);
        System.out.println("int型最大值："+Integer.MAX_VALUE+"最小值："+Integer.MIN_VALUE);
        System.out.println("integer(int)型字节数（bytes）："+Integer.BYTES);
        System.out.println("int型位数（字）："+Integer.SIZE);
        System.out.println("long型最大值："+Long.MAX_VALUE+"最小值："+Long.MIN_VALUE);
        System.out.println("long型字节数（bytes）："+Long.BYTES);
        System.out.println("long型位数（字）："+Long.SIZE);
        System.out.println("float型最大值："+Float.MAX_VALUE+"最小值："+Float.MIN_VALUE);
        System.out.println("float型字节数（bytes）："+Float.BYTES);
        System.out.println("float型位数（字）："+Float.SIZE);
        System.out.println("double型最大值："+Double.MAX_VALUE+"最小值："+Double.MIN_VALUE);
        System.out.println("double型字节数（bytes）："+Double.BYTES);
        System.out.println("double型位数（字）："+Double.SIZE);
        byte a=127;
        short a1=32767;
        int a2=2147483647;
        long a3=5435664;
       System.out.println(a+a1);
       System.out.println(a2+a3);
        float f=123.123456789f;
        double f1=123.123456789012346789;
        System.out.println(f);
        System.out.println(f1);
    }
    /*
     * 关于变量的相关练习。
     */
    static int x=10,y=20; // 在类体内声明静态成员变量（全局变量）可以在类体内被调用，也可在外部类调用。
    public static void Text_2() {
        int a=2,b=3,c; // 声明局部变量。
        c=a+b; // 方法体内，局部变量的调用。
        System.out.println(c);
        c=x+a*y; // 静态方法中调用静态成员变量。
        System.out.println(c);
    }
    
    public static void Text_3() {
        byte a1=127;
        short a2=3435;
        long a3=243435463;
        int x=a1;
        System.out.println("x1="+x);
        x=a2;
        System.out.println("x2="+x);
        x=(int) a3;
        System.out.println("x3="+x);
    }
    /*
     * 主方法，用于程序的运行。
     */
    public static void main(String[] args) {
//     Text_1();
        Text_2();
        Text_3();
    }
}
