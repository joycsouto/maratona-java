package AExercicosChatGPT.domain;

public class Estudantes {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudantes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }



    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
}
