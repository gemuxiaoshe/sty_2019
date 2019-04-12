package java01.day_4_6;
import java.util.Arrays;
/**
 * @outhor xiaoshe
 * @date 2019/4/6  - @time 11:20
 * 排序算法
 */
public class Sty_Sortalgrithm {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3, 7, 9, 5, 6, 8, 0, 9, 10, 13, 11, 15, 12, 17, 14, 13, 18, 19, 20};
        Sty_Sortalgrithm sortalgrithm = new Sty_Sortalgrithm();
        sortalgrithm.BubbleSort(arr);
        sortalgrithm.Selectsort(arr);
        sortalgrithm.Insertsort(arr);
        sortalgrithm.Shellsort(arr);
        System.out.println("归并排序:");
        System.out.println(Arrays.toString(sortalgrithm.Mergesort(arr)));
        System.out.println("快速排序:");
        System.out.println(Arrays.toString(sortalgrithm.sort(arr)));
    }
    /**
     * 冒泡排序
     * 通过两个for循环来排序数组
     * 外层循环控制需要循环的轮次
     * 内层循环控制相邻元素的对比及交换.
     */
    public void BubbleSort(int[] arr) {
        long startime = System.nanoTime(); // 记录程序开始运行的时间点
        int[] copyarr = Arrays.copyOf(arr, 23);
        System.out.println("冒泡排序:");
        for (int i = 1; i < copyarr.length; i++) { // 外层for循环
            for (int j = 0; j < copyarr.length - i; j++) { //内层for循环,arr.length-i表示每进行完一轮就将循环对比的的次数减小一次,因为最后面的顺序都是每次循环中最大的,顺序已经排好,不需要再进行对比了.
                if (copyarr[j] > copyarr[j + 1]) {  //判断交换的条件,如果当前元素比后一个元素大就交换两者位置
                    int a = copyarr[j + 1];  // 两个数的交换代码
                    copyarr[j + 1] = copyarr[j];
                    copyarr[j] = a;
                }
            }
        }
        System.out.println(Arrays.toString(copyarr)); // Arrays类中的toString方法遍历输出数组.
        long endtime = System.nanoTime(); // 记录程序结束的时间点
        System.out.println("运行时间:" + (endtime - startime) + "ns"); // 输出程序运行的时间(开始结束的时间差)
    }
    /**
     * 选择排序
     * 选择排序也是通过两个for循环来实现的
     * 外层for循环控制循环轮次,总共n-1轮
     * 此外我们还需要声明一个局部变量记录每次循环对比的最小元素的下标.
     * 内存for循环,通过依次对比比较,将当前未排序的序列中最小元素的下标记录下来.
     * 最后通过if判断找到的下标与最开始的下标i是否相同,不相同就交换两者对应的元素
     */
    public void Selectsort(int[] arr) {
        long startime = System.nanoTime();
        int[] copyarr = Arrays.copyOf(arr, 23);
        System.out.println("选择排序:");
        for (int i = 0; i < copyarr.length - 1; i++) { // 控制循环的轮次,总共需要n-1次.
            int min = i; // 声明成员变量,用来储存最小元素的下标.
            for (int j = i + 1; j < copyarr.length; j++) { // 内层for循环,j=i+1是为了将序列分开为i表示的已排列,和i+1及之后的未排列两部分,
                if (copyarr[j] < copyarr[min]) {  // 判断条件,在未排列(即i+1之后的序列.)序列里找到最小元素
                    min = j; // 将最小元素的下标保存到成员变量min中
                }
            }
            if (min != i) {  // 判断条件,判断最小元素是否和当前首位元素相同,
                // 交换位置.
                int a = copyarr[i];
                copyarr[i] = copyarr[min];
                copyarr[min] = a;
            }
        }
        System.out.println(Arrays.toString(copyarr)); // Arrays类的toAString方法,遍历输出数组
        long endtime = System.nanoTime();
        System.out.println("运行时间:" + (endtime - startime) + "ns");
    }
    /**
     * 插入排序
     * 插入排序也是通过嵌套循环实现排序的.
     * y原始案例通过for,while循环嵌套实现,
     */
    public void Insertsort(int[] arr) {
        long startime = System.nanoTime();
        System.out.println("插入排序:");
        int[] copyarr = Arrays.copyOf(arr, 23); // 复制数组,以防改变了数组arr.
        for (int i = 1; i < copyarr.length; i++) { //外层循环控制轮次.
            int temp = arr[i]; // 声明temp,将此时未排序的首位元素抽出.
            int j;
            for (j = i - 1; j >= 0 && copyarr[j] > temp; j--) { // 内存for循环和判断条件合并.
                //当无序序列首位元素(temp)小于有序序列末尾元素(copyarr[j])时
                //就将j的值赋给j+1,这里的j+1=i;之所以使用j+1是为了能够在条件不满足时在内层for循环中循环进行判断.
                copyarr[j + 1] = copyarr[j];
            }
            copyarr[j + 1] = temp;  //在外层循环其他条件下,直接将temp赋值给j+1
        }
        System.out.println(Arrays.toString(copyarr));
        long endtime = System.nanoTime();
        System.out.println("运行时间:" + (endtime - startime) + "ns");
    }
    /**
     * 希尔排序
     * 希尔排列是插入排列的进阶版
     * 相当于将无序序列分成为多个子级无序序列,再分别进行插入排列.
     */
    public void Shellsort(int[] arr) {
        long startime = System.nanoTime();
        System.out.println("希尔排序:");
        int[] copyarr = Arrays.copyOf(arr, 23);
        for (int gap = copyarr.length / 2; gap > 0; gap /= 2) { // for循环控制分组情况,每次循环将序列拆分为两组直到不能拆分为止.
            for (int j = gap; j < copyarr.length; j++) { //然后通过for循环控制每组无序序列直接进行插入排序
                int temp = copyarr[j];
                int k;
                for (k = j - gap; k >= 0 && copyarr[k] > temp; k -= gap) {
                    copyarr[k + gap] = copyarr[k];
                }
                copyarr[k + gap] = temp;
            }
        }
        System.out.println(Arrays.toString(copyarr));
        long endtime = System.nanoTime();
        System.out.println("运行时间:" + (endtime - startime) + "ns");
    }
    /**
     * 归并排序
     * 这里通过两个方法的调用实现.
     * mergesort方法,主要将数组copy并分为左右两个序列.
     * 通过调用本身实现不断的分化.
     */
    public int[] Mergesort(int[] arr){
        int[] copyarr = Arrays.copyOf(arr, arr.length);
        if (copyarr.length<2){
            return copyarr;
        }
        int middle =(int)Math.floor(copyarr.length / 2); // 将序列的长度一分为二.
        int[] left = Arrays.copyOfRange(copyarr, 0, middle);
        int[] right = Arrays.copyOfRange(copyarr, middle, copyarr.length);
        // 返回值调用合并方法,将排序后的分组不断合并.最后返回一个完整的排序后的序列.
        return merge(Mergesort(left),Mergesort(right));

    }
    protected int[] merge(int[] left, int[] right) { //传参,将左右两个无序序列传进来.
        int[] result = new int[left.length + right.length]; //定义一个新的空数组,长度为左右序列的长度之和,
        int i = 0;  // 声明一个成员变量i.
        while (left.length > 0 && right.length > 0) { // while 循环控制条件
            if (left[0] <= right[0]) {  // if判断语句,判断左右序列对应位置元素的大小.
                result[i++] = left[0]; // 然后将小的元素存放在合并数组的对应位置中.
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        while(left.length>0){ // 不满足以上while条件跳出循环时,执行,
            result[i++] = left[0];
            left = Arrays.copyOfRange(left,1,left.length);
        }
        while(right.length>0){
            result[i++] = right[0];
            right = Arrays.copyOfRange(right,1,right.length);
        }
        return result; // 返回排序合并后的序列.
    }
    /**
     * 快速排序
     *快速排序是分而治之的经典应用之一
     * 通过递归调用的方式实现排序,
     * 在大多情况下,其效率是最高的.
     */
    public int[] sort(int[] arr){ // sort 方法 用来出copy数组,并调用排序方法.
        int[] copyarr=Arrays.copyOf(arr,arr.length);
        return quicksort(copyarr,0,copyarr.length-1);
    }
    // 快速排序方法.
    private int[] quicksort(int[] arr,int left,int right){ //传入参数,待排序的数组,左下标,及数组长度减1.
        if(left<right){  // if判断条件,这里没有else是因为left必然是小于right的.如果等于的话,直接返回数组就可以了.
            int partitionindex = partition(arr,left,right); // 声明局部变量,调用分区方法,递归调用.
            quicksort(arr,left,partitionindex-1); //
            quicksort(arr,partitionindex+1,right); // 递归调用本身,
        }
        return arr;
    }
    /**
     *     分区方法,将无序序列以基准为界分别放在左右两边,
     *     真正的比较交换操作,是在这个分区方法里实现的.
     *     然后在通过前面的递归调用,来循环使用分区方法,实现排序.
     */
    private int partition(int[] arr,int left,int right){
        int pivot =left;
        int index = pivot+1;
        for (int i=index;i<=right;i++){
            if (arr[i]<arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index-1;
    }
    // 封装通用方法,将数组arr中的arr[i]与arr[j]的值交换
    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
