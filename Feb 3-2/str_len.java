import java.util.*;

public class str_len {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i=0,cnt=0;
        try{
            while(s.charAt(i)!='\0'){
                cnt++;
                i++;
            }
        }
        catch(Exception e){
            System.out.println(cnt);
        }
    }
}
