import java.util.*;
public class cnt_char {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int low=0,up=0,spc=0,dig=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                low++;
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                up++;
            else if(str.charAt(i)>='0' && str.charAt(i)<='9')
                dig++;
            else
                spc++;
        }     
        System.out.println("Lower Case: "+low);
        System.out.println("Upper Case: "+up);   
        System.out.println("Digits: "+ dig);
        System.out.println("Special Charecters: "+spc);
    }
}
