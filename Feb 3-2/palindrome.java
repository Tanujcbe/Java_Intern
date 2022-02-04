import java.util.*;

class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i=0,j=s.length()-1,flag=0;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=1;
                System.out.println("Not Palindrome");
                break;
            }
            i++;
            j--;
        }
        if(flag==0)
            System.out.println("Palindrome");
    }
}
