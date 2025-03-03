package MPolimorifismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.05;
    protected String DataValidade;

    @Override
    public double Calculartaxa() {
        System.out.print("Calculando taxa ");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        DataValidade = dataValidade;
    }

    public String getDataValidade() {
        return DataValidade;
    }
}


