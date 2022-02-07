import java.io.*;



class prim_d_types{

    public static class structure{
        public int x[] = new int[3];
    };

    public static void change_data(int a[]){
        a[0]=15;
    }
    public static void main(String[] args){
        int a[]={10,20,30};
        System.out.println("Before \tAfter");
        System.out.print(a[0]+"\t");
        change_data(a);
        System.out.println(a[0]);
        structure st_arr=new structure();
        // st_arr.x={100,200,300};
        st_arr.x[0]=100;
        st_arr.x[1]=200;
        st_arr.x[2]=300;
        System.out.print(st_arr.x[0]+"\t");
        change_data(st_arr.x);
        System.out.println(st_arr.x[0]);
    }
}