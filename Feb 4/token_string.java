import java.util.StringTokenizer;  

public class token_string {
    public static void main(String args[]){  
        StringTokenizer str = new StringTokenizer("Hi, my name is Tanuj"," ");  
        while (str.hasMoreTokens()){  
            System.out.println(str.nextToken());  
        }  
    }  
    
}
