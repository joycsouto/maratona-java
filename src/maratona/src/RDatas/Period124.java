package RDatas;

import Linterfaces.test.DataLoaderTest;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Period124 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusYears(3);
        Period period1 = Period.between(localDate,localDate1);
        Period period2 = Period.ofMonths(10);
        Period period3 = Period.ofDays(100);
        Period period4 = Period.ofWeeks(100);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(Period.between(localDate,localDate.plusDays(period4.getDays())));
        System.out.println(localDate.until(localDate.plusDays(period4.getDays()),ChronoUnit.DAYS));

    }
}
