package Wnio.Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {

    public static void main(String[] args) {

        String pathDirectory = "src/maratona/home";
        String pathFile = "../../file.txt";
        Path path1 = Paths.get(pathDirectory, pathFile);
        System.out.println(path1);
        System.out.println(path1.normalize());
// O normalize mostra apenas arquivos importantes, ignora os pontos

        Path path2= Paths.get("src/./maratona/./home");
        System.out.println(path2.normalize());


    }
}
