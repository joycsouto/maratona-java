package RDatas.ExerciciosDates.domain;

import AExercicosChatGPT.domain.Local;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String
            name;
    private LocalDate dataNascimento;

    public Pessoa(String name) {
        this.name = name;
        this.dataNascimento = dataNascimento;
    }

    public Period calculoAge(){
      Period age = Period.between(dataNascimento,LocalDate.now());
        System.out.println(name);
    System.out.println(age);
      return age;

}

}
