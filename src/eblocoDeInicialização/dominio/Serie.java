package eblocoDeInicialização.dominio;

public class Serie {
    private String nome;
    private int[] episodio;


    {
        episodio = new int[100];
        for (int i = 0; i < episodio.length; i++) {
            episodio[i] = i + 1;
        }
    }
    public Serie(String nome) {
        this.nome = nome;

    }

    public Serie() {



        for (int episodios : episodio) {
            System.out.print(episodios + " ");
        }
    }


    public int[] getEpisodio() {
        return episodio;
    }
}
