import java.time.*;
import java.time.format.DateTimeFormatter;
public class date_time {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Date: "+ld);
        LocalTime lt = LocalTime.now();
        System.out.println("Time:"+lt);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Date and Time "+ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String s = ldt.format(dtf);
        System.out.println("Date and Time after modification : "+s);
    }
}
