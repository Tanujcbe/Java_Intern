import java.util.*;
public class exception_handling {
    static int div_zero(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        {
            int a=2,b=0;
            try{
                System.out.print("Division of 0 = ");
                System.out.println(div_zero(a, b));
            }
            catch(ArithmeticException ex){
                System.out.println(ex);
            }
        }
        
        System.out.println();

        {   
            int arr[] = new int[2];
            try{
                System.out.print("Accessing out of bound : ");
                int i = arr[5];
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException){
                System.out.println(indexOutOfBoundsException);
            }
        }

        System.out.println();

        {
            String str=null;
            try{
                System.out.print("Accessing null var length : ");
                System.out.println(str.length());
            }
            catch(NullPointerException nullPointerException){
                System.out.println(nullPointerException);
            }
        }
    }
}
