package Neexption.runtimeTets;

public class RunTimeExeption01 {
    public static void main(String[] args) {
        divisao(5, 0);
        System.out.println("codigo finalizadok ");
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido, não pode ser zero");
        }
        return a / b;

    }
}
