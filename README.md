# sty_2019

JAVA语言基础学习的[java初探]系列的所有案例源码

对应的学习笔记记录在以下博客中:

[博客园--葛木小舍先生的博客](https://www.cnblogs.com/gemuxiaoshe/)

[简书文集--Java初学历程](https://www.jianshu.com/c/b3d4a42ca161)

## 源码文件说明:

* **项目结构**

![项目结构](http://ss1.sinaimg.cn/large/006vSZWtgy1g1yx4aqmvuj30960eajrx.jpg)

所有案例包都以日期为格式,分别记录当天的学习内容

* **类结构**

![](http://ss1.sinaimg.cn/large/006vSZWtgy1g1yxbc1d4dj30pa0c4mxx.jpg)

类名以Sty_开头,表示当前类是学习什么的.每个类都会对本类学习内容做简单说明:

* **方法体**

```
   public static void main(String[] args) { // 主方法 main()
        // 使用Scanner对象方法控制输入
        Scanner ascanner = new Scanner(System.in);
        // 将输入值赋值给int变量a.
       int a = ascanner.nextInt();
       // 实例化对象,
        Sty_ProcessControl control = new Sty_ProcessControl();
        //传参数a调用判断方法,
        control.sty_JudgeNumber1(a); // if条件判断语句判断奇偶.
        control.sty_JudgeNumber2(a); // switch多分支语句判断奇偶.
        //通过实例化对象调用方法.
        control.sty_Printdiamond(); // for循环嵌套多级运用打印菱形.
        control.sty_getFactorial(); // 使用while循环语句求阶乘.
    }

    /**
     *通过if条件语句判断x的奇偶
     */
  public void sty_JudgeNumber1(int anumber){  // 定义方法,返回值为int型,int型参数 anumber
      if(anumber%2==0){  // 通过if条件判断语句,判断输入的数是否能整除2.
      System.out.println("偶数"); // 能(true),输出偶数,
      }else{
          System.out.println("奇数"); // 不能(false),输出奇数
      }
  }

    /**
     * swicth多分支语句判断奇偶数
     * @param anumber
     */
  public void sty_JudgeNumber2(int anumber){
      switch (anumber%2){
          case 0:
              System.out.println("偶数");
              break;
          case 1:
              System.out.println("奇数");
              break;
      }
  }

```

所有类都以构造方法的形式,通过主类的调用来进行知识学习的总结的.


***

* **不只是一份练习文件,还是一份具有良好可读性的Java语言基础源码学习文件.**
