package ADESAFIO6.service;

import ADESAFIO6.domain.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DadosFile {

    String name;
    String email;
    Integer age;
    Double height;
    Scanner scanner = new Scanner(System.in);
    File diretorioFile = new File("src/maratona/Files");
    File filePerguntas = new File("src/maratona/Files/formulario.txt");
    ArrayList<User> listUser = new ArrayList<>();
    ArrayList<String> perguntasList = new ArrayList<>();
    String line ;
    int linha = 0;
    int i = perguntasList.size() + 5;
    User user = new User(name, email, age, height);

    public void lendoFile() {

        try (BufferedReader br = new BufferedReader(new FileReader(filePerguntas))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                perguntasList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    } public int numeroPergutas() {

        try (BufferedReader br = new BufferedReader(new FileReader(filePerguntas))) {
            while ((line = br.readLine()) != null) {
           linha ++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    return linha;}


    public void cadastrarUser() {
        lendoFile();
        System.out.println("Responda abaixo");

        user.setName(scanner.nextLine());
        name = user.setName(scanner.nextLine());
        if (name.trim().length() >= 10) {
        } else {
            throw new RuntimeException("O nome deve possuir no mínimo 10 caracteres");
        }

            String padraoEmail = "[a-zA-Z0-9]+@gmail.com";
          //  Pattern pattern2 = Pattern.compile(padraoEmail);
           // user.setEmail(scanner.nextLine());
            email += user.setEmail(scanner.nextLine());
            Boolean isPadrao = Pattern.matches(padraoEmail, email);

        if (listUser.contains(email)) {
            throw new RuntimeException("Esse email ja existe");
        }if (isPadrao){
                throw new RuntimeException("Seu email precisa ter @gmail.com");
            }




            age = user.setAge(scanner.nextInt());
            if (age < 18) {
                throw new RuntimeException("A idade precisa ser apartir de 18 anos." );

            }


            String padraoVirgula = "(\\d{1},\\d{2})";
            Pattern pattern = Pattern.compile(padraoVirgula);
            height = user.setHeight(scanner.nextDouble());
            boolean isMarcher = Pattern.matches(padraoVirgula,height.toString());
            if (isMarcher){
                throw new RuntimeException("O número precisa ser separado por vírgula" );
            }



        listUser.add(new User(name, email, age, height));
        criarArquivo();


    }

    public void criarArquivo() {

        try {

            boolean newFile = filePerguntas.createNewFile();
            escrevendoFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void escrevendoFile() {


        File userFile = new File(diretorioFile, name.toUpperCase().trim() + ".txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userFile, true))) {
            userFile.createNewFile();
            bufferedWriter.write(user.toString());
            bufferedWriter.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void menu() {
        int resposta;
        try {
            System.out.println("1 - Cadastrar o usuário\n" +
                    "2 - Listar todos usuários cadastrados\n" +
                    "3 - Cadastrar nova pergunta no formulário\n" +
                    "4 - Deletar pergunta do formulário\n" +
                    "5 - Pesquisar usuário por nome ou idade ou email\n" +
                    "6 - Sair\n" +
                    "Escolha uma opção:");
            resposta = scanner.nextInt();
            //    resposta = Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Opção inválida. Digite um número.");
            menu();
            return;
        }
        switch (resposta) {
            case 1:
                cadastrarUser();
                menu();
                break;
            case 2:
                System.out.println(user.getName());
                menu();
                break;
            case 3:
                adiconarPergunta();

                break;
            case 4:
                deletarPergunta();

                break;
            case 5:
                pesquisarNome();

                break;
            case 6:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção inválida");
                menu();
        }
    }

    public void adiconarPergunta() {
        scanner.nextLine();
        System.out.println("Escreva a pergunta:");
        String pergunta = scanner.nextLine();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePerguntas, true))) {
            for (int j = 0; j < perguntasList.size(); j++) {
                System.out.println(j);
            }
            bufferedWriter.newLine();
            bufferedWriter.write(numeroPergutas() + 1 + " - " + pergunta);
            menu();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public void deletarPergunta() {
        try {

            lendoFile();

            System.out.println("Qual pergunta você quer remover? (A partir da 5ª pergunta)");
            int resposta = scanner.nextInt();
            scanner.nextLine();

            if (resposta < 5 || resposta > perguntasList.size()) {
                System.out.println("Número inválido!");
                menu();
                return;
            }


            perguntasList.remove(resposta - 1);

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePerguntas))) {
                for (String line : perguntasList) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
                menu();
            } catch (IOException e) {
                throw new RuntimeException("Erro ao escrever no arquivo: " + e.getMessage());
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void pesquisarNome() {
        try {
            System.out.println("Pesquise por nome,email ou idade:");
            String pesquisa = scanner.next();
            for (User user1 : listUser) {
                if (user1.getName().matches((pesquisa + Pattern.CASE_INSENSITIVE))) ;
                System.out.println(user1);
              

            }
        } catch (RuntimeException e) {
            throw new RuntimeException("Usuário Inexistente, tente novamente", e);
        }
        menu();
    }
}
