import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        //dado os dias da semana me fale quais são os dias uteis
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número referete ao dia da semana");
        byte dia = scan.nextByte();
        switch (dia){
            case 1 : System.out.println("não é dia util, é domingo");
            break;
            case 2 : System.out.println(" é dia util, é segunda");
            break;
            case 3 : System.out.println(" é dia util, é terça");
            break;
            case 4 : System.out.println(" é dia util, é quarta");
            break;
            case 5 : System.out.println(" é dia util, é quinta");
            break;
            case 6 : System.out.println(" é dia util, é sexta");
            break;
            case 7 : System.out.println("não é dia util, é sabado");
            break;
            default:
                System.out.println("opção inválida");
                break;

        }
    }
}
