package Qstring;

import java.io.File;

public class StringTest {
    public static void main(String[] args) {

        int i = 1;
        int ik = 1;
        System.out.println(i == ik);
        //No caso de tipo primitivo se compara o valor, mas na String se compara a referencia

        String name1 = "Joyce";
        String name2 = "Joyce";
        String name3 = new String("Joyce");
        System.out.println("São iguais? " + name1.equals(name2));
        System.out.println("São iguais? " + name1.equals(name3));
        //por que são iguais se são referencias diferentes?
        //porque o .equals  compara o conteudo
        System.out.println("São iguais? " + name1 == name2);
        System.out.println("São iguais? " + name1==name3);
        // Não são iguais, porque o == compara a referencia no caso os tem nomes(referencias) diferentes

        name1.concat("Souto");//assim não retorna a concatenação junto pois ela nao tem uma referencia, o valor se perde
        name1 = name1.concat(" Souto 2");// retorna pois estou dando a ela uma referencia de onde ficar

        System.out.println(name1);
        System.out.println(name1.equals(name2));//Não é igual pois o name1 recebeu o Souto

        //diferença de atributos e metodos


    }
}
