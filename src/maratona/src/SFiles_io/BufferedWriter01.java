package SFiles_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\IdeaProjects\\CursoJavaDevDojo\\src\\maratona\\src\\SFiles_io\\file.txt");
        try (FileWriter fw = new FileWriter(file,true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("ola mundo");
            bw.newLine();
            bw.write("joyjoy é linda");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
