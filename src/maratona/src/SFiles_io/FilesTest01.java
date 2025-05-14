package SFiles_io;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FilesTest01 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\CursoJavaDevDojo\\src\\maratona\\src\\SFiles_io\\file.txt");
           // boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            System.out.println("Esta criado?" + isCreated);
          //  System.out.println("Esta deletado?" + isDeleted);
            System.out.println("path = " + file.getPath());
            System.out.println("absolute path = " + file.getAbsolutePath());
            System.out.println("is directory? " + file.isDirectory());
            System.out.println("is file? " + file.isFile());
            System.out.println("is hidden? " + file.isHidden());
            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
