package kakuu.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyStream {
    public static void readFile(String path) {
        File f = new File(path);
        //try with source
        /*
        * 所有的流Stream，都实现了一个接口叫做 AutoCloseable，任何类实现了这个接口，都可以在try()中进行实例化。
        * 并且在try, catch, finally结束的时候自动关闭，回收相关资源。
        * */
        try(FileInputStream fis = new FileInputStream(f)){
            //创建基于文件的输入流
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
            //创建字节数组长度等于文件的长度
            byte[] all = new byte[(int) f.length()];
            //以字节流的形式读取文件的所有内容1
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
            //每次使用完流都需要关闭

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFile(String path,String content) {
        File f = new File(path);
        //初始化byte数组
        byte[] all = content.getBytes();
        //创建try-with-source 的文件输出流
        try(FileOutputStream fos = new FileOutputStream(f)){
            //数据输出流
            fos.write(all);
            //关闭输出流
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
