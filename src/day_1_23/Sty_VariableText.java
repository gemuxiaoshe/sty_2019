package day_1_23;
//import day_1_23.Sty_Variable;
/**
 * �����������Ĳ����ࡣ
 * @author MaYaP
 */
public class Sty_VariableText { // ����
    int x=10;
    int y=20;
    
    public void main() {
        int x; // ������ľֲ��������Ա������ͬʱ����Ա��������ʱ���أ�
                // �ڸ÷������ڽ��޷��ٵ��øó�Ա������
        x=10*y; // ��ֵ��ʹ�ó�Ա������
        int y1=x*y;
        System.out.println(x);
        int x1=x*y+text();
        System.out.println(x1);
    }
    
    public int text() {
        int x1=x+123;
        return x1;
    }
    
    static int a=12;
    
    public static int text2() {
        int x1=a+3;
        return x1;
    }
    public static void main(String[] args) {
        int x=a*2;
        int y=x*text2();  // ���õ�ǰ��ľ�̬������
        int z=y+Sty_Variable.y; // ����Sty_Variable��ľ�̬����y��
        
//        static int b=2;   �ھ�̬������ʵ�������ж��޷�������̬������
//        ˵����̬����ֻ�������������У�����Ҳ˵���˾�̬���������ʡ�
//        �����Ҳֻ����Ϊ��Ա���������ڡ�
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        Sty_Variable.Var_text(); // ����Sty_Variable��ľ�̬����Var_text()��
        
        System.out.println("Sty_Variable��ľ�̬����y="+Sty_Variable.y); // ֱ�����Sty_Variable��ľ�̬����y��
    }
    /*
     * �Զ��׼��ģ���Ա����ֻ����ʵ�������б����á����޷��ھ�̬�����е��ã�
     * ͬ���ģ�ʵ������Ҳֻ���ڵ�ǰ���ʵ�������б����ã����޷��ھ�̬�����б����á�
     * ��������������µķ����������µ�ʵ������ȴ���޷����еģ���Ϊjava��Ľṹ���ơ�
     * java��Ľṹ�������Ժͷ�����
     * ��һ��java���࣬�����й̶���ʽ�������������ܹ������С�
     * �����java����������һ����̬�ķ�����ʹ����ֻ�ܵ��þ�̬�ĳ�Ա�������;�̬�ķ�����
     * ��ʹ��java����������Ȼ�����ƣ�ֻ�����о�̬�����;�̬������
     * 
     * ��ʵ��������ʵ����������˵����û��ʵ�ֵĵط�������ʱ��֪����������𵽵�������ʲô��
     * 
     */
}
