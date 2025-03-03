package Kclassesabstratas.test;

import Kclassesabstratas.dominio.Desenvolvedor;
import Kclassesabstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {

    Desenvolvedor dev = new Desenvolvedor("Joyce" , 5000);
    Gerente chefe = new Gerente("Lali" , 3000);

        System.out.println(dev);
        System.out.println(chefe);
        dev.imprime();
        chefe.imprime();
    }
}