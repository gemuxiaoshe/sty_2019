package java01.day_4_2;

/**
 * @outhor xiaoshe
 * @date 2019/4/2  - @time 21:50
 * ����package day_4_2
 * ������Sty_ProcessControl
 * ���̿��Ƶ�ʵ����ϰ
 */
import java.security.PublicKey;
import java.util.Scanner;
/**
 * 1,��д����,ʵ���жϱ���x ����ż��.
 * 2,Ӧ��forѭ����ӡ����
 * 3,ʹ��whileѭ��������1+1/2!+1/3!...1/20!֮��.
 */
public class Sty_ProcessControl {
    public static void main(String[] args) { // ������ main()
        // ʹ��Scanner���󷽷���������
        Scanner ascanner = new Scanner(System.in);

        // ������ֵ��ֵ��int����a.
       int a = ascanner.nextInt();

       // ʵ��������,
        Sty_ProcessControl control = new Sty_ProcessControl();

        //������a�����жϷ���,
        control.sty_JudgeNumber1(a); // if�����ж�����ж���ż.
        control.sty_JudgeNumber2(a); // switch���֧����ж���ż.
        //ͨ��ʵ����������÷���.
        control.sty_Printdiamond(); // forѭ��Ƕ�׶༶���ô�ӡ����.
        control.sty_getFactorial(); // ʹ��whileѭ�������׳�.
    }

    /**
     *ͨ��if��������ж�x����ż
     */
  public void sty_JudgeNumber1(int anumber){  // ���巽��,����ֵΪint��,int�Ͳ��� anumber
      if(anumber%2==0){  // ͨ��if�����ж����,�ж���������Ƿ�������2.
      System.out.println("ż��"); // ��(true),���ż��,
      }else{
          System.out.println("����"); // ����(false),�������
      }
  }

    /**
     * swicth���֧����ж���ż��
     * @param anumber
     */
  public void sty_JudgeNumber2(int anumber){
      switch (anumber%2){
          case 0:
              System.out.println("ż��");
              break;
          case 1:
              System.out.println("����");
              break;
      }
  }

    /**
     * ����forѭ����ӡ����
     * 1,����ʵ����forѭ����ӡ�����ε�����ݼ��ĵ�*������(�������뵹����),�γ����ε�һ��.
     * 2,�ڶ���,ʵ���������������ķ���,Ȼ�����������ÿ�е��������һ,�γ���������.
     * ������,�������ǵ��������Ӧ�����ǿո�����.
     * ���,��ӡ���.
     *
     * ����Java����ʹ���Ⱥ�˳��ִ��,���Կո�����Ҫд��ǰ��.
     */
  public void sty_Printdiamond(){ // ����ʵ�ִ�ӡ����
      for(int i=0;i<5;i++){  // �������forѭ��,���ƴ�ӡ�ϰ������ε�����i.
          for(int j=0;j<=5-i;j++){  // ���������Ӽ�forѭ��֮һ,ʹ��ѭ�����ƴ�ӡһ���ݼ��ĵ����ǿո�����.
              System.out.print(" "); // ��ӡ�ո�.
          }
          for(int k=0;k<i*2-1;k++){ // ���������Ӽ�forѭ��֮һ,ʹ��ѭ�����ƴ�ӡһ��������*����.��ʹ*������������ÿ�м�һ.
              System.out.print("*"); // ��ӡ*��.
          }
          System.out.println(); // ���ƻ���,��ÿ�����ִ��.
      }
        for (int i=0;i<5;i++){  // �������forѭ��֮һ,���ƴ�ӡ����������.
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
     * ʹ��whileѭ�������׳�.
     *�׳�,n!=1*2*3*4*...*n;
     * 1/1+1/(1*2)
     * ˼·,��һ��,�����ÿһ��Ľ׳�,�׳�=ǰһ��Ľ׳�*��ǰ����,���׳˶���Ϊdouble�ͱ���,����.
     * �ڶ���,ÿ��׳�������.���=ǰn-1��ĺͼ��ϵ�ǰ��,���������ΪaAnswer����,����.
     * ������,ͨ��whileѭ��,��������빫ʽ,(�൱�ڵݹ�Ĺ���).
     */
  public void sty_getFactorial(){
      int i=1; // �������i;����ѭ������,ͬʱҲ������ÿһ�������.
      double afactorial=1; // �������afactorial,��ʾÿһ��Ľ׳�.
      double aAnswer=0;  // ����aAnswer����,������.
      while (i<=20){
          afactorial=afactorial*(1.0/i);  // ÿ��׳�=ǰһ��׳�*��ǰ��.
          aAnswer=aAnswer+afactorial;  // ���ս��=ǰһ��Ľ�����ϵ�ǰ��Ľ׳�.
          i++; //���Ʊ���i,��ÿ���������ǰ��1.
      }
        System.out.println(aAnswer); // �����
  }
}
