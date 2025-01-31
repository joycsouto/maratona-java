package Neexption.exeption.test;

import java.util.Scanner;

public class LoginInvalidoExeption {
    public static void main(String[] args) {
        logar();

    }
    public static void logar() {
        Scanner ler = new Scanner(System.in);
        String userBD = "joy123";
        String senhaBD = "pçolikujyhtgrfedwsqa";
        System.out.println("Usuario: ");
       String  user = ler.next();
        System.out.println("Senha: ");
        String senha = ler.next();
        if(!senhaBD.equals(senha) && !userBD.equals(user)){
            throw new LoginInvalidoExeption();

        }
    }
}

