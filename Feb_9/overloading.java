import java.io.*;
public class overloading {
    public static void adding(int a,int b){
        System.out.println(a+b);
    }
    public static void adding(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        adding(5,10);
        adding(20,30,40);
    }
}
