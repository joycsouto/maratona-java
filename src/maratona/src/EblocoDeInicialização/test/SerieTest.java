package EblocoDeInicialização.test;

import EblocoDeInicialização.dominio.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie("Joyce");

        for (int episodio : serie.getEpisodio()) {
            System.out.print(episodio + " ");

        }

    }
}
