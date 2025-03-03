package BásicoJava;

public class Main {
    public static void main(String[] args) {

        int idade = 18;
        String maiorIdade = "vc é maior de idade";
        String menorIdade = "vc é menor de idade";
       String resustado = idade <= 18 ? maiorIdade :  menorIdade  ;
        System.out.println(resustado);
    }
}