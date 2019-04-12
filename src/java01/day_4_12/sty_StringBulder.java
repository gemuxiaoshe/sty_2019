package java01.day_4_12;

/**
 * @outhor xiaoshe
 * @date 2019/4/12  - @time 19:08
 *可变的String序列.
 *在我们使用String创建字符串对象后,其长度就是已经固定的了.
 * 虽然通过+符号可以达到附加字符串的目的,但通过+号其实还是新建了一个String实例对象.
 * 相当于是两个String对象的并列输出.
 *
 * java提供的StringBuilder类,其实例化的对象是一个动态可变的字符串.
 */
public class sty_StringBulder {
    public static void main(String[] args) {
        sty_StringBulder stringBulder = new sty_StringBulder();
        stringBulder.aString();
        stringBulder.aStringBuilder();
    }

    private void aString(){
        String astr = "小舍先生";
        System.out.println(astr.replace("先生","女士"));

    }
    private void aStringBuilder(){
        StringBuilder builder = new StringBuilder();
        // SringBuildr类中的append方法,追加内容,相当于在其末尾添加.
        System.out.println(builder.append("abcdef"));
        //StringBuilder类中的instert方法(插入内容)
        System.out.println(builder.insert(2," this is  instert String "));
        System.out.println(builder.length());
        //StringBuilder类中的delete方法
        System.out.println(builder.delete(1,5));
        System.out.println(builder.length());

    }
}
