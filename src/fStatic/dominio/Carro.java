package fStatic.dominio;

public class Carro {
    private String nome;
    private int velocidadeLimite;
    private static int velocidadeMaxima = 250;

    public Carro(String nome, int velocidadeLimite){
        this.nome = nome;
        this.velocidadeLimite = velocidadeLimite;
    }




public void imprime(){
    System.out.println("nome do carro " + nome);
    System.out.println("velocidadeMaxima " + velocidadeMaxima);
    System.out.println("velocidadeLimite " + velocidadeLimite);
}






}