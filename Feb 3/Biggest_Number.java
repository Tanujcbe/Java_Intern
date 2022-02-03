// import java.io;

public class Biggest_Number{
    public static void main(String[] args){
        int arr[]={23,435,12,24,25,63,54,32,97,74};
        int maxx=arr[0];
        for(int i=1;i<arr.length;i++){
            maxx=Math.max(maxx,arr[i]);
        }
        System.out.println(maxx);
    }
}