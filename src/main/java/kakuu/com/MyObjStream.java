package kakuu.com;

import kakuu.com.pojo.Hero;

import java.io.*;
import java.io.ObjectInputStream;

public class MyObjStream {

    public static void writeObj(String path, Serializable obj) {
        File f = new File(path);
        /*Hero fiona = new Hero();
        fiona.name = "Fiona";
        fiona.hp = 570;*/
        try(
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
            )
        {
            oos.writeObject(obj);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readObj(String path) {
        File f = new File(path);
        try(
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis)
            )
        {
            Hero h = (Hero) ois.readObject();
            System.out.println(h.hp);
            System.out.println(h.name);
        } catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
