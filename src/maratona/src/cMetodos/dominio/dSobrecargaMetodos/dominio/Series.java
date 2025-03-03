package cMetodos.dominio.dSobrecargaMetodos.dominio;

public class Series {
    private String nome;
    private int duracao;
    private int temporadas;
    private String tipo;

    public Series (String nome, int duracao, int temporadas){
        this.nome = nome;
        this.duracao = duracao;
        this.temporadas = temporadas;
    }
    public Series(String nome, int duracao, int temporadas, String tipo){
        this(nome,duracao, temporadas);
        this.tipo = tipo;
    }

        public void imprimeSerie(){
        System.out.println(nome);
        System.out.println(duracao);
        System.out.println(temporadas);
            System.out.println(tipo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
