package day_4_8;

/**
 * @outhor xiaoshe
 * @date 2019/4/8  - @time 22:26
 * ��װ��
 */
public class sty_packgingclass {
    public static void main(String[] args) {
        sty_packgingclass packgingclass = new sty_packgingclass();
        packgingclass.packgingInt();
        packgingclass.packgingBoolean();
        packgingclass.packgingCharacter();
        packgingclass.packgingdouble();
    }
    /**
     * int�͵İ�װ��Integer��
     */
    public void packgingInt(){
        String str = "122";
        // ͨ��int�Ͳ�������Integer����
        Integer integer = new Integer(234);
        // ͨ��String�Ͳ�������Integer����
        Integer integer1 = new Integer("234");
        //ֱ���Զ������
        System.out.println(integer);
        System.out.println(integer1);
        // �Խ������������������
        System.out.println(integer.byteValue());
        System.out.println(integer.floatValue());
        // Integer���ṩ�ļ������õķ���
        // ͨ��toString�������������ַ�����ʽ�����
        System.out.println(integer.toString());
        // compareTO������equals�����Ƚ�����Integer��ֵ��
        System.out.println(integer.equals(integer1));
        System.out.println(integer.compareTo(integer1));
        // ��һ��Stringֵ��������Integer���󷵻�.
        System.out.println(Integer.valueOf(str).toString());
        // ��һ��String�ַ����е������Եȼ۵�int����ֵ����.
        System.out.println(Integer.parseInt(str));
    }
    /**
     * Boolean��
     */
    public void packgingBoolean(){
        String str ="flase";
        Boolean aBoolean = new Boolean(12<11);
        Boolean aBoolean1 = new Boolean("flase");
        System.out.println(aBoolean1);
        System.out.println(aBoolean.toString());
        //�������ֵ�Զ�Ӧ��booleanֵ����
        System.out.println(aBoolean.booleanValue());
        //valueOf����
        System.out.println(Boolean.valueOf(str));
        //paresBoolean����
        System.out.println(Boolean.parseBoolean(str));
        // equals����
        System.out.println(aBoolean.equals(aBoolean1));
    }
    /**
     * character��
     */
    public void packgingCharacter(){
        //���췽��ʵ��������
        Character character = new Character('A');
        Character character1 = new Character('b');
        // ��������char��ֵ����
        System.out.println(character.charValue());
        //�����ֱȽ���������
        System.out.println(character.compareTo(character1));
        //equals�����Ƚ���������
        System.out.println(character.equals(character1));
        //��Сдת��
        System.out.println(Character.toLowerCase(character));
        System.out.println(Character.toUpperCase(character1));
        //�жϴ�Сд
        System.out.println(Character.isLowerCase(character));
        System.out.println(Character.isUpperCase(character1));
    }
    /**
     * Double��
     */
    public void packgingdouble(){
        String str = "123.456d";
        Double aDouble = new Double(12.345d);
        Double aDouble1 = new Double("234.3456");
        //���÷���
        System.out.println(aDouble1.isNaN());
        System.out.println(aDouble.equals(aDouble1));
        System.out.println(aDouble.compareTo(aDouble1));
        System.out.println(aDouble.floatValue());
        Double.valueOf(aDouble);
        Double.parseDouble(str);
    }
}
