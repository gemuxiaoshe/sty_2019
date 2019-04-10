package day_1_23;
/**
 * 运算符
 * @author MaYaP
 *运算符是一些特殊的符号，主要用于数学函数，一些类型的赋值语句和逻辑比较方面。
 *java中提供丰富的运算符，如赋值运算符，比较运算符等。
 */
public class Sty_Operator {

    
    public static void main(String[] args) {
        // 1.赋值运算符"="。
        int a=1,b=2;  // 声明变量a,b并赋初值。
        int flag; // 声明一个中间变量。
        /*
         * 赋值运算符最常见的应用。
         * 通过赋值运算符"="实现两个变量值的互换。
         */
        flag=a;
        a=b;
        b=flag;
        System.out.println("a="+a+"b="+b);
        
        // 2. 算术运算符"+ - * / %"。
     
        int c=2+3;
        int c2=2-3;
        int c3=-2+1;
        int c4=-5-3;
        int c5=-2-3+6;
        System.out.println("c="+c+" ,c2="+c2+"  ,c3="+c3+"  ,c4="+c4+"  ,c5="+c5);
        /*
         *  一个变量不能直接和一个非当前变量类型的数进行运算。
         *  必须是同类型的两个数之间才能进行运算。
         */
        float d=2+13.25f; 
       double d2=2-12.345;
        int e=2*3;
        System.out.println("d="+d+" ,d2="+d2+"  ,e="+e);
/*
 * 虽然两个不同类型的数不能进行运算，
 * 但显然，同种类型的两个数经过运算并不一定会得到一个同种类型的数。
 * 而这种情况却是被允许的，那么又会产生什么结果呢?我们输出看看。
 */
        int f=3/4;   
        int f2=4/3;
        System.out.println("f="+f+" ,f2="+f2);
        /*
         * 得到的结果是f=0;f2=1;我们再使用double型变量来看看其具体的值为多少。
         * 当两个整数相除时，必须在后面加上d或D来获取double型的结果。
         * 不然其仍然会使用int型进行判断。得到0.0;1.0的结果。
         * 因此，我们知道整数型的判断机制应该是保留整数部分，小数部分忽略。
         */
        double f8=3/4; 
        double f9=4/3;
        double f3=3/4d; 
        double f4=4/3d;
        double f5=4/3.23;  // 在使用混合相除时则不会出现问题。
        float f6=4/3;
        float f10=3/4;
        float f7=4/3f;
        System.out.println("f8="+f8+" ,f9="+f9);
        System.out.println("f3="+f3+" ,f4="+f4+" ,f5="+f5);
        System.out.println("f6="+f6+" ,f7="+f7+" ,f10="+f10);
        /*
         * 同样的，我们通过使用double型和float型变量校验了除法的问题。
         * 显而易见的，我们可以得到相关的结论。
         * 1，不管是定义的是double型还是float型变量，如果是两个整数相除而在后面不加上相关的标识字符（d,D,f,F），
         * 其会默认为int型数运算，且返回的只是一个小数形式的整数而已。
         * 因此其实也可以认为double和float型其实是包含int型数据的，毕竟double和float只是范围比int更广而已。
         * 所以其运算机制包括int型也应当是理所当然的。
         * 2，我们可以从上面的输出中了解到double型和float型数据的根本区别，
         * 我们常说double型数和float型数的根本区别就是精度不double是双精度，float是单精度。
         * 从这里我们可以显而易见的看出，所谓的精度就是其允许判断的小数点后的最大位数。
         * double的双精度是精确到小数点后16位（其判断机制应该是只截取到当前位为止）。
         * 那么float型为什么称为单精度，恰好是double型的一半呢，
         * 在这里，float型明显只精确到小数点后7位，刚好相差一位才是double型的一半啊。
         * 但我们可以明显观察到double型和float型数据最后一位的区别。他们并不相同。
         * 显然float型的最后一位4是根据小数点后第8位进行判断后增加了一位得到的。
         * 而double型最后一位并不是4，说明double型采取的机制和float型并不相同，double型只是截取了小数后16位。
         * 而float型却不同，是根据小数后第8位进行判断向前取整得到的。
         * 因此我们可以知道，原来如此。这样一来的话，float型的精确度正好是double型的一半是8位，而不是7位！。
         * 所以我们常说double型是双精度，float型是单精度。
         * 那么它们孰优孰劣呢，显然它们适用的范围是不一样的，需要我们根据情况选择使用哪种类型。
         * 根据它们的根本区别，我们可以很容易的想到，
         * double型的优点是精度大，适合需要超过8位以上更精确类型的数据时使用，
         * 但很显然，它的精度比float型大一倍，意味着它所需要分配的内存空间要比float大一倍！
         * 而float型精度低，但内存占用小。
         * 这使得我们在操作数据的时候，特别是数据库存储的时候，需要考虑到数据所必须要的精度。
         * 来确定合适的数据类型来进行数据操作。
         */
        int g=4%10;
        int g2=4%3;
        int g3=4%5;
        int g4=15%10;
        System.out.println("g="+g+" ,g2="+g2+" ,g3="+g3+" ,g4="+g4);
        
     Operator_Increase();
     ComparisonOperator(); 
     LogicalOperator();
     BitOperator();
    }
       /*
         * 3.自增和自减运算符++，--。自增和自减运算符是单目运算符，对一个数进行操作。
         * 自增自减可以放在操作数的前面，也可以放在后面。但其放的位置，使得其运算的顺序和结果并不相同。
         * 自增自减运算符在循环中经常被用到。
         */
    public static void Operator_Increase() {
        int a=1;
        int b,c;
//        b=a++;   将a先赋值给b;再进行自增加1。
        b=++a;  // 先自增加1，再赋值给b.
        System.out.println(b);
        // 
        for(int i=0;i++<5;i++){
           System.out.println(i);
        }
        System.out.println("------------------------分界线-----------------------");
        for(int i=0;++i<5;++i){
            System.out.println(i);
        }
        /*
         * 通过输出发现，在for循环中，i++，++i的结果是相同的，
         * 但通过自增自减运算符的机制与for循环的机制可以显而易见的知道，它们两个是不同的运算机制。
         * 在进行i++循环时，其会产生一个临时变量转存中间变量i。
         * 在调用之后再加1所以相比较来说，++i的效率是要比i++略高一些的。
         */
     
    }
    /*
     * 比较运算符
     * 比较运算符属于二元运算符，用于程序中的变量之间，变量和自变量之间以及其他类型的信息之间的比较。
     * 比较运算符的运算结果是boolean型的。当运算符对应的关系成立时，结果为true，否则为false。
     * 所有的比较运算符通常作为判断的条件用在条件语句中，比较运算符共有六个。
     */
    public static void ComparisonOperator() {
        int a=1,b=3;  // 声明两个用于判断的变量。
        boolean c;    // 声明一个boolean型变量c。
        c=a<b;          //      小于比较运算符，判断a是否小于b。
        System.out.println("c1="+c);
        c=a>b;          //   大于比较运算符，判断a是否大于b。
        System.out.println("c2="+c);
        c=a>=b;         //   大于等于比较运算符，判断a是否大于或等于b。
        System.out.println("c3="+c);
        c=a<=b;         // 小于等于比较运算符，判断a是否小于或等于b。
        System.out.println("c4="+c);
        c=a!=b;         // 不等于比较运算符，判断a是否与b不等。
        System.out.println("c5="+c);
        c=a==b;       // 等于比较运算符，判断a是否与b相等。
        System.out.println("c6="+c);
        /*
         * 通过输出可以看出在java程序中，程序是按顺序运行的。
         * 所以在这里的c不需要声明成不同的变量，通过输出的顺序控制，就可以将不同阶段的c输出。
         */
    }
    
