package Neexption.exeption.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExeptionTEST02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo//test.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
