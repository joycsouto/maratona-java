package AExercicosChatGPT.Test;

import AExercicosChatGPT.domain.Estudantes;
import AExercicosChatGPT.domain.Local;
import AExercicosChatGPT.domain.Professor;
import AExercicosChatGPT.domain.Seminario;

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
