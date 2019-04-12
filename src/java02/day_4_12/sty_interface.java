package java02.day_4_12;

/**
 * @outhor xiaoshe
 * @date 2019/4/13  - @time 1:35
 */
public class sty_interface {
    public static void main(String[] args) {
        // 然后可以通过实例化接口的实现类的对象,来调用其方法,
        achieveman achieveman = new achieveman();
        achieveman.eat();
        achieveman.work();
    }
}
// 定义一个man接口
interface man{
    public void eat();  // 抽象方法
    public void work();
}
class achieveman implements man {
// 继承接口后,接口内的方法必须的全部实现
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }
    @Override
    public void work() {
        System.out.println("男人工作");
    }
}
