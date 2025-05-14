package SFiles_io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\IdeaProjects\\CursoJavaDevDojo\\src\\maratona\\src\\SFiles_io\\file.txt");
        try (FileReader fr = new FileReader(file)) {
//            char [] in = new char[30];
//            System.out.println(fr.read(in));
//            for (char c : in){
//                System.out.print(c);
//            } dessa forma e a de baixo
        int i ;
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }

    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}