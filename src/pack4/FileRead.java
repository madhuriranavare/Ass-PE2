package pack4;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public long fileLength() throws IOException {
        // variable declaration
        long length;
        File file = new File("/home/cgi/Desktop/file1.txt");
        length = file.length();
        return length;

    }

    public String UpperCase()throws IOException {
        File file = new File("/home/cgi/Desktop/file1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String res="";
        while ((st = br.readLine()) != null)
            res = res+st.toUpperCase();

        return res;
    }
}