package ADESAFIO6.service;

import ADESAFIO6.domain.User;

import java.io.*;
import java.util.Scanner;

public class DadosFile {
    User user = new User();
    String name;
    String email;
    Integer age;
    Double height;
    Scanner scanner = new Scanner(System.in);
    File filePerguntas = new File("src/maratona/Files/formulario.txt");
    public void lendoFile() {

        try (BufferedReader br = new BufferedReader(new FileReader(filePerguntas))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void cadastrarUser() {

        System.out.println("Responda abaixo");
      name = user.setName(scanner.next());
       email = user.setEmail(scanner.next());
       age = user.setAge(scanner.nextInt());
        height = user.setHeight(scanner.nextDouble());
        scanner.close();
    }
    public void criarArquivo(){

        try {

            boolean newFile = filePerguntas.createNewFile();
            System.out.println("Esta criado?" + newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
   }

public void escrevendoFile(){
    File diretorioFile = new File("src/maratona/Files");
    File userFile = new File(diretorioFile,name.toUpperCase() +".txt");
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userFile, true))) {
        bufferedWriter.write(user.toString());
        bufferedWriter.newLine();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
