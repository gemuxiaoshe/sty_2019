package java02.day_4_13;

/**
 * @outhor xiaoshe
 * @date 2019/4/14  - @time 21:49
 * ���������ת��
 */
public class sty_Typeconversion{
    public static void main(String[] args) {  //����������
        square square = new square();  // ʵ���������ζ���
        square.draw(square); // ���ø��෽��,�����������Ϊ������󴫲���,����ת��.
        quadrilateral q = new square();  // ���������ֵ���������Ͷ���.
        //  square s = q;  // ֱ�ӽ��������ת��Ϊ��������ǲ��е�,�ᱨ��.
        square s = (square) q;  // ֻ��ͨ��ǿ������ת��������ת��
        System.out.println(s instanceof square);
    }
}
// �����ı�����
class quadrilateral{
   public void draw(quadrilateral q){
       System.out.println("�����ı���");
    }
}
// �������������μ̳��ı�����
class square extends quadrilateral {
}