package java01.day_4_9;

import My_tools.Boundlinetool;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * @outhor xiaoshe
 * @date 2019/4/10  - @time 19:06
 * 数学运算类Math
 * Math类中的大多数方法都被定义为静态的.
 * 所以其调用不需要通过实例化对象来调用.
 * Math类为我们提供了在数学上的众多运算方法
 */
public class Sty_Math {
    final  double Pi = Math.PI;  // 可以在定义常量的时候调用Math类中的常量.
    public static void main(String[] args) {
        Sty_Math styMath = new Sty_Math();
        styMath.styMathconstant(12);
        Boundlinetool.Minus();
        styMath.styTriangle(0.34,60);
        Boundlinetool.Minus();
        styMath.styindex(2,4);
        Boundlinetool.Minus();
        styMath.styAdjustment(3.45,5.3f);
        Boundlinetool.Minus();
        styMath.stytakequals(23.14,45.23);
        Boundlinetool.Minus();
        styMath.styrandom();
        Boundlinetool.Minus();
        styMath.styRandom(100);
        Boundlinetool.Minus();
        styMath.styBigInteger();
        Boundlinetool.Minus();
        styMath.styBigDecimal();
    }

    // 构建方法体输出圆面积.
    private void styMathconstant(float r){
    double aarea = Math.PI*r*r;  // 也可以直接在程序中调用Math类中的常量.
        System.out.println(aarea);
    }
    // 三角函数方法
    private void styTriangle(double subtense,double angdeg){
        System.out.println(Math.sin(subtense)); // 返回正弦
        System.out.println(Math.cos(subtense)); // 返回余弦
        System.out.println(Math.tan(subtense)); // 返回正切
        System.out.println(Math.asin(subtense)); // 返回一个值的反正弦
        System.out.println(Math.acos(subtense)); // 返回一个值的反余弦
        System.out.println(Math.atan(subtense)); // 返回一个值的反正切
        System.out.println(Math.toRadians(angdeg)); // 将角度转换为弧度
        System.out.println(Math.toDegrees(angdeg)); // 将弧度转换为角度
    }
    // 指数函数方法
    private void styindex(double adouble,double adouble1){
        System.out.println(Math.exp(adouble)); // 用于获取e的a次方
        System.out.println(Math.log(adouble)); // 用于取自然对数,lna的值
        System.out.println(Math.log10(adouble)); // 用于取底数为10的整数
        System.out.println(Math.sqrt(adouble)); // 用于取a的平方根,其中a的值不能为负值.
        System.out.println(Math.cbrt(adouble)); // 用于取a的立方根
        System.out.println(Math.pow(adouble,adouble1)); // 用于取a的b次方
    }
    // 取整函数方法
    private void styAdjustment(double adouble,float afloat){
        System.out.println(Math.ceil(adouble)); // 返回大于等于参数的最小整数.
        System.out.println(Math.floor(adouble)); // 返回小于等于参数的最大整数.
        System.out.println(Math.rint(adouble)); // 返回与参数最接近的整数(若为0.5取偶数,即加一)
        System.out.println(Math.round(adouble)); // 将参数家上0.5返回与参数最近的整数
        System.out.println(Math.round(afloat)); // 将参数加上0.5后返回与参数最近的整数,然后强转为长整型.
    }
    /**
     *  取最大值,最小值,绝对值函数方法.
     *  其方法都重载有多个类型的,满足不同类型参数的最大最小值,绝对值的获取.
     */
    private void stytakequals(double adouble,double adouble1){
        System.out.println(Math.max(adouble,adouble1)); // 取两个double型参数的最大值
        System.out.println(Math.min(adouble,adouble1));
        System.out.println(Math.abs(adouble)); // 返回double型参数的绝对值
    }
    /**
     * 随机数
     * Math类中有提供random方法来生产随机数.
     * 该方法默认生成0.0-1.0之间的double型随机数.
     * 但该方法通过处理后还是可以生成任何范围的随机数的.
     * ;将该方法*n后强转为int型输出,可以得到0-n范围的随机数.
     * 而m+(int)Math.random()*n,将上面的式子+m后,就可以得到m-(m+n)范围的随机数.
     */
    private void styrandom(){
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));
        System.out.println((int)(10+Math.random()*15));
        System.out.println((char)('a'+ Math.random()*('z'-'a'+1))); // 这里其实可以封装成一个获取固定范围的随机字符.
    }
    /**
     * Random类
     * Random类提供各种类型随机数的构造方法
     * 通过实例化对象调用.
     * 比Math.random更为强大.
     */
    private void styRandom(int n){ // 传入参数n 控制范围
        Random random = new Random(10000);
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());
    }
    /**
     * 大数字的运算
     * BigInteger类提供的数字叫Integer类提供的大的多,我们知道int型最大值为2^31-1,
     * 如果需要计算更大的值的运算就需要用到BigInteger类,
     * BigInteger类支持任何精度的整数,
     * 相当于在运算中,BigInteger类型可以精确表示任何大小的整数值.而不丢失信息.
     * BigInteger类的方法通过实例化对象调用.
     * BigInteger类还提供了了多种运算操作.
     */
    private void styBigInteger(){
        BigInteger bigInteger = new BigInteger("12345678901234567890"); // 直接通过构造法方法,将值转为BigInteger型.
        BigInteger bigInteger1 = new BigInteger("43534645376574567314253543");
        System.out.println(bigInteger.add(bigInteger1)); // 简单的运算
    }
    private void styBigDecimal(){
        BigDecimal bigDecimal = new BigDecimal(1231234345634.546756734563);
        BigDecimal bigDecimal1 = new BigDecimal("124235345645765.783452352342534");
        System.out.println(bigDecimal.max(bigDecimal1));
    }
}
