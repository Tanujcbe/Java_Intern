import java.util.*;  

class factorial{
    public static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int prod=fact(n);
        System.out.print(prod);
    }
}