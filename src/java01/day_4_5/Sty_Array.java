package java01.day_4_5;

import java.util.Arrays;

/**
 * @outhor xiaoshe
 * @date 2019/4/5  - @time 20:40
 * ����
 */
public class Sty_Array {

    public static void main(String[] args) {
        Sty_Array sty_array = new Sty_Array();
        sty_array.create_array();
        sty_array.TraverArrays();

    }

    // ��������Ĵ���,���ǿ��Խ���������ķ���[]�Ӹ����������������͹ؼ���.

    public void create_array(){
        // һά����
        int[] a;
        a =new int[4];
        a[0]=1;
        a[3]=3;
        System.out.println(a[3]);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        char[] b ={'a','b','c','d'};
        System.out.println(Arrays.toString(b));
        // ��ά����
        int[][] c={{2,3},{12,13},{22,23}};
        System.out.println(c[0][1]);
        int[][] d=new int[3][4];
        d[0][0]=1;
        d[0][3]=4;
        d[1][0]=11;
    }

    // �������
    public void TraverArrays(){
        //һά����ı���
        int[] a={1,2,3,4,5};
        int[] c={3,6,2,4,1,7,9,8,0};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("\n----�ֽ���-----");
        // ��ά����ı���
        int[][] b={{2,3,4,5},{12,13,14,15},{22,23,24,25}};
        for(int i=0;i<b.length;i++){ // ͨ������forѭ��������ά����,���ѭ�������е��±�,
            for (int j=0;j<b[i].length;j++){  // �ڴ�ѭ��ѭ�������е��±�.
                System.out.print(b[i][j]+","); //ѭ�������Ӧ�±��Ԫ��.������������ά����.
            }
            System.out.println(); // �������(ÿ��������������.)
        }
        //��������
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        //copy����
        int[] d=Arrays.copyOf(c,12);
        int[] e=Arrays.copyOfRange(c,3,7);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        //�������
        Arrays.fill(c,6);
        System.out.println(Arrays.toString(c));
        Arrays.fill(c,3,7,10);
        System.out.println(Arrays.toString(c));
        //�����ѯ
        System.out.println(Arrays.binarySearch(c,10));
        System.out.println(Arrays.binarySearch(c,5,7,10));
}
}
