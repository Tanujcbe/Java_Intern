public class stringBuffer {
    public static void main(String args[]) {
        String str = "Welcome to Zoho";
        str= str.toLowerCase();
        System.out.println("String: "+str);

      StringBuffer buffer=new StringBuffer("Welcome to ");
      buffer.append("Chennai");
      System.out.println("String Buffer:   " +buffer);
     }
}
