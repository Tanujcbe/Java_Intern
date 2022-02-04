import java.util.*;
import java.util.Arrays;

public class char_sort {
    public static void  main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        char s[]= str.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if('a'-s[i]<'a'-s[j]){
                    char temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println(s);
    }
}
