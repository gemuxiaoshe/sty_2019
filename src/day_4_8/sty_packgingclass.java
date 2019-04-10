package day_4_8;

/**
 * @outhor xiaoshe
 * @date 2019/4/8  - @time 22:26
 * 包装类
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
     * int型的包装类Integer。
     */
    public void packgingInt(){
        String str = "122";
        // 通过int型参数构建Integer对象
        Integer integer = new Integer(234);
        // 通过String型参数构建Integer对象
        Integer integer1 = new Integer("234");
        //直接以对象输出
        System.out.println(integer);
        System.out.println(integer1);
        // 以将对象以其他类型输出
        System.out.println(integer.byteValue());
        System.out.println(integer.floatValue());
        // Integer类提供的几个常用的方法
        // 通过toString方法讲对象以字符串形式输出。
        System.out.println(integer.toString());
        // compareTO方法和equals方法比较两个Integer的值。
        System.out.println(integer.equals(integer1));
        System.out.println(integer.compareTo(integer1));
        // 将一个String值的数据以Integer对象返回.
        System.out.println(Integer.valueOf(str).toString());
        // 将一个String字符串中的数字以等价的int整数值返回.
        System.out.println(Integer.parseInt(str));
    }
    /**
     * Boolean类
     */
    public void packgingBoolean(){
        String str ="flase";
        Boolean aBoolean = new Boolean(12<11);
        Boolean aBoolean1 = new Boolean("flase");
        System.out.println(aBoolean1);
        System.out.println(aBoolean.toString());
        //将对象的值以对应的boolean值返回
        System.out.println(aBoolean.booleanValue());
        //valueOf方法
        System.out.println(Boolean.valueOf(str));
        //paresBoolean方法
        System.out.println(Boolean.parseBoolean(str));
        // equals方法
        System.out.println(aBoolean.equals(aBoolean1));
    }
    /**
     * character类
     */
    public void packgingCharacter(){
        //构造方法实例化对象
        Character character = new Character('A');
        Character character1 = new Character('b');
        // 将对象以char型值返回
        System.out.println(character.charValue());
        //以数字比较两个对象
        System.out.println(character.compareTo(character1));
        //equals方法比较两个对象
        System.out.println(character.equals(character1));
        //大小写转换
        System.out.println(Character.toLowerCase(character));
        System.out.println(Character.toUpperCase(character1));
        //判断大小写
        System.out.println(Character.isLowerCase(character));
        System.out.println(Character.isUpperCase(character1));
    }
    /**
     * Double类
     */
    public void packgingdouble(){
        String str = "123.456d";
        Double aDouble = new Double(12.345d);
        Double aDouble1 = new Double("234.3456");
        //常用方法
        System.out.println(aDouble1.isNaN());
        System.out.println(aDouble.equals(aDouble1));
        System.out.println(aDouble.compareTo(aDouble1));
        System.out.println(aDouble.floatValue());
        Double.valueOf(aDouble);
        Double.parseDouble(str);
    }
}
