package Kclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);

    }

    @Override
    public void CalculaBonus() {
        this.salario =salario + salario * 0.05;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    @Override
    public void imprime() {
        System.out.println("Dentro de gerente");
    }
}
