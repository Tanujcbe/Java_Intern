import java.util.Scanner;
public class equal_to {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str1 = "Tanuj";
        String str2 = "Tanuj";
        String str3 =  new String("Tanuj");
  
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)+"\n");
        System.out.println(str1 == str3);  
        System.out.println(str1.equals(str3)); 
    }
}
