package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMetaCharactersTest {
    public static void main(String[] args) {
        // \\d é todos os digitos numeros
        // \\D pega tudo o que não é número
        // \\s todos os espaços e \t, \n, \f ,\r
        // \\S tudo o que não é \\s
        // \\w todas as letras e numeros e _
        // \\W tudo o que não é \\W
        // [] especifica o que sera visto

        int hexNumber =  0xc;

        System.out.println(hexNumber);
      // String regex = "[a-c]";
       String regex = "0[xX][0-9a-fA-F]";
        String text = "0x 0xcaa62 0xba235 0x 0xFAA350 ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.start() + " = " + matcher.group());

        }

    }
}
