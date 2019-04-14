package java02.day_4_14;

/**
 * @outhor xiaoshe
 * @date 2019/4/15  - @time 1:55
 * 匿名内部类
 */
public class sty_anonymous {
    public void outman(man m){
        System.out.println(m.toout());
    }
    public static void main(String[] args) {
        sty_anonymous styAnonymous = new sty_anonymous();
        // 匿名内部类的使用
        styAnonymous.outman(new man() {
            @Override
            String sex() {
              return "男";
            }
            @Override
            String name() {
            return "男人";
            }
            @Override
            String toout() {
                return(this.name()+"\n"+this.sex());
            }
        });  // 通过匿名内部类来间接性直接实例化抽象类.
    }
}
// 定义一个抽象类
abstract class man{
    private String name;
    private String sex;
    abstract String sex(); // 定义一个抽象方法
    abstract String name(); // 定义一个抽象方法
    abstract String toout();
}