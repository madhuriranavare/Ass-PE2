package pack4;

import org.junit.Test;

import java.io.IOException;
import java.lang.String;

import static org.junit.Assert.*;

public class FileReadTest {

    @Test
    public void fileLength() throws IOException {
        long expectedValue = 14;
        FileRead m = new FileRead();
        //act
        long actualValue = m.fileLength();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void upperCase() throws IOException {
        String expectedValue = "HI THIS IS ME";
        FileRead m = new FileRead();
        //act
        String actualValue = m.UpperCase();

        assertEquals(expectedValue, actualValue);
    }
}