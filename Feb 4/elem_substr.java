import java.util.*;

public class elem_substr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String res="";
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(i+j<str1.length() && str1.charAt(i+j)==str2.charAt(j)){
                    if(j==str2.length()-1)
                        i+=j;
                    continue;
                }
                else if(i+j>=str1.length() || str1.charAt(i+j)!=str2.charAt(j)){
                    res+=str1.charAt(i);
                    break;
                }
            }
        }
        System.out.println(res);
    }    
}
