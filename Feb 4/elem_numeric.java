import java.util.*;

public class elem_numeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=new String("");
        int ch=0,x=0;
        for(int i=0;i<str1.length();i++){
            if(!(str1.charAt(i)>='0' && str1.charAt(i)<='9'))
                str2+=str1.charAt(i);
        }
        System.out.println(str2);
    }    
}
