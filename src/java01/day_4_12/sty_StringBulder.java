package java01.day_4_12;

/**
 * @outhor xiaoshe
 * @date 2019/4/12  - @time 19:08
 *�ɱ��String����.
 *������ʹ��String�����ַ��������,�䳤�Ⱦ����Ѿ��̶�����.
 * ��Ȼͨ��+���ſ��Դﵽ�����ַ�����Ŀ��,��ͨ��+����ʵ�����½���һ��Stringʵ������.
 * �൱��������String����Ĳ������.
 *
 * java�ṩ��StringBuilder��,��ʵ�����Ķ�����һ����̬�ɱ���ַ���.
 */
public class sty_StringBulder {
    public static void main(String[] args) {
        sty_StringBulder stringBulder = new sty_StringBulder();
        stringBulder.aString();
        stringBulder.aStringBuilder();
    }

    private void aString(){
        String astr = "С������";
        System.out.println(astr.replace("����","Ůʿ"));

    }
    private void aStringBuilder(){
        StringBuilder builder = new StringBuilder();
        // SringBuildr���е�append����,׷������,�൱������ĩβ���.
        System.out.println(builder.append("abcdef"));
        //StringBuilder���е�instert����(��������)
        System.out.println(builder.insert(2," this is  instert String "));
        System.out.println(builder.length());
        //StringBuilder���е�delete����
        System.out.println(builder.delete(1,5));
        System.out.println(builder.length());

    }
}
