package RDatas.ExerciciosDates.test;

import RDatas.ExerciciosDates.domain.Pessoa;

import java.time.LocalDate;
import java.time.Period;

public class PessoaTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate local = LocalDate.of(2007,8,23);
        Period period =Period.between(local,now);
        System.out.println(period);
    }
}
