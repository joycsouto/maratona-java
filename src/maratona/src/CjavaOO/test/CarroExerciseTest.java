package CjavaOO.test;

import CjavaOO.dominio.CarroExercise;

public class CarroExerciseTest {
    public static void main(String[] args) {
        CarroExercise carro = new CarroExercise();
        CarroExercise carro2 = new CarroExercise();
        carro.nome = "Ferrari";
        carro.ano = 2021;
        carro.modelo = "Gt550";

        carro2.nome = "Fusca";
        carro2.ano = 1980;
        carro2.modelo = "D3300";

        System.out.println("nome:" + carro.nome + " modelo:"+carro.modelo + " ano:" + carro.ano);
        System.out.println("nome:" + carro2.nome + " modelo:"+carro2.modelo + " ano:" + carro2.ano);




    }
}
