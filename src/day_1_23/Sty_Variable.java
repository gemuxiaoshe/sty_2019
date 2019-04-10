package day_1_23;
/**
 * 变量与常量。
 * @author MaYaP
 *标识符与关键字，
 *标识符相当于名字，用来标识类名，方法名，数组名，文件名等的有效字符序列。
 *java语言规定标识符由任意顺序的字母，下划线，美元符号和数字组成。
 *并且第一个字符通常不能是数字，并且标识符不能是Java中保留的关键字。
 *关键字是java语言中已经被赋值的特定的一些单词。不能使用这些关键字作为标识符使用。
 */
public class Sty_Variable {
    final double Pi=3.14;   // 声明属于成员变量（这里指的是变量的适用范围）的常量时，必须在声明时就赋初始值。
    
    int x=10; // 声明成员变量。
    static int y=100;  // 声明静态变量（成员变量），并且静态变量貌似只能在类体里声明，。
    public static void main(String[] args) {    //  主方法。
        final int M; // 声明局部常量，此时不需要在声明时赋值，可以单独赋值。
        M=10; //  给常量M赋值。
        
      int x1; // 声明局部变量。
       int y1;  // 声明局部变量。
       x1=20*y; // 赋值，使用静态变量y。并且发现，成员变量无法在主方法里调用，即主方法里无法调用x。
       y1=x1*100;   // 赋值。
       System.out.println("y1="+y1);  // 输出y1的值。
       System.out.println("y="+y);   // 输出y的值。
       Var_text(); // 调用静态方法。
    }
    /*
     * 定义静态方法，
     * 发现在类体内也只能定义静态方法，才能在主方法里实现调用。
     * 这意味着想要实现方法的调用基本只能使用静态方法了。
     */
    public static void Var_text() {
        int x2=10; //  声明局部变量。
        int y2; //  声明局部变量。
//        x2=10+x;    // 静态方法中也无法调用成员变量，貌似静态方法中只允许调用静态变量。
        y2=x2+y;    // 赋值。在静态方法里使用静态变量y。
//        System.out.println(x2);
        System.out.println("Var_text()静态方法的y2="+y2); // 输出y2的值。
    }
    
    /*
     * 通过测试，得到结论，成员变量基本没有太大的应用。
     * 因为在主方法里并不能使用成员变量。
     * 通过观察发现，成员变量不能在静态方法里被调用，
     * 因为主方法也是静态方法，并且在定义的静态方法里，成员变量也无法调用。
     * 得到结论，静态方法只能调用静态变量。静态方法也只能调用静态方法，无法调用实例方法。
     */
    
}
