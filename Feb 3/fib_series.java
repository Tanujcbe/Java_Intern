import java.util.*;  

class fib_series{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();
        int first=0,sec=1;
        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
            int temp=first;
            first=sec;
            sec+=temp;
        }
    }
}