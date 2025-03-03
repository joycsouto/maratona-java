package Patterns;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Joyce, Luisa, Leo , true, 200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        scanner.next().trim();

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("integer "+i);
            }if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("boolean "+b);
            }else {
                System.out.println(scanner.next());
            }

        }


    }
}
