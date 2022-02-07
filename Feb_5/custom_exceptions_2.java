public class custom_exceptions_2 extends Exception {
    String str;
    custom_exceptions_2(String msg){
        str= msg;
    }
    public String toString(){
        return ("Occured Error is : " + str);
    }
}
