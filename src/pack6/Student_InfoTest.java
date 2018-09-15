package pack6;

import org.junit.Test;
import pack1.PalindromeCheck;

import static org.junit.Assert.*;

public class Student_InfoTest {

    @Test
    public void avg() {
        float expectedValue=(float)35;
        Student_Info t = new Student_Info();
        int arr1[]={20,40,30,50};
        //act
        float actualValue = t.avg(4, arr1);

        //Assert
        assertEquals(expectedValue, actualValue,0.0f);
    }

    @Test
    public void min() {
        int expectedValue=20;
        Student_Info t = new Student_Info();
        int arr1[]={20,40,30,50};
        //act
        int actualValue = t.min(4, arr1);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void max() {
        int expectedValue=50;
        Student_Info t = new Student_Info();
        int arr1[]={20,40,30,50};
        //act
        int actualValue = t.max(4, arr1);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}