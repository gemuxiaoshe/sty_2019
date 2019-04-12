package java02.day_4_12;

/**
 * @outhor xiaoshe
 * @date 2019/4/13  - @time 0:55
 * 抽象类
 */
public class sty_Polymorphism {
    public static void main(String[] args) {
        woman woman = new woman("女", "黄"); // 尽管不能实例抽象类,但可以实例其子类对象.
        System.out.println(woman.getSex()); // 可以直接调用抽象类允许的方法.
        System.out.println( woman.getColor()); // 可以直接调用抽象类允许的方法.
    }
}
// 定义抽象类人类
abstract class humanity{  // abstact关键字用来定义抽象类
    private String sex;
    private String color;
    public String getSex() {
        return sex;
    }
    public String getColor() {
        return color;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setColor(String color) {
        this.color = color;
    }
   humanity(String sex,String color){  //构造方法
        this.color=color;
        this.sex=sex;
   }
    @Override
    public String toString() {  //重写toString方法
        return("性别:"+this.sex+"肤色:"+this.color);
    }
}
class woman extends humanity{  // 继承抽象类.woman类可以作为humanity类的一个对象,这就是向上转型.
    woman(String sex, String color) {  // 必须要有构造方法.
        super(sex, color);
    }
}