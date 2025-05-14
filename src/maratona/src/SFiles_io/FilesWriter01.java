package SFiles_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\IdeaProjects\\CursoJavaDevDojo\\src\\maratona\\src\\SFiles_io\\file.txt");
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("ola mundo\n");
fw.write("joyjoy é linda");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
