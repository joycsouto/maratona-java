package RDatas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnit125 {
    public static void main(String[] args) {
        LocalDateTime quantosDiasVivi = LocalDateTime.of(2007, Month.AUGUST,23,11,45);
        LocalDateTime quantosDiasPaiViveu = LocalDateTime.of(1982, Month.FEBRUARY,12,11,45);
        LocalDateTime quantosDiasMaeViveu = LocalDateTime.of(1977, Month.APRIL,13,11,45);

        System.out.println(ChronoUnit.DAYS.between(quantosDiasVivi,LocalDateTime.now()));
        System.out.println(ChronoUnit.DAYS.between(quantosDiasPaiViveu,LocalDateTime.now()));
        System.out.println(ChronoUnit.DAYS.between(quantosDiasMaeViveu,LocalDateTime.now()));
  




    }
}
