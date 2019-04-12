package java02.day_4_12;

import My_tools.Boundlinetool;
import My_tools.FormatTimetool;

/**
 * @outhor xiaoshe
 * @date 2019/4/12  - @time 21:36
 */public class sty_extends {
    public
 static void main(String[] args) {
        father father = new father("小舍的父亲", "工人");
        son son = new son("小舍", "男", "程序员");
        System.out.println(father.getName());
        father.work();
        Boundlinetool.Minus();
        System.out.println(son.getName());
        son.work();
    }
}
// 构建父类
class father{
    private String name;
    private String work;
    // 成员方法
    public String getName() {
        return name;
    }
    public String getWork() {
        return work;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWork(String work) {
        this.work = work;
    }
    //构造方法
    public  father(String name,String work){
        this.work=work;
        this.name=name;
    }
    // 新增方法
    public void work(){
        System.out.println(this.work);
    }
}
// 构建子类
class son extends father{  // 通过extends 继承父类
     private String sex;  // 添加新属性.

    // 重写构造方法,属性不仅继承了父类属性,还将新属性添加其中.
    public son(String name, String sex,String work) {
        super(name, work);
        this.sex=sex;
    }
    @Override
    // 直接调用父类的成员方法,获取和设置成员属性.
    public String getName() {
        return super.getName();
    }
    // 重写父类的work方法
    @Override
    public void work(){
        System.out.println("子类"+super.getName()+"的工作是:"); // 重写内容
       super.work();  // 直接调用父类方法.
    }
}

