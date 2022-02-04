import java.util.*;

public class split_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str="Hello my name is Tanuj";
        String[] s_array = str.split("[, . ']+");
        for(int i=0;i<s_array.length;i++){
            System.out.println(s_array[i]);
        }
    }
}
