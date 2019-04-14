package java02.day_4_13;

/**
 * @outhor xiaoshe
 * @date 2019/4/13  - @time 23:05
 * 类的高级特性
 */

public class sty_Object{
// 默认情况下,继承Object类,可以直接调用Object类中的方法
public static void main(String[] args) {
    sty_Object sty_classfeature = new sty_Object();
// 返回实例化对象的所对应的的类的类名.
    System.out.println(sty_classfeature.getClass().getName());
    System.out.println(sty_classfeature.equals("123"));
    // toString 方法
    System.out.println(sty_classfeature.toString());
}
}
// 通过extends符,继承Object类,并可以重写其中的方法.
class text extends Object{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

