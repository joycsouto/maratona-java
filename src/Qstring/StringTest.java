package Qstring;

import java.io.File;

public class StringTest {
    public static void main(String[] args) {
        String name = "Joyce";//por que são iguais se são Strings diferentes?
        String name1 = "Joyce";

        name.concat("Souto");//assim não retorna a concatenação junto pois ela nao tem uma referencia, o valor se perde
        name = name.concat(" Souto 2");// retorna pois estou dando a ela uma referencia de onde ficar

        System.out.println(name);
        System.out.println(name == name1);
        System.out.println(name.equals(name1));

        //diferença de atributos e metodos


    }
}
