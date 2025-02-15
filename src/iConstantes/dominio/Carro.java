package iConstantes.dominio;

public final class Carro {//a classe não podera ser extendida
    private String name;
    public static final double VELOCIDADE_LIMITE = 260; // torna algo ou o valor imovel , e static
    //quer dizer que o valor pertence a classe

    public Carro(String name) {
        this.name = name;
    }

    @Override
    public final String toString() { //impede que o metodo sera sobrescrito em subclasses
        return "Carro{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

}
