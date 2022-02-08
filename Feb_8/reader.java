import java.io.*;
import java.nio.file.*;

public class reader {
    public static void main(String[] args) throws IOException{
        File file = new File("file1.txt");
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String str;
        while((str = bReader.readLine())!= null){
            System.out.println(str);
        }
    }
}
