package MPolimorifismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.20;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double Calculartaxa() {
        System.out.print("Calculando taxa ");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
