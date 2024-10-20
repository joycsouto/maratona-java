package BásicoJava;

public class ExerciseBreak {
    public static void main(String[] args) {
        // Dado um valor de um carro, mostre em quantas vezes eu posso parcelar, parcela = 1000

        int carro = 50000;
        for (int parcelas = 1; parcelas <= carro; parcelas++) {
            int valorParcelas = carro / parcelas;
            if (valorParcelas < 1000) {
                break;
            }
            System.out.println("Parcelas " + parcelas + " valor das parcelas " + valorParcelas);
        }
    }
}
