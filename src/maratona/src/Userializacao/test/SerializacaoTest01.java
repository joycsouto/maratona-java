package Userializacao.test;

import Userializacao.dominio.Aluno;
import Userializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) throws IOException {
        Aluno aluno = new Aluno(13L, "Joy", "23jojo");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma) ;
        serlializar(aluno);
        deserlializar();
    }

    public static void serlializar(Aluno aluno) throws IOException {
        Path path = Paths.get("src/maratona/pasta1/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void deserlializar() throws IOException {
        Path path = Paths.get("src/maratona/pasta1/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
           Aluno aluno =(Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (Exception  e) {
            throw new RuntimeException(e);
        } }
}
