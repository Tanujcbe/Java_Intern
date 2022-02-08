import java.util.*;
import java.io.*;
public class properties{
    public static void main(String[] args) throws Exception
    {
        Properties p = new Properties();
        p.setProperty("name", "Tanuj M");
        p.setProperty("email","tanuj.murali@zohocorp.com");

        p.store(new FileWriter("information.properties"),"Project Trainee");
    }
}