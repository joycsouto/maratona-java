package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMetaCharactersTest136 {
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

       


      // String regex = "[a-c]";
       String regex = "([a-zA-Z0-9\\.])+@gmail.com";
        String text = "luisa.sout@gmail.com, leo@mail.com,239leo@gmail.com,leo@gmail.br,@#leo@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find() && text.matches(regex)) {
            System.out.println(matcher.group());

        }

    }
}
