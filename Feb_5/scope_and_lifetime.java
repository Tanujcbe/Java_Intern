public class scope_and_lifetime {
    int x, y;
    static int x1,y1;
    static int res; 
    int add(int a, int b){  
        x = a;
        y = b;
        return x+y;
    }
    public static int static_add(int a,int b){
        x1 = a;
        y1 = b;
        return x1+y1;
    }
    public static void main(String args[]){
        scope_and_lifetime obj = new scope_and_lifetime();
        System.out.println("Static add = " + static_add(50, 100));
        System.out.println("Add = " + obj.add(10, 20));
    }
}