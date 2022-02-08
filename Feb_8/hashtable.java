import java.util.Hashtable;
import java.util.Map;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
        hashtable.put(1, "Tanuj");
        hashtable.put(2,"Himansu");
        hashtable.put(3,"Zoho");
        hashtable.put(3,"Zoho Chennai");
        for ( Map.Entry m: hashtable.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
