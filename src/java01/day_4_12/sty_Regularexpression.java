package java01.day_4_12;

        import java.util.Scanner;

/**
 * @outhor xiaoshe
 * @date 2019/4/12  - @time 20:53
 * ������ʽ
 */
public class sty_Regularexpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������Ч������:");
        String str = scanner.nextLine();
        sty_Regularexpression sty_regularexpression = new sty_Regularexpression();
        sty_regularexpression.checkemil(str);
    }

    private void checkemil(String str){
        if (str.matches("\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}")){
            System.out.println("�����ַ��Ч");
        }else
            System.out.println("�����ַ��Ч");
    }
}
