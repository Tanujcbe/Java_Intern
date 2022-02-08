import java.nio.file.*;
import java.util.Scanner;
import java.io.*;
public class writer {
    public static void main(String[] args) throws IOException{
        String text  = "Hello,\nThis is Tanuj\n";
        Path fileName = Path.of("file1.txt");
        Files.writeString(fileName, text);
        String file_content = Files.readString(fileName);
        System.out.println(file_content);

        Scanner sc = new Scanner(System.in);
        String text2 = sc.nextLine();
        System.out.println();

        Files.writeString(fileName, file_content+text2);
        file_content = Files.readString(fileName);
        System.out.println(file_content);
    }
}
