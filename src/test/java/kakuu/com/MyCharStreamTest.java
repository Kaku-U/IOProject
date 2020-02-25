package kakuu.com;

import kakuu.com.MyStream;
import org.junit.Assert;
import org.junit.Test;

public class MyCharStreamTest {
    @Test
    public void readCharTest() {
        String s = "D:/Project/Sample/ioProject/DragonNest.txt";
        MyCharStream.readChar(s);
        Assert.assertTrue(true);
    }

    @Test
    public void writeCharTest() {
        String path = "D:/Project/Sample/ioProject/LOL.txt";
        String content = "League of legends";
        MyCharStream.writeChar(path,content);
        Assert.assertTrue(true);
    }
}
