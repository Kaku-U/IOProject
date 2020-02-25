package kakuu.com;

import java.io.*;

/*
* 以介质是硬盘为例，字节流和字符流的弊端：
* 在每一次读写的时候，都会访问硬盘。 如果读写的频率比较高的时候，其性能表现不佳。
* 为了解决以上弊端，采用缓存流。
* 缓存流在读取的时候，会一次性读较多的数据到缓存中，以后每一次的读取，都是在缓存中访问。
* 直到缓存中的数据读取完毕，再到硬盘中读取。
* */
public class MyBufferStream {
    public static void readBuffer(String path) {
        File f = new File(path);
        try(
                FileReader fr = new FileReader(f);
                //BufferReader 缓存流必须建立在一个存在的流的基础上
                BufferedReader br = new BufferedReader(fr);
            )
        {
            while (true){
                //一次读一行
                String line = br.readLine();
                if(line == null) break;
                //输出行
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void writeBuffer(String path, String[] content) {
        File f = new File(path);
        try(
                FileWriter fw = new FileWriter(f);
                //PrintWriter 缓存流必须建立在一个存在的流的基础上
                PrintWriter pw = new PrintWriter(f);
        )
        {
            for (String s :content ) {
                pw.println(s);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
