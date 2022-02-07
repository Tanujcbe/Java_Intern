public class access_spec_2 {
    private static void prv(){
        System.out.println("This is private class");
    }
    protected static void prtcd(){
        System.out.println("This is protected class");
    }
    public static void pub(){
        System.out.println("This is public class");
        prv();
    }
}
