import java.util.*;

public class replace_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        // String str2="";
        String s=sc.nextLine();
        String r_str=sc.nextLine();

        str1=str1.replace(s,r_str);

        System.out.println(str1);
    }
}

