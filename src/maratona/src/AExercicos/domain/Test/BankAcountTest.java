package AExercicos.domain.Test;

import AExercicos.domain.BankAcount;

public class BankAcountTest {
    public static void main(String[] args) {
        BankAcount conta = new BankAcount("Joyce" );
        BankAcount conta2 = new BankAcount("Luisa");
        conta.imprimeSaldo();
        conta.deposit();
        conta.withdraw();

        conta2.imprimeSaldo();
        conta2.deposit();
        conta2.withdraw();


    }

}
