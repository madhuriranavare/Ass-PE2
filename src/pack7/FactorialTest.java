package pack7;

import org.junit.Test;
import pack5.EvenNumTest;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void getFact() {
        long expectedValue = 120;
        Factorial e = new Factorial();
        //act
        long actualValue = e.getFact(5);
        assertEquals(expectedValue, actualValue);
    }
}