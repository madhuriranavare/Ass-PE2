package pack5;

import org.junit.Test;
import pack4.FileRead;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Test
    public void isEvenCheck() {
        boolean expectedValue = true;
        EvenNumTest e = new EvenNumTest();
        //act
        boolean actualValue = e.isEven(2);

        assertEquals(expectedValue, actualValue);
    }
}