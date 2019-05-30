package java02.day_5_15;

import java.io.*;

/**
 * @outhor xiaoshe
 * @date 2019/5/15  - @time 17:29
 * Java�е����������.
 */
public class sty_IO {

    public static void main(String[] args) throws IOException {
        sty_IO sty_io = new sty_IO();
        sty_io.FileText();
        sty_io.FileIo();
    }
    /**
     * �½�һ���򵥵Ĵ���/ɾ���ļ��ķ���.
     */

    void FileText() throws IOException {
        File file = new File("D:/hello.txt");
        if (file.isFile()){
            System.out.println(file.getName());
            System.out.println(file.length());
            System.out.println(file.isHidden());
            System.out.println(file.getParent());
            System.out.println(file.getAbsolutePath());
        }else {
            file.createNewFile();
            System.out.println("�Ѵ����ļ�");
        }
    }
    /**
     * �½�һ������,����ʵ�����ļ��Ķ�д.
     */
    void FileIo() throws IOException {
        File file = new File("D:/FileIo.txt");//1. �����½��ļ�.
        // 2.�������������.
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            // �½�byte������,��Ҫд�����Ϣ��ʱ��byte���������ʽ����.
            byte[] bytes = "����һֻСè��.".getBytes();
            // д���ļ�
            fileOutputStream.write(bytes);
            // �ر������.
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // �½�FileInputStream����.
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytesin = new byte[1024];
        int len = fileInputStream.read(bytesin);
        System.out.println("�ļ���Ϣ:"+ new String(bytesin,0,len));
        fileInputStream.close();
    }
}
