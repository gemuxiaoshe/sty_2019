package java02.day_5_15;

import java.io.*;

/**
 * @outhor xiaoshe
 * @date 2019/5/15  - @time 17:29
 * Java中的输入输出流.
 */
public class sty_IO {

    public static void main(String[] args) throws IOException {
        sty_IO sty_io = new sty_IO();
        sty_io.FileText();
        sty_io.FileIo();
    }
    /**
     * 新建一个简单的创建/删除文件的方法.
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
            System.out.println("已创建文件");
        }
    }
    /**
     * 新建一个方法,尝试实现下文件的读写.
     */
    void FileIo() throws IOException {
        File file = new File("D:/FileIo.txt");//1. 首先新建文件.
        // 2.创建输出流对象.
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            // 新建byte型数组,将要写入的信息暂时以byte型数组的形式保存.
            byte[] bytes = "我有一只小猫咪.".getBytes();
            // 写入文件
            fileOutputStream.write(bytes);
            // 关闭输出流.
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 新建FileInputStream对象.
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytesin = new byte[1024];
        int len = fileInputStream.read(bytesin);
        System.out.println("文件信息:"+ new String(bytesin,0,len));
        fileInputStream.close();
    }
}
