package java01.day_4_2;

/**
 * @outhor xiaoshe
 * @date 2019/4/2  - @time 21:50
 * 创建package day_4_2
 * 创建类Sty_ProcessControl
 * 流程控制的实例练习
 */
import java.security.PublicKey;
import java.util.Scanner;
/**
 * 1,编写程序,实现判断变量x 的奇偶数.
 * 2,应用for循环打印菱形
 * 3,使用while循环语句计算1+1/2!+1/3!...1/20!之和.
 */
public class Sty_ProcessControl {
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

    /**
     * 利用for循环打印菱形
     * 1,首先实现用for循环打印出依次递增与递减的的*号整列(正三角与倒三角),形成菱形的一半.
     * 2,第二步,实现正反三角数量的翻倍,然后在这基础上每行的数量需减一,形成奇数阵列.
     * 第三步,正反三角的左侧插入对应的三角空格阵列.
     * 最后,打印结果.
     *
     * 由于Java程序使按先后顺序执行,所以空格整列要写在前面.
     */
  public void sty_Printdiamond(){ // 定义实现打印方法
      for(int i=0;i<5;i++){  // 定义外层for循环,控制打印上半三角形的行数i.
          for(int j=0;j<=5-i;j++){  // 两个并列子级for循环之一,使用循环控制打印一个递减的倒三角空格阵列.
              System.out.print(" "); // 打印空格.
          }
          for(int k=0;k<i*2-1;k++){ // 连个并行子级for循环之一,使用循环控制打印一个正三角*阵列.并使*号数量翻倍并每行减一.
              System.out.print("*"); // 打印*号.
          }
          System.out.println(); // 控制换行,在每行最后执行.
      }
        for (int i=0;i<5;i++){  // 并行外层for循环之一,控制打印倒三角整列.
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=10;j>=2*(i+1);j--){
                System.out.print("*");
            }
            System.out.println();
        }
  }

    /**
     * 使用while循环语句求阶乘.
     *阶乘,n!=1*2*3*4*...*n;
     * 1/1+1/(1*2)
     * 思路,第一步,先算出每一项的阶乘,阶乘=前一项的阶乘*当前项数,将阶乘定义为double型变量,代入.
     * 第二步,每项阶乘相加求和.结果=前n-1项的和加上当前项,将结果定义为aAnswer变量,代入.
     * 第三步,通过while循环,代入变量与公式,(相当于递归的过程).
     */
  public void sty_getFactorial(){
      int i=1; // 定义变量i;控制循环次数,同时也代表了每一项的项数.
      double afactorial=1; // 定义变量afactorial,表示每一项的阶乘.
      double aAnswer=0;  // 定义aAnswer变量,代表结果.
      while (i<=20){
          afactorial=afactorial*(1.0/i);  // 每项阶乘=前一项阶乘*当前项.
          aAnswer=aAnswer+afactorial;  // 最终结果=前一项的结果加上当前项的阶乘.
          i++; //控制变量i,在每次运算后向前加1.
      }
        System.out.println(aAnswer); // 输出答案
  }
}
