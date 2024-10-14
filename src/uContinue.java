public class uContinue {
    public static void main(String[] args) {
        int carro = 50000;
        for (int parcelas = carro; parcelas >= 1; parcelas--) {
            int valorParcelas = carro / parcelas;
            if (valorParcelas < 1000) {
                continue;
            }
            System.out.println("Parcelas " + parcelas + " valor das parcelas " + valorParcelas);
        }
    }
}
