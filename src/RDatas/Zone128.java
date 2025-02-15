package RDatas;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class Zone128 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZoneId fr = ZoneId.of("Europe/Paris");
        LocalDateTime now = LocalDateTime.now();

        //Will show by my time
        ZonedDateTime zonedDateTime = now.atZone(la);
        System.out.println(zonedDateTime);

        //By the LA zone
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime1 = instant.atZone(la);
        System.out.println(zonedDateTime1);

        //By the French zone
        ZonedDateTime zonedDateTimef = now.atZone(fr);
        System.out.println(zonedDateTimef);
        ZonedDateTime zonedDateTime2 = instant.atZone(fr);
        System.out.println(zonedDateTime2);

        //
        ZoneOffset manaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(manaus);
        System.out.println(offsetDateTime);

        OffsetDateTime manaus2= OffsetDateTime.of(now, manaus);
        System.out.println(manaus2);

        OffsetDateTime manaus3 = instant.atOffset(manaus);
        System.out.println(manaus3);

    }
}
