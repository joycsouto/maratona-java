package Userializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 8067925747202331482L;
    private long id;
    private String name;
    private  transient String password;
    private static final String NOME_ESCOLA = "Dev Dojo Academy";
    private transient Turma turma;

    public Aluno(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
@Serial
private void writeObject(ObjectOutputStream oss){
        try {
            oss.defaultWriteObject();
            oss.writeUTF(turma.getNome());
        } catch (Exception e) {
            e.printStackTrace();
        }
}@Serial
private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
           String nomeTurma =  ois.readUTF();
           turma= new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
}
    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", Nome escola='" + NOME_ESCOLA + '\'' +
                ", Turma ='" + turma + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
