package cMetodos.dominio;

public class Calculadora {
    public void soma() {
        System.out.println(10 + 10);
    }

    public void subtração() {
        System.out.println(10 - 5);
    }

    public void multiplicação(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public int divisão(int num1, int num2) {
        return num1 / num2;
    }

    public void imprimeDivisão(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros() {
        int numero1 = 99;
        int numero2 = 33;
        System.out.println("num " + numero1 + " num2 " + numero2);

    }

    public void somaArraysVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);
    }
}

