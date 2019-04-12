package java01.day_4_5;

import java.util.Arrays;

/**
 * @outhor xiaoshe
 * @date 2019/4/5  - @time 20:40
 * 数组
 */
public class Sty_Array {

    public static void main(String[] args) {
        Sty_Array sty_array = new Sty_Array();
        sty_array.create_array();
        sty_array.TraverArrays();

    }

    // 两种数组的创建,我们可以将代表数组的符号[]加给变量或者数据类型关键字.

    public void create_array(){
        // 一维数组
        int[] a;
        a =new int[4];
        a[0]=1;
        a[3]=3;
        System.out.println(a[3]);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        char[] b ={'a','b','c','d'};
        System.out.println(Arrays.toString(b));
        // 二维数组
        int[][] c={{2,3},{12,13},{22,23}};
        System.out.println(c[0][1]);
        int[][] d=new int[3][4];
        d[0][0]=1;
        d[0][3]=4;
        d[1][0]=11;
    }

    // 数组操作
    public void TraverArrays(){
        //一维数组的遍历
        int[] a={1,2,3,4,5};
        int[] c={3,6,2,4,1,7,9,8,0};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("\n----分界线-----");
        // 二维数组的遍历
        int[][] b={{2,3,4,5},{12,13,14,15},{22,23,24,25}};
        for(int i=0;i<b.length;i++){ // 通过两个for循环遍历二维数组,外层循环遍历列的下标,
            for (int j=0;j<b[i].length;j++){  // 内存循环循环遍历行的下标.
                System.out.print(b[i][j]+","); //循环输出对应下标的元素.遍历出整个二维数组.
            }
            System.out.println(); // 输出换行(每行数据输出红后换行.)
        }
        //数组排序
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        //copy数组
        int[] d=Arrays.copyOf(c,12);
        int[] e=Arrays.copyOfRange(c,3,7);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        //填充数组
        Arrays.fill(c,6);
        System.out.println(Arrays.toString(c));
        Arrays.fill(c,3,7,10);
        System.out.println(Arrays.toString(c));
        //数组查询
        System.out.println(Arrays.binarySearch(c,10));
        System.out.println(Arrays.binarySearch(c,5,7,10));
}
}
