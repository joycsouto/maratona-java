package Neexption.exeption.test;

import java.io.*;

public class TryWithResourcesTeste {
    public static void main(String[] args) {
LendoFile();
LendoFile02();
    }

    public static void LendoFile02() {
        try (Reader reader = new BufferedReader(new FileReader("file/test.txt"))) {
            BufferedReader bufferedReader = (BufferedReader) reader; // Fazer o cast para BufferedReader para conseguir pegar o readLine
            String linha; // para trasferir os caracteres do read para palavras'1q
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha); // Imprime cada linha do arquivo
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void LendoFile() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file/test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

