package Kclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {//classes abstratas não podem ser instanciadas e
    // servem como um exemplo e é utilizada para ser extendida
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        CalculaBonus();
    }
    public abstract void CalculaBonus();
}
