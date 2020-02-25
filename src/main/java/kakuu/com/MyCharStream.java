package kakuu.com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyCharStream {
    public static void readChar(String path) {
        File f = new File(path);
        //创建字符读取流
        try(FileReader fr = new FileReader(f)){
            //创建字符数据，其长度就是文件的长度
            char[] all = new char[(int)f.length()];
            //以字符流的形式读取数据
            fr.read(all);
            for (char c : all) {
                System.out.println(c);
            }
        } catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void writeChar(String path, String content) {
        File f = new File(path);
        //准备字符流数组
        char[] all = content.toCharArray();
        //
        try(FileWriter fw = new FileWriter(f)){
            fw.write(all);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
