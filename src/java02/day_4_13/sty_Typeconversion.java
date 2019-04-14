package java02.day_4_13;

/**
 * @outhor xiaoshe
 * @date 2019/4/14  - @time 21:49
 * 对象的类型转换
 */
public class sty_Typeconversion{
    public static void main(String[] args) {  //定义主方法
        square square = new square();  // 实例化正方形对象
        square.draw(square); // 调用父类方法,以子类对象作为父类对象传参数,向上转型.
        quadrilateral q = new square();  // 将子类对象赋值给父类类型对象.
        //  square s = q;  // 直接将父类对象转换为子类对象是不行的,会报错.
        square s = (square) q;  // 只能通过强制类型转换来向下转型
        System.out.println(s instanceof square);
    }
}
// 定义四边形类
class quadrilateral{
   public void draw(quadrilateral q){
       System.out.println("绘制四边形");
    }
}
// 定义子类正方形继承四边形类
class square extends quadrilateral {
}