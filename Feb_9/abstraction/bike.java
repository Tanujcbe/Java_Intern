public class bike extends vehicle{
    void display(){
        System.out.println("On Road");
    }
    public static void main(String[] args) {
        vehicle v =new bike();
        v.display();
    }
}
