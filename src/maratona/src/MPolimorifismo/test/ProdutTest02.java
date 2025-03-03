package MPolimorifismo.test;

import MPolimorifismo.dominio.Computador;
import MPolimorifismo.dominio.Produto;
import MPolimorifismo.dominio.Tomate;

public class ProdutTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 7 ", 2000);
        Produto produto2 = new Tomate("tomate cereja", 20);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.Calculartaxa());
        System.out.println("--------------------------");

         System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.Calculartaxa());



    }
}
