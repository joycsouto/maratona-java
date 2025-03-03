package AExercicos.exercicioAssociacao.test;


import AExercicos.exercicioAssociacao.domain.Local;

import AExercicos.exercicioAssociacao.domain.Estudantes;
import AExercicos.exercicioAssociacao.domain.Professor;
import AExercicos.exercicioAssociacao.domain.Seminario;


public class GerenciamentoSeminarios {
    public static void main(String[] args) {
        Local local = new Local("AV. Brasil 9999");
        Seminario seminario = new Seminario("Matemática");
        Estudantes estudante = new Estudantes("Joyce ", 17);
        Estudantes estudantes01 = new Estudantes("Luisa", 47);
        Professor prof = new Professor("Xavier", "portugues");
        Estudantes[] estudantes = {estudante,estudantes01};
        Seminario[] seminarios = {seminario};


        estudantes01.setSeminario(seminario);
        estudante.setSeminario(seminario);
        seminario.setEstudantes(estudantes);
        seminario.setLocal(local);
        prof.setMinistrarSeminarios(seminarios);

        System.out.println("--- INFORMAÇÕES DO SEMINÁRIO ---");

        prof.imprime();


    }
}
