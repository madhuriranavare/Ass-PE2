package pack9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileExtensionTest {
    FileExtension e;
    @Before
    public void setUp() throws Exception {
         e=new FileExtension();
    }

    @After
    public void tearDown() throws Exception {
        e = null;
    }

    @Test
    public void read() {
        assertEquals("failed","madhuri",FileExtension.read("/home/cgi/Desktop/","check_file.txt"));
        //assertEquals("failed","shreelekhya gampa",FileExtension.read("/home/cgi/IdeaProjects/Objects101PE/src/Java/","testing.csv"));
    }
}