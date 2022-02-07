public class custom_exceptions{
    public static void main(String[] args) {
        // custom_exceptions_2 ce=new custom_exceptions_2();
        try{
            throw new custom_exceptions_2("Custom Error is created");
        }
        catch(custom_exceptions_2 exception){
            System.out.println(exception);
        }
    }
}
