package cMetodos.dominio.Test;

import cMetodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joyce");
        pessoa.setIdade(17);
        pessoa.imprime();
        System.out.println( pessoa.getNome() + " " +pessoa.getIdade() );

    }
}
