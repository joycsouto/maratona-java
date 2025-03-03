package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMetaCharactersTest135 {
    public static void main(String[] args) {
        // \\d é todos os digitos numeros
        // \\D pega tudo o que não é número
        // \\s todos os espaços e \t, \n, \f ,\r
        // \\S tudo o que não é \\s
        // \\w todas as letras e numeros e _
        // \\W tudo o que não é \\W
        // [] especifica o que sera visto
        // ? zero ou um
        // * zero ou mais
        // + um ou mais
        // {n,m} de n a m
        // () seleciona um grupo
        // |"ou" 1|2 um ou dois
        // $ o fim da linha

        int hexNumber =  0xc;

        System.out.println(hexNumber);
      // String regex = "[a-c]";
       String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "xf 0xcaa62 0xba235 0x 0xFAA350";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println( matcher.group());

        }

    }
}
