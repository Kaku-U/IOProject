package kakuu.com;

import kakuu.com.pojo.Hero;
import org.junit.After;
import org.junit.Test;

public class MyObjStreamTest {
    @Test
    public void writeObjTest() {
        Hero fiona = new Hero();
        fiona.name = "Fiona";
        fiona.hp = 570;
        String path = "D:/Project/Sample/ioProject/Fiona.txt";
        MyObjStream.writeObj(path,fiona);
    }

    @Test
    public void readObjTest() {
        String path = "D:/Project/Sample/ioProject/Fiona.txt";
        MyObjStream.readObj(path);
    }
}
