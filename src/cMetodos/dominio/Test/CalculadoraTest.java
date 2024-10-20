package cMetodos.dominio.Test;

import cMetodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        int num = 1;
        int nume = 2;
        Calculadora calculadora = new Calculadora();
        calculadora.soma();
        calculadora.subtração();
        calculadora.multiplicação(10, 5);
        calculadora.imprimeDivisão(20, 0);
        calculadora.alteraDoisNumeros();
        System.out.println(num  + "" + nume);
        calculadora.somaArraysVarArgs(1,12,2,3,2,5);



    }
}
