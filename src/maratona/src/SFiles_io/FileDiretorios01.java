package SFiles_io;

import java.io.File;
import java.io.IOException;

public class FileDiretorios01 {
    public static void main(String[] args) throws IOException {
        File fileDirectorio = new File("C:\\Users\\User\\IdeaProjects\\CursoJavaDevDojo\\src\\maratona\\pasta");
        boolean isDiretorioCriado = fileDirectorio.mkdir();
        System.out.println("isDiretorioCriado? " +isDiretorioCriado);

        File fileArquivoDiretorio = new File(fileDirectorio.getAbsolutePath(),"arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("isFileCreated? " +isFileCreated);

        File fileRenamed = new File(fileDirectorio,"joy.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("isRenamed? " + isRenamed);

        File fileDiretorioRenamed = new File ( "C:\\Users\\User\\IdeaProjects\\CursoJavaDevDojo\\src\\maratona\\pasta1");
        boolean isDiretorioRenemed = fileDirectorio.renameTo(fileDiretorioRenamed);
        System.out.println("isDiretorioRenemed? " + isDiretorioRenemed);

    }
}
