package RDatas;

import java.io.File;

public class FilesDiretorio01 {
    public static void main(String[] args) {
        File file = new File("");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);

    }
}
