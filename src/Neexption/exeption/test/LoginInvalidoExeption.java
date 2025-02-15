package Neexption.exeption.test;

import java.util.Scanner;

public class LoginInvalidoExeption extends Throwable {
    public static void main(String[] args) throws LoginInvalidoExeption {
        logar();

    }
    public static void logar() throws LoginInvalidoExeption {
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

