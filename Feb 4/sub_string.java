import java.util.*;

public class sub_string {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int cnt=0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i+j)!=str2.charAt(j))
                    break;
                if(j==str2.length()-1)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }    
}
