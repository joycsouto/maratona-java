package Gassociacao.test;


import Gassociacao.dominio.Jogador;

public class jogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ney");
        Jogador jogador3 = new Jogador("CR7");

        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        for (Jogador jogador: jogadores) {
            System.out.println(jogador);

        }


    }
}
