package day_4_8;

/**
 * @outhor xiaoshe
 * @date 2019/4/8  - @time 17:22
 *类
 * 在Java语言中,类是使用class关键字来定义的
 * 类可以有不同种,通过类前面的关键字来修饰
 * 也就是Java修饰符,一般情况下,修饰符限定了类的使用范围.
 * class后接类名,class是定义类的关键字,具体的类名需要自定义命名,
 * 命名规则是需要遵循java标识符的规则的.
 */
public class sty_class {
    // 通过主类里的主方法来调用不同类的不同方法.因为只有主方法才会被编译运行
    // 所以想要使用任何类,或类的方法的使用.都需要通过主方法调用才能实现.
    public static void main(String[] args) {
        // 想要调用某个类的某个方法,就需要实例化一个这个类的对象,通过实例化对象调用方法.
        // 无参的构造方法构建对象.
        animal animal = new animal();
        animal.eat();
        System.out.println(animal.getindepentThing());
        //有参的构造方法,构建对象
        animal animal1 = new animal(true);
        animal1.setindepentThing(false);
        System.out.println(animal1.getindepentThing());
        System.out.println(args.length);
    }
    public static class book{

    }
}
/**
 * 我们在同一个java文件里,可以声明多个不同的类.
 * 声明animal动物类.
 * 通过类来封装对象的属性和行为.
 */
class animal{
    // 在哦Java语言中,通过类的成员变量表示对象的属性.
    private boolean independentThing;

    // 成员方法,获取成员变量
    public boolean getindepentThing(){
        return this.independentThing;
    }
    // 成员方法,设置成员变量
    public void setindepentThing(boolean independentthing){
        this.independentThing = independentthing;
    }
    /**
     * 构造方法
     */
    public animal(){  // 无参的构造方法.
        this.independentThing= false;
    }
    public animal(boolean independentthing){  // 有参的构造方法
        this.independentThing = independentthing;
    }
    // 在Java中通过构建方法的形式,来表示对象的行为.
    void eat(){
        System.out.println("动物的吃行为");
    }
}