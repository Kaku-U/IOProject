package kakuu.com;

import java.io.File;

public class FindFile {
    public static void main(String[] args) {
//       FindFile.find("F:\\eiga");
        FindFile.findAll("F:\\eiga");

        System.out.println("长度最大的文件名："+maxFile);
        System.out.println("文件大小是："+maxSize);
        System.out.println("长度最小的文件名："+minFile);
        System.out.println("文件大小是："+minSize);

    }

    public static void find(String path) {
        File file = new File(path);

        File[] fs = file.listFiles();
        File MaxFile = fs[0];
        File MinFile = fs[0];
        for (int i = 0; i < fs.length; i++) {
            System.out.println(fs[i]);
            if (fs[i].length() > MaxFile.length())
                MaxFile = fs[i];
            if (fs[i].length() < MinFile.length())
                MinFile = fs[i];
            System.out.println("长度最大的文件名：" + MaxFile.getName());
            System.out.println("长度最小的文件名:" + MinFile.getName());
        }
    }

    public static void findAll(String path) {
        File fs = new File(path);
        if (fs.isDirectory()) {
            File[] fis = fs.listFiles();
            if (fis == null) {
                return ;
            }
            for (File f : fis) {
                findAll(f.getAbsolutePath());
            }
        }

        else if (fs.isFile()) {
            System.out.println(fs.getName());
            if (fs.length() > maxSize) {
                maxSize = fs.length();
                maxFile = fs;
            }
            else if (fs.length() < minSize && fs.length() != 0) {
                minSize = fs.length();
                minFile = fs;
            }

        }

    }

    static long minSize = Integer.MAX_VALUE;
    static long maxSize = 0;
    static File minFile = null;
    static File maxFile = null;
}
