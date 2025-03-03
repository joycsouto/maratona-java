package RDatas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Duration123 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now().minusHours(7);
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.now().plusYears(3).plusMinutes(5);
        Duration duration1 = Duration.between(localDateTime1,localDateTime2);
        Duration duration2 = Duration.between(localTime,localTime1);
        Duration duration3 = Duration.between(Instant.now(),Instant.now().plusSeconds(100));
        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
    }
}
