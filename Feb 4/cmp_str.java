import java.util.*;

class cmp_str{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        System.out.println("With Case Difference : ");
        if(str1.equals(str2))
            System.out.print("Both Strings are equal");
        else 
            System.out.print("Both Strings are not equal");
        
        System.out.println("\nWithout Case Difference : ");
            if(str1.equalsIgnoreCase(str2))
                System.out.print("Both Strings are equal");
            else 
                System.out.print("Both Strings are not equal");


    }
}