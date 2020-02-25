package kakuu.com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class MyDataStreamTest {
    @Test
    public void dataWriteTest() {
        String path = "D:/Project/Sample/ioProject/LOR.txt";
        boolean bl = true;
        int num = 7777777;
        String str = "Fiona is in a killing spring !";
        MyDataStream.writeData(path, bl, num, str);
        Assert.assertTrue(true);
    }

    @Test
    public void dataReadTest() {
        String path = "D:/Project/Sample/ioProject/LOR.txt";
        MyDataStream.readData(path);
        Assert.assertTrue(true);
    }
}
