package day_4_8;

/**
 * @outhor xiaoshe
 * @date 2019/4/8  - @time 17:22
 *��
 * ��Java������,����ʹ��class�ؼ����������
 * ������в�ͬ��,ͨ����ǰ��Ĺؼ���������
 * Ҳ����Java���η�,һ�������,���η��޶������ʹ�÷�Χ.
 * class�������,class�Ƕ�����Ĺؼ���,�����������Ҫ�Զ�������,
 * ������������Ҫ��ѭjava��ʶ���Ĺ����.
 */
public class sty_class {
    // ͨ��������������������ò�ͬ��Ĳ�ͬ����.��Ϊֻ���������Żᱻ��������
    // ������Ҫʹ���κ���,����ķ�����ʹ��.����Ҫͨ�����������ò���ʵ��.
    public static void main(String[] args) {
        // ��Ҫ����ĳ�����ĳ������,����Ҫʵ����һ�������Ķ���,ͨ��ʵ����������÷���.
        // �޲εĹ��췽����������.
        animal animal = new animal();
        animal.eat();
        System.out.println(animal.getindepentThing());
        //�вεĹ��췽��,��������
        animal animal1 = new animal(true);
        animal1.setindepentThing(false);
        System.out.println(animal1.getindepentThing());
        System.out.println(args.length);
    }
    public static class book{

    }
}
/**
 * ������ͬһ��java�ļ���,�������������ͬ����.
 * ����animal������.
 * ͨ��������װ��������Ժ���Ϊ.
 */
class animal{
    // ��ŶJava������,ͨ����ĳ�Ա������ʾ���������.
    private boolean independentThing;

    // ��Ա����,��ȡ��Ա����
    public boolean getindepentThing(){
        return this.independentThing;
    }
    // ��Ա����,���ó�Ա����
    public void setindepentThing(boolean independentthing){
        this.independentThing = independentthing;
    }
    /**
     * ���췽��
     */
    public animal(){  // �޲εĹ��췽��.
        this.independentThing= false;
    }
    public animal(boolean independentthing){  // �вεĹ��췽��
        this.independentThing = independentthing;
    }
    // ��Java��ͨ��������������ʽ,����ʾ�������Ϊ.
    void eat(){
        System.out.println("����ĳ���Ϊ");
    }
}