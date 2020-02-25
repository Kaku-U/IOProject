package kakuu.com;

import java.io.*;

public class MyDataStream {
    public static void readData(String path) {
        File f = new File(path);
        try(
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis)
            )
        {
            boolean b =dis.readBoolean();
            int i = dis.readInt();
            String str =dis.readUTF();

            System.out.println("读取到布尔值："+b);
            System.out.println("读取到整数值："+i);
            System.out.println("读取到字符串："+str);

        } catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void writeData(String path,boolean bl,int num,String str) {
        File f = new File(path);
        try(
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos)
            )
        {
            dos.writeBoolean(bl);
            dos.writeInt(num);
            dos.writeUTF(str);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
