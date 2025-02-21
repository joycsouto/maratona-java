package Patterns;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Joyce, Luisa, Leo";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
