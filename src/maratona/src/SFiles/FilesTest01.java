package SFiles;

import java.io.File;
import java.io.IOException;

public class FilesTest01 {
    public static void main(String[] args) {
        try {
            File file = new File("Files");
            boolean newFile = file.createNewFile();
            System.out.println("Esta criado?" + newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
