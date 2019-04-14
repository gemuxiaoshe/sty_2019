package java02.day_4_14;

/**
 * @outhor xiaoshe
 * @date 2019/4/14  - @time 22:28
 * final类
 */
public class sty_finalclass {
    public static void main(String[] args) {
        t_final t_final = new t_final();
        t_final.text();
    }
}
// final 类不能被继承,不能被改动.只能够实例化调用,如果加上static关键字,就可以当初一个常量类一样使用.
final class t_final{
    void text(){
        System.out.println("final类中的方法");
    }
}