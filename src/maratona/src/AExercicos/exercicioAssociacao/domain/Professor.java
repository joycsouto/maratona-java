package AExercicos.exercicioAssociacao.domain;

public class Professor {
    private String nome;
    private String esoecialidade;
    private Seminario[] ministrarSeminarios;

    public Professor(String nome, String esoecialidade) {
        this.nome = nome;
        this.esoecialidade = esoecialidade;
    }

    public void imprime() {

        System.out.println("--- PROFESSOR ---");
        System.out.println("Nome :" + this.nome);
        System.out.println("Especialidade :" + this.esoecialidade);
        if (ministrarSeminarios == null) return;
        for (Seminario ministrarSeminario : ministrarSeminarios) {
            System.out.println("Ministrará o seminário de : " + ministrarSeminario.getNomeSeminario());
            System.out.println("Local : " + ministrarSeminario.getLocal().getEndereco());
            if (ministrarSeminario.getEstudantes() == null || ministrarSeminario.getEstudantes().length == 0) continue;
            System.out.println("--- ALUNOS ---");
            for (Estudantes estudante : ministrarSeminario.getEstudantes()) {
                System.out.println("Estudantes participantes do seminário : " + estudante.getNome() + " idade " + estudante.getIdade());
            }


        }

    }

    public Seminario[] getMinistrarSeminarios() {
        return ministrarSeminarios;
    }

    public void setMinistrarSeminarios(Seminario[] ministrarSeminarios) {
        this.ministrarSeminarios = ministrarSeminarios;
    }
}
