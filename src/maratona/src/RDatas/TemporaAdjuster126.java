package RDatas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporaAdjuster126 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfWeek());
        //add the day but change the month and year
        now = now.plusDays(2);
        System.out.println(now);

        //just replace the month don't change the others aspects
        now = now.withDayOfMonth(15);
        System.out.println(now);
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);

        //Allow to find specifics dates
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
