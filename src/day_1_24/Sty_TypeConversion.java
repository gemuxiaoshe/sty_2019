package day_1_24;
/**
 * 数据的类型转换
 * @author MaYaP
 *分为隐式类型转换和显式类型转换。
 */
public class Sty_TypeConversion {
/*
 * 隐式类型转换。
 * 从低级类型向高级类型转换，系统会自动执行。这种转换称为隐式转换。精度排列顺序为：
 * Byte<short<int<long<float<double。
 */
    public static void ImplicitTypeConversion() {
    byte a=127;  // 声明各种不同类型的变量并赋值。 
    int a1=150; 
    char a4=11; 
    float a2=324.34f;   
    double a3=344.123;  
    System.out.println("byte和float相加："+(a+a2)); // 输出不同类型的两个变量的和，系统会自动向高精度转换（隐式转换）。
    System.out.println("byte和int相加："+(a+a1));
    System.out.println("byte和char相加："+(a+a4));
    System.out.println("double和char相加："+(a3+a4));
    }
    /*
     * 显式类型转换
     * 当高精度的变量的值赋给低精度的变量时，必须使用显式类型转换（即强制类型转换）
     * 当执行显式类型转换时可能导致精度损失，只要是boolean类型以外其他类型之间的转换，
     * 全部都是能以显示类型转换的方法达到的。
     */
    public static void ExplicitTypeConversion() {
        int a =(int) 45.234; //强制类型转换，不过会丢失小数后的部分，造成精度丢失。
        long y=(long) 3543.56f;
        int b = 'd';  // 这里比较奇怪的是char型向int型是可以不需要的强制类型转换的，是一个隐式转换的类型。
        System.out.println(a);
        System.out.println(b);
        System.out.println(y);
    }
    /*
     * 定义主方法，用于程序执行。
     */
    public static void main(String[] args) {
        ImplicitTypeConversion(); // 调用方法。
        ExplicitTypeConversion();
    }
}
