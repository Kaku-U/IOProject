package kakuu.com;

import kakuu.com.MyStream;
import org.junit.Assert;
import org.junit.Test;

public class MyStreamTest {
    @Test
    public void readFileTest() {
        String s = "D:/Project/Sample/ioProject/DragonNest.txt";
        MyStream.readFile(s);
        Assert.assertTrue(true);
    }
    @Test
    public void writeFileTest() {
        String path = "D:/Project/Sample/ioProject/LOL.txt";
        String content = "League of legends";
        MyStream.writeFile(path,content);
        Assert.assertTrue(true);
    }
}
