public class static_kw{
    static{
        System.out.println("This is static block");
    }
    static void st(){
        System.out.println("This is static function");
    }
    public static void main(String[] args) {
        System.out.println("This is main block");
        st();
    }
}