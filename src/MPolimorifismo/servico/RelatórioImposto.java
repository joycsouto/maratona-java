package MPolimorifismo.servico;

import MPolimorifismo.dominio.Computador;
import MPolimorifismo.dominio.Tomate;


public class CalculadoraImposto {
    public static void CalculadoraImpostoComputador(Computador computador) {
        System.out.println("Relatorio Imposto");
        double imposto = computador.Calculartaxa();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto " + imposto);
        System.out.println("------------------------------------");}

        public static void CalculadoraImpostoTomate (Tomate tomate ){
            System.out.println("Relatorio Imposto");
            double imposto = tomate.Calculartaxa();
            System.out.println("Tomate " + tomate.getNome());
            System.out.println("Valor " + tomate.getValor());
            System.out.println("Imposto " + imposto);
            System.out.println("------------------------------------");


        }
}