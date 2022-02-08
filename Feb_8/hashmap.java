import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
        hashmap.put(1, "Tanuj");
        hashmap.put(2,"Himansu");
        hashmap.put(3,"Zoho");
        hashmap.put(3,"Zoho Chennai");
        for ( Map.Entry m: hashmap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
