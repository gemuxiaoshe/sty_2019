package java02.day_4_14;

/**
 * @outhor xiaoshe
 * @date 2019/4/14  - @time 22:33
 */
public class sty_internalClass {
    public static void main(String[] args) {
        // 创建内部类实例化对象的第一种方式..
        textclass text = new textclass(); // 实例化外部类对象
        textclass.internaltextclass internaltextclass = text.new internaltextclass();  // 实例化内部类的对象要通过外部类对象来实现.
        // 创建内部类的实例化对象的第二种方式
        textclass.internaltextclass internaltextclass1 = new textclass().new internaltextclass();
        // 创建静态内部类实例化对象
        textclass.astaticinclass astaticinclass = new textclass.astaticinclass(); // 静态内部类的实例化不需要依赖外部类.
    }
}

 class textclass{
    private String name;
    static private int age;
    public class internaltextclass{  // 内部类
        String sex="男";
        internaltextclass(){ // 构造方法
            name = "小舍";
            age = 23;
        }
        void input(){
            System.out.println("这是内部类的一个方法");
            ainput();  // 可以没有任何限制的调用外部类的方法.
        }
    }
     void ainput(){  // 外部类的一个方法,调用内部类的属性和方法.
         final String[] a = new String[0];
         internaltextclass internaltextclass = new internaltextclass(); // 通过实例化内部类来调用内部类的成员变量.
         internaltextclass.sex = "男";
         // 定义局部内部类
         class Localinclass{

             void Local(){
                 a[0] = "外部方法体中的变量";
                 System.out.println("局部内部类中的方法");
                 System.out.println(a[0]);
             }
         }
         //在方法体中调用局部内部类.
         Localinclass localinclass = new Localinclass();
         localinclass.Local();
     }

    public static class astaticinclass{
        void funtion(){
            System.out.println(age);
        }
    }

    public internaltextclass getinternaltextclass(){
        return new internaltextclass();
    }



}
