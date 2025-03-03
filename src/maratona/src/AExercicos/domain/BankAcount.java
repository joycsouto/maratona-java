package AExercicos.domain;

import java.util.Scanner;

public class BankAcount {
    //    Desenvolva um sistema para gerenciar contas bancárias com duas classes: ContaBancaria e Banco.
//     Na classe ContaBancaria, implemente atributos para o titular, saldo e um contador de contas,
//     além de métodos para depositar, sacar, exibir saldo e contar contas criadas. Na classe Banco,
//     crie o método main que instancia pelo menos duas contas, realiza operações de depósito e saque,
//      e exibe os saldos e o total de contas criadas. Assegure-se de que o sistema funcione corretamente.


    Scanner scan = new Scanner(System.in);
    private String titular;
    private double saldo = 0;

    private static int valorMaximoDeDeposito = 5000;

    public BankAcount(String titular) {
        this.titular = titular;

    }



    public void deposit() {

        System.out.println("==============================================");
        System.out.println("Valor máximo de deposito = " + valorMaximoDeDeposito);
        System.out.println("Digite o valor do deposito:");
        double deposit = scan.nextDouble();
      if (deposit > valorMaximoDeDeposito) {
            System.out.println("Esse valor exede o valor máximo de deposito, teente novamente");

        } else {
            saldo += deposit;
        }
    }

    public void withdraw() {
        System.out.println("Digite o valor da saque:");
        double withdraw = scan.nextDouble();

        if (withdraw > saldo) {
            System.out.println("Esse valor exede o saldo bancario, tente novamente");
        } else {
            saldo -= withdraw;
        }
        System.out.println("saldo " + saldo);

    }

    public void imprimeSaldo() {
        System.out.println("===============================================");
        System.out.println("Olá " + titular + " bem vindo(a) à sua conta bancária");
        System.out.println("saldo " + this.saldo);

    }


}
