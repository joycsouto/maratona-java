package bJavaOO.dominio.teste;

import bJavaOO.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "jójó";
        estudante.idade = 17;
        estudante.sexo = 'F';
        System.out.println("nome " + estudante.nome + " sexo "+estudante.sexo +" idade " +estudante.idade);
    }
}
