import java.io.*;
import java.util.Scanner;
public class float_to_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float val = sc.nextFloat();
        int Int_Val = val.intValue();
        System.out.println(Int_Val);
    }
}
