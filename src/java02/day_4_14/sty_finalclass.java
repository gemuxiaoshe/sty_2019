package java02.day_4_14;

/**
 * @outhor xiaoshe
 * @date 2019/4/14  - @time 22:28
 * final��
 */
public class sty_finalclass {
    public static void main(String[] args) {
        t_final t_final = new t_final();
        t_final.text();
    }
}
// final �಻�ܱ��̳�,���ܱ��Ķ�.ֻ�ܹ�ʵ��������,�������static�ؼ���,�Ϳ��Ե���һ��������һ��ʹ��.
final class t_final{
    void text(){
        System.out.println("final���еķ���");
    }
}