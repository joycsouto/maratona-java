package ADESAFIO6.test;

import ADESAFIO6.service.DadosFile;

import java.io.IOException;

public class FIleTest {
    public static void main(String[] args) throws IOException {
        DadosFile dadosFile = new DadosFile();
        dadosFile.lendoFile();
        dadosFile.cadastrarUser();
        dadosFile.criarArquivo();
        dadosFile.escrevendoFile();
    }
}
