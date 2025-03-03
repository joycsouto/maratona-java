package SFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter01 {
    public static void main(String[] args) {
        File file = new File("files");
        try (FileWriter fw = new FileWriter(file)){
            fw.write("ola mundo");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
