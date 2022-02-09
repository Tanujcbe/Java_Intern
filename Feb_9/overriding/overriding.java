public class overriding {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.print(); 
        v.hello();
        bike b = new bike();
        b.print();
        b.hello();
    }    
}
