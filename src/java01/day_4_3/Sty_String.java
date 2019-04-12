package java01.day_4_3;
import java.util.Scanner;

/**
 * @outhor xiaoshe
 * @date 2019/4/3  - @time 18:29
 * �ַ�����ѧϰ
 */
public class Sty_String {

    public static void main(String[] args) {
        Sty_String styString = new Sty_String();
        styString.sty_createString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("�������ַ���:");
        String mstr = scanner.nextLine();
        System.out.println("������Ҫ��ѯ���ַ�(���ַ���):");
        String instr = scanner.next();
        System.out.println("����ָ���ַ���λ��:");
        int aint = scanner.nextInt();
        styString.Sty_getStringInfo(mstr,instr,aint);
        styString.sty_setString(mstr);
    }

    /**
     * String���е����ֹ����ַ����ķ���.
     */
    public void sty_createString(){
        String astr= "hello"; // �����ַ�����������һ���ַ�������.
        char a[] = {'a','b','c'};  // �ַ�����
        byte b[] = {2,54,23,12};  // byte������
        /**
         * String(char[])���췽��,���ַ��������е�ֵ������������һ���ַ�������.
         * */
        String s=new String(a);

        /**
         *  String(char a[],int offset,int length)����
         *  ��ȡ�ַ������е�һ���ַ������ַ�������.offset ��ʼ��ȡ��λ��.
         */
        String astr3 = new String(a,0,2);
        String astr4 = new String(b);
        String astr5 = new String(b,0,2);
        System.out.println(astr+"\n"+astr3+"\n"+astr4+"\n"+astr5);
    }
    /**
     * ��ȡ�ַ�����Ϣ
     */
    public void Sty_getStringInfo(String mstr ,String Instr,int aint){

        // ��ȡ�ַ�������.length()����
        System.out.println("���ַ����ĳ�����"+mstr.length());
        // �����ַ��� ,indexOf()����,lastIndex()����
        int fint = mstr.indexOf(Instr);
        int lint = mstr.lastIndexOf(Instr);
        System.out.println(Instr+"�ַ�(��)�״γ��ֵ�λ����:"+fint);
        System.out.println(Instr+"�ַ�(��)�����ֵ�λ����:"+lint);
        //��ȡָ��λ�õ��ַ�,charAt()����
        char setchar = mstr.charAt(aint);
        System.out.println(aint+"λ�õ��ַ���:"+setchar);
    }
    /**
     * �ַ�������
     */
    public void sty_setString(String mstr){
        /**
         * ��ȡ���ַ��� substring()����,���±�ֵ��ȡ���ַ���,�±�����0��ʼ��.
         * substring()���������ֲ�ͬ�����ط���,�ֱ�������ֲ�ͬ�Ľ�ȡ��ʽ.
         */

        String cstr = mstr.substring(3); // substring(int beginindex),��һ��int�Ͳ���,��ʾ�Ӳ�����ʼ��ȡ����β.
        String cstr2 = mstr.substring(3,6); // substring(int beginindex,int endindex)��������,��ʾ��ȡ��������֮����ַ���.
        System.out.println("�ӵ�3��ʼ��ȡ���ַ���"+cstr);
        System.out.println("��ȡ3��6�ַ���"+cstr2);


        //ȥ���ո�,trim()��������ֱ�ӷ����ַ����ĸ���,����ǰ����β���ո�.ͨ�����ڴ�����Ϣʱ,ȥ����β������Ŀո�.
        String vstr = mstr.trim();
        System.out.println("ȥ����λ�ո���ַ�������:"+vstr);

        //�ַ����滻,replace()��������ʵ�ֽ�ָ���ַ����ַ����滻���µ��ַ���.replace(char oldchar,char newchar)
        String nstr= mstr.replace('a','b');
        String nstr2 = mstr.replace("str","asr");
        System.out.println("�滻����ַ���"+nstr);
        System.out.println("�滻����ַ���"+nstr2);

        //�ж��ַ����Ƿ����,equals()�������ڱȽ������ַ����Ƿ����.
        System.out.println("�ַ����Ƿ��abc���:"+mstr.equals("abc"));
        System.out.println("�ַ����Ƿ��abc���:"+(mstr=="abc"));

        //�ж��ַ����Ŀ�ʼ��β startsWith(),endsWith()�����ֱ��ж��ַ����Ƿ���ָ������ʽ����.����ֵΪ��������.
        System.out.println("�ַ����Ƿ���a��ʼ:"+mstr.startsWith("a"));
        System.out.println("�ַ����Ƿ���.����:"+mstr.endsWith("."));

        /**
         * ���ֵ�˳��Ƚ������ַ���,compareTo()����Ϊ���ֵ�����Ƚ������ַ���,�Ƚ�����unicodeֵ.
         * ������String�����ʾ���ַ�����������ַ�������ʾ���ַ������н��бȽ�.
         * ���ַ�����,���String�����ڲ����ַ����е�ǰ��,����һ����ֵ,�ں��淵��һ����ֵ,������,�򷵻�0
         */
        System.out.println("���ַ���hyz���ֵ�������Ƚ�"+mstr.compareTo("hyz"));

        //��ĸ��Сдת��,toLowerCase(),toUpperCase()����.ǰ�߽��ַ��������ַ���д��ΪСд,���ߴ�Сд��Ϊ��д.
        System.out.println("�ַ���ȫתΪСд:"+mstr.toLowerCase());
        System.out.println("�ַ���ȫתΪ��д:"+mstr.toUpperCase());

        //�ַ����ָ�split()����,���������ֲ�ͬ�ķָʽ,split(String regex)����Ϊָ���ķָ��,
        String[] regexmstr = mstr.split("e");
        String[] regexmstr2 = mstr.split("e",3);
        for (String a: regexmstr){  // ���ַ������������ӡ.
            System.out.print("["+a+"]");
        }
        System.out.println(); // ����
        for (String a:regexmstr2){
            System.out.print("["+a+"]");
        }
    }
}
