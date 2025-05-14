package Tnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/joyce");
        Path arquivo = Paths.get("dev/file.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/joyce");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        //The method handles proper path concatenation, respecting platform-specific path separators.
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("6 " + file.resolve(relativo));
        //If the input path is relative, the method appends it to the base path.
        //If is absolute, the method returns the input path as-is, ignoring the base path.
    }
}
