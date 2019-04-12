package java01.day_4_6;
import java.util.Arrays;
/**
 * @outhor xiaoshe
 * @date 2019/4/6  - @time 11:20
 * �����㷨
 */
public class Sty_Sortalgrithm {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3, 7, 9, 5, 6, 8, 0, 9, 10, 13, 11, 15, 12, 17, 14, 13, 18, 19, 20};
        Sty_Sortalgrithm sortalgrithm = new Sty_Sortalgrithm();
        sortalgrithm.BubbleSort(arr);
        sortalgrithm.Selectsort(arr);
        sortalgrithm.Insertsort(arr);
        sortalgrithm.Shellsort(arr);
        System.out.println("�鲢����:");
        System.out.println(Arrays.toString(sortalgrithm.Mergesort(arr)));
        System.out.println("��������:");
        System.out.println(Arrays.toString(sortalgrithm.sort(arr)));
    }
    /**
     * ð������
     * ͨ������forѭ������������
     * ���ѭ��������Ҫѭ�����ִ�
     * �ڲ�ѭ����������Ԫ�صĶԱȼ�����.
     */
    public void BubbleSort(int[] arr) {
        long startime = System.nanoTime(); // ��¼����ʼ���е�ʱ���
        int[] copyarr = Arrays.copyOf(arr, 23);
        System.out.println("ð������:");
        for (int i = 1; i < copyarr.length; i++) { // ���forѭ��
            for (int j = 0; j < copyarr.length - i; j++) { //�ڲ�forѭ��,arr.length-i��ʾÿ������һ�־ͽ�ѭ���ԱȵĵĴ�����Сһ��,��Ϊ������˳����ÿ��ѭ��������,˳���Ѿ��ź�,����Ҫ�ٽ��жԱ���.
                if (copyarr[j] > copyarr[j + 1]) {  //�жϽ���������,�����ǰԪ�رȺ�һ��Ԫ�ش�ͽ�������λ��
                    int a = copyarr[j + 1];  // �������Ľ�������
                    copyarr[j + 1] = copyarr[j];
                    copyarr[j] = a;
                }
            }
        }
        System.out.println(Arrays.toString(copyarr)); // Arrays���е�toString���������������.
        long endtime = System.nanoTime(); // ��¼���������ʱ���
        System.out.println("����ʱ��:" + (endtime - startime) + "ns"); // ����������е�ʱ��(��ʼ������ʱ���)
    }
    /**
     * ѡ������
     * ѡ������Ҳ��ͨ������forѭ����ʵ�ֵ�
     * ���forѭ������ѭ���ִ�,�ܹ�n-1��
     * �������ǻ���Ҫ����һ���ֲ�������¼ÿ��ѭ���Աȵ���СԪ�ص��±�.
     * �ڴ�forѭ��,ͨ�����ζԱȱȽ�,����ǰδ�������������СԪ�ص��±��¼����.
     * ���ͨ��if�ж��ҵ����±����ʼ���±�i�Ƿ���ͬ,����ͬ�ͽ������߶�Ӧ��Ԫ��
     */
    public void Selectsort(int[] arr) {
        long startime = System.nanoTime();
        int[] copyarr = Arrays.copyOf(arr, 23);
        System.out.println("ѡ������:");
        for (int i = 0; i < copyarr.length - 1; i++) { // ����ѭ�����ִ�,�ܹ���Ҫn-1��.
            int min = i; // ������Ա����,����������СԪ�ص��±�.
            for (int j = i + 1; j < copyarr.length; j++) { // �ڲ�forѭ��,j=i+1��Ϊ�˽����зֿ�Ϊi��ʾ��������,��i+1��֮���δ����������,
                if (copyarr[j] < copyarr[min]) {  // �ж�����,��δ����(��i+1֮�������.)�������ҵ���СԪ��
                    min = j; // ����СԪ�ص��±걣�浽��Ա����min��
                }
            }
            if (min != i) {  // �ж�����,�ж���СԪ���Ƿ�͵�ǰ��λԪ����ͬ,
                // ����λ��.
                int a = copyarr[i];
                copyarr[i] = copyarr[min];
                copyarr[min] = a;
            }
        }
        System.out.println(Arrays.toString(copyarr)); // Arrays���toAString����,�����������
        long endtime = System.nanoTime();
        System.out.println("����ʱ��:" + (endtime - startime) + "ns");
    }
    /**
     * ��������
     * ��������Ҳ��ͨ��Ƕ��ѭ��ʵ�������.
     * yԭʼ����ͨ��for,whileѭ��Ƕ��ʵ��,
     */
    public void Insertsort(int[] arr) {
        long startime = System.nanoTime();
        System.out.println("��������:");
        int[] copyarr = Arrays.copyOf(arr, 23); // ��������,�Է��ı�������arr.
        for (int i = 1; i < copyarr.length; i++) { //���ѭ�������ִ�.
            int temp = arr[i]; // ����temp,����ʱδ�������λԪ�س��.
            int j;
            for (j = i - 1; j >= 0 && copyarr[j] > temp; j--) { // �ڴ�forѭ�����ж������ϲ�.
                //������������λԪ��(temp)С����������ĩβԪ��(copyarr[j])ʱ
                //�ͽ�j��ֵ����j+1,�����j+1=i;֮����ʹ��j+1��Ϊ���ܹ�������������ʱ���ڲ�forѭ����ѭ�������ж�.
                copyarr[j + 1] = copyarr[j];
            }
            copyarr[j + 1] = temp;  //�����ѭ������������,ֱ�ӽ�temp��ֵ��j+1
        }
        System.out.println(Arrays.toString(copyarr));
        long endtime = System.nanoTime();
        System.out.println("����ʱ��:" + (endtime - startime) + "ns");
    }
    /**
     * ϣ������
     * ϣ�������ǲ������еĽ��װ�
     * �൱�ڽ��������зֳ�Ϊ����Ӽ���������,�ٷֱ���в�������.
     */
    public void Shellsort(int[] arr) {
        long startime = System.nanoTime();
        System.out.println("ϣ������:");
        int[] copyarr = Arrays.copyOf(arr, 23);
        for (int gap = copyarr.length / 2; gap > 0; gap /= 2) { // forѭ�����Ʒ������,ÿ��ѭ�������в��Ϊ����ֱ�����ܲ��Ϊֹ.
            for (int j = gap; j < copyarr.length; j++) { //Ȼ��ͨ��forѭ������ÿ����������ֱ�ӽ��в�������
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
        System.out.println("����ʱ��:" + (endtime - startime) + "ns");
    }
    /**
     * �鲢����
     * ����ͨ�����������ĵ���ʵ��.
     * mergesort����,��Ҫ������copy����Ϊ������������.
     * ͨ�����ñ���ʵ�ֲ��ϵķֻ�.
     */
    public int[] Mergesort(int[] arr){
        int[] copyarr = Arrays.copyOf(arr, arr.length);
        if (copyarr.length<2){
            return copyarr;
        }
        int middle =(int)Math.floor(copyarr.length / 2); // �����еĳ���һ��Ϊ��.
        int[] left = Arrays.copyOfRange(copyarr, 0, middle);
        int[] right = Arrays.copyOfRange(copyarr, middle, copyarr.length);
        // ����ֵ���úϲ�����,�������ķ��鲻�Ϻϲ�.��󷵻�һ������������������.
        return merge(Mergesort(left),Mergesort(right));

    }
    protected int[] merge(int[] left, int[] right) { //����,�����������������д�����.
        int[] result = new int[left.length + right.length]; //����һ���µĿ�����,����Ϊ�������еĳ���֮��,
        int i = 0;  // ����һ����Ա����i.
        while (left.length > 0 && right.length > 0) { // while ѭ����������
            if (left[0] <= right[0]) {  // if�ж����,�ж��������ж�Ӧλ��Ԫ�صĴ�С.
                result[i++] = left[0]; // Ȼ��С��Ԫ�ش���ںϲ�����Ķ�Ӧλ����.
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        while(left.length>0){ // ����������while��������ѭ��ʱ,ִ��,
            result[i++] = left[0];
            left = Arrays.copyOfRange(left,1,left.length);
        }
        while(right.length>0){
            result[i++] = right[0];
            right = Arrays.copyOfRange(right,1,right.length);
        }
        return result; // ��������ϲ��������.
    }
    /**
     * ��������
     *���������Ƿֶ���֮�ľ���Ӧ��֮һ
     * ͨ���ݹ���õķ�ʽʵ������,
     * �ڴ�������,��Ч������ߵ�.
     */
    public int[] sort(int[] arr){ // sort ���� ������copy����,���������򷽷�.
        int[] copyarr=Arrays.copyOf(arr,arr.length);
        return quicksort(copyarr,0,copyarr.length-1);
    }
    // �������򷽷�.
    private int[] quicksort(int[] arr,int left,int right){ //�������,�����������,���±�,�����鳤�ȼ�1.
        if(left<right){  // if�ж�����,����û��else����Ϊleft��Ȼ��С��right��.������ڵĻ�,ֱ�ӷ�������Ϳ�����.
            int partitionindex = partition(arr,left,right); // �����ֲ�����,���÷�������,�ݹ����.
            quicksort(arr,left,partitionindex-1); //
            quicksort(arr,partitionindex+1,right); // �ݹ���ñ���,
        }
        return arr;
    }
    /**
     *     ��������,�����������Ի�׼Ϊ��ֱ������������,
     *     �����ıȽϽ�������,�����������������ʵ�ֵ�.
     *     Ȼ����ͨ��ǰ��ĵݹ����,��ѭ��ʹ�÷�������,ʵ������.
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
    // ��װͨ�÷���,������arr�е�arr[i]��arr[j]��ֵ����
    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
