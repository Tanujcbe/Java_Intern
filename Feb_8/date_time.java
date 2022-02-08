import java.time.*;
import java.util.Date;
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

        Date date = new Date();
        long milliseconds = date.getTime();
        System.out.println("Time in milliseconds: " + milliseconds);

        ZoneId singaporeId = ZoneId.of("Asia/Singapore");
        System.out.println("Singapre Zone ID : "+ldt.atZone(singaporeId).format(dtf));
    }
}
