public class student {
    public static void main(String[] args) {
        System.out.println("Single level inheritance");
        college c = new college();
        c.print_college();
        c.print_world();

        System.out.println();

        System.out.println("Multilevel level inheritance");
        work w = new work();
        w.print_work();
        w.print_college();
        c.print_world();

        System.out.println();

        System.out.println("Hirarchy level inheritance");
        school s = new school();
        s.print_school();
        s.print_college();
        s.print_world();
    }
}
