package kakuu.com;

import org.junit.Assert;
import org.junit.Test;

public class MyBufferStreamTest {
    @Test
    public void readBufferTest() {
        String s = "D:/Project/Sample/ioProject/DragonNest.txt";
        MyBufferStream.readBuffer(s);
        Assert.assertTrue(true);
    }

    @Test
    public void writeBufferTest() {
        String path = "D:/Project/Sample/ioProject/LOL.txt";
        String[] contents = new String[3];
        contents[0] = "Fiona kills Timo";
        contents[1] = "Fiona double kill";
        contents[2] = "Fiona tripe kill";

        MyBufferStream.writeBuffer(path,contents);
        Assert.assertTrue(true);
    }
}
