package kakuu.com;

import java.io.File;
import java.util.Date;

public class MyFile {
    public static void main(String[] args) {

        File f1 = new File("D:\\Project\\Sample\\ioProject");
        System.out.println("f1的绝对路径："+ f1.getAbsolutePath());

        File f2 =new File("LOL.txt");
        System.out.println("f2的绝对路径："+f2.getAbsolutePath());

        // 把f1作为父目录创建文件对象
        File f3 = new File(f1, "DOTA.txt");
        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
        System.out.println("f3的父路径：" + f3.getParent());

        File f4 = new File("D:\\Project\\Sample\\ioProject\\DN.txt");
        System.out.println("当前文件是：" +f4);
        //文件是否存在
        System.out.println("判断是否存在："+f4.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹："+f4.isDirectory());

        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f4.isFile());

        //文件长度
        System.out.println("获取文件的长度："+f4.length());

        //文件最后修改时间
        long time = f4.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);
        //设置文件修改时间为1970.1.1 08:00:00
        f4.setLastModified(0);

        //文件重命名
        File f5 =new File("D:\\Project\\Sample\\ioProject\\DragonNest.txt");
        f4.renameTo(f5);

        System.out.println("文件父路径" + f4.getParent());

    }
}
