import java.util.*;

public class replcae_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        char ch=sc.next().charAt(0);
        char r_ch=sc.next().charAt(0);
        // for(int i=0;i<str1.length();i++){
            // if(str1.charAt(i)==ch)
                str1=str1.replace(ch,r_ch);
        // }
        System.out.println(str1);
    }
}
