package Tnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAtributes01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime time = LocalDateTime.now().minusDays(10);
        File file = new File("/home/new.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(time.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("home/new_file.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(time.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,fileTime);
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
    }
}
