package Dmetodos.dominio.Test;

import Dmetodos.dominio.Estudante;
import Dmetodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Joyce";
        estudante01.idade = 17;
        estudante01.sexo = 'F';

         estudante02.nome = "Luisa";
        estudante02.idade = 47;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);

        estudante01.imprime();
        estudante02.imprime();


    }
}
