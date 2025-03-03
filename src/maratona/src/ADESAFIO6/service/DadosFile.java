package ADESAFIO6.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DadosFile {
    public void lendoFile() throws IOException {
    File file = new File("fml");
    FileReader fileReader = new FileReader("Files/formulario.txt");
    file.createNewFile();
        System.out.println(fileReader);
}

    public DadosFile() throws FileNotFoundException {
        System.out.println("Arquivo não encontrado");
    }
}
