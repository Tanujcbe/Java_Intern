import java.util.Properties;
public class GetSystemProperties {
    public static void main(String[] args) {
        Properties prop = System.getProperties();
        System.out.println("Printing all System properties");
        prop.list(System.out);
    }
}
