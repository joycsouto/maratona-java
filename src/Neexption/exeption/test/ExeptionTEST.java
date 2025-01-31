package Neexption.exeptionTest;

import java.io.File;
import java.io.IOException;

public class ExeptionTEST {
    public static void main(String[] args) {
        criarNovoArquivo();

    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo//test.txt");
        File filee = new File("arquivo//teste.txt");
    try{
        file.createNewFile();
        filee.createNewFile();
    } catch (IOException e) {
            throw new RuntimeException("Não foi possivel criar o arquivo",e);
        }
        System.out.println("Arquivo criado");
    }
}
