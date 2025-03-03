package SFiles;

import java.io.File;
import java.io.IOException;

public class FilesDiretorio01 {
    public static void main(String[] args) {
        File file = new File("");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);

    }
}
