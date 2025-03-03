package AExercicos.exercicioAssociacao.domain;

public class Seminario {
    private String NomeSeminario;
    private Estudantes[] estudantes;
    private Local local;

    public Seminario(String nomeSeminario) {
        NomeSeminario = nomeSeminario;
    }


    public Estudantes[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudantes[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getNomeSeminario() {
        return NomeSeminario;
    }

    public void setNomeSeminario(String nomeSeminario) {
        NomeSeminario = nomeSeminario;
    }
}