    /*
     * 逻辑运算符
     * 返回类型为布尔值的表达式，如比较运算符，可以被组合在一起构成一个更复杂的表达式。
     * 这是通过逻辑运算符来实现的， 逻辑运算符包括逻辑与（&）逻辑或（||）逻辑非（！）。
     * 逻辑运算符的操作单元必须是boolean型数据。
     * 在逻辑运算符中，除了！是一元运算符外，其他的都是二元运算符。
     */
    public static void LogicalOperator() {
        int a=1,b=2,c=3,d=4;
        boolean a1=true,b1=false;
        boolean x;
       x=a>b&&c>d;
       System.out.println("x1="+x);
       x=a>b||c>d;
       System.out.println("x2="+x);
       x=!(a>b);
       System.out.println("x3="+x);
        x=a1&b1;
        System.out.println("x4="+x);
        x=a1||b1;
        System.out.println("x5="+x);
        x=!a1;
        System.out.println("x6="+x);
        x=a1&&b1||a1!=b1;
        System.out.println("x7="+x);
    }
    public static void BitOperator() {
        int a=1,a1;  
        int b='a',b1;
        
        a1=a&5;  // 按位与运算，双目运算符，如果两个整数型数据a,b对应位都是1，则结果为1，否则为0。
        System.out.println("a1="+a1);
        a1=a|5;     // 按位或运算，双目运算符，如果两个操作数对应位都是0，则结果位为0，否则为1。
        System.out.println("a2="+a1);
        a1=~a;      // 按位取反运算，单目运算符，就是取反值的意思，将操作数中的0改为1,1改为0。
        System.out.println("a3="+a1);
        a1=10^a;    // 按位异或运算，双目运算符，当两个操作数的二进制表示相同时（同为0或1）结果取0，否则取1。
        System.out.println("a4="+a1);
        a1=a<<1; // 移位运算符，左移n相当于乘以2的n次方，右移n相当于除以2的n次方。
        System.out.println("a5="+a1);
        a1=a>>2; //  移位运算符，左移n相当于乘以2的n次方，右移n相当于除以2的n次方。
        System.out.println("a6="+a1);
        a1=a<<3;
        System.out.println("a7="+a1);
        b1=b<<1;
        System.out.println("b="+b);
        System.out.println("b1="+b1);
        char c=127;
        System.out.println("c="+c);
    }
}
