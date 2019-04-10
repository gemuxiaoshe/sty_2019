package day_4_9;

import java.util.Random;

/**
 * @outhor xiaoshe
 * @date 2019/4/10  - @time 20:38
 * Random类
 * Random类提供了获取各种类型随机数的方法.
 * 可以通过实例化Random对象来调用其方法.
 */
public class Sty_Random {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(100));
    }


}
