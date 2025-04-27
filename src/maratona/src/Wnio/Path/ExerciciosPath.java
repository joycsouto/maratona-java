package Wnio.Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExerciciosPath {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/maratona");
Path paths2 = Paths.get("src/maratona/File");
        System.out.println("FileName :" + path.getFileName());

        if (Files.notExists(path)){
            System.out.println("Nao existe arquivo");

        }else {
            System.out.println("Existe arquivo");
        }
        System.out.println("AbsolutePath " + path.toAbsolutePath());

        System.out.println("new path add " + path.resolve("novoArquivo.txt"));

        System.out.println("Pai :" + path.getParent());
        System.out.println("Numeros de elementos :"+path.getNameCount());

        if (Files.isSameFile(path,paths2)){
            System.out.println("is Same File");
        }else {
            System.out.println("is not Same File");
        }

    }
}
