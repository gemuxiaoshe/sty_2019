package day_1_23;
//import day_1_23.Sty_Variable;
/**
 * 常量及变量的测试类。
 * @author MaYaP
 */
public class Sty_VariableText { // 类体
    int x=10;
    int y=20;
    
    public void main() {
        int x; // 当定义的局部变量与成员变量相同时，成员变量将暂时隐藏，
                // 在该方法体内将无法再调用该成员变量。
        x=10*y; // 赋值，使用成员变量。
        int y1=x*y;
        System.out.println(x);
        int x1=x*y+text();
        System.out.println(x1);
    }
    
    public int text() {
        int x1=x+123;
        return x1;
    }
    
    static int a=12;
    
    public static int text2() {
        int x1=a+3;
        return x1;
    }
    public static void main(String[] args) {
        int x=a*2;
        int y=x*text2();  // 调用当前类的静态方法。
        int z=y+Sty_Variable.y; // 调用Sty_Variable类的静态变量y。
        
//        static int b=2;   在静态方法和实例方法中都无法声明静态变量。
//        说明静态方法只能声明在类体中，并且也说名了静态变量的性质。
//        它最低也只能作为成员变量而存在。
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        Sty_Variable.Var_text(); // 调用Sty_Variable类的静态方法Var_text()；
        
        System.out.println("Sty_Variable类的静态变量y="+Sty_Variable.y); // 直接输出Sty_Variable类的静态变量y。
    }
    /*
     * 显而易见的，成员变量只能在实例方法中被调用。而无法在静态方法中调用，
     * 同样的，实例方法也只能在当前类的实例方法中被调用，而无法在静态方法中被调用。
     * 但在在这种情况下的方法，该类下的实例方法却是无法运行的，因为java类的结构限制。
     * java类的结构包括属性和方法，
     * 而一个java主类，必须有固定形式的主方法，才能够被运行。
     * 而这个java主方法又是一个静态的方法。使得它只能调用静态的成员变量，和静态的方法。
     * 这使得java主类有了天然的限制，只能运行静态变量和静态方法。
     * 
     * 而实例方法和实例变量。虽说不是没有实现的地方，但暂时不知道其具体能起到的作用是什么。
     * 
     */
}
