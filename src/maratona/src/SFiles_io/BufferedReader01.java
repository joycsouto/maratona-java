package SFiles_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\IdeaProjects\\CursoJavaDevDojo\\src\\maratona\\src\\SFiles_io\\file.txt");
        try (FileReader fr = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}