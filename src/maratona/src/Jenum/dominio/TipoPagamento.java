package Jenum.dominio;

public enum TipoPagamento {

    DEBITO{
        @Override
        public double CalcularDesconto(double valor) {
            desconto = valor * 0.1;
            return valor - desconto;
        }
    },
    CREDITO{
        @Override
        public double CalcularDesconto(double valor) {
             desconto = valor * 0.05;
             return valor - desconto;
        }
    };
    public double desconto;


    public abstract double CalcularDesconto(double valor);
}
