import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeBasics {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2020,8,20);
        System.out.println(d);

        LocalTime t = LocalTime.now(ZoneId.of("GMT"));
        System.out.println(t);
    }
}
