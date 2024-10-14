import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o mês do ano: ");
        int mes = scan.nextInt();
        switch (mes) {
            case 1 :System.out.println("janeiro");
            break;
            case 2 :System.out.println("fev");
            break;
            case 3 :System.out.println("marc");
            break;
            case 4 :System.out.println("abril");
            break;
            case 5 :System.out.println("mai");
            break;
            case 6 :System.out.println("jun");
            break;
            case 7 :System.out.println("jul");
            break;
            case 8 :System.out.println("ago");
            break;
            case 9 :System.out.println("set");
            break;
            case 10 :System.out.println("out");
            break;
            case 11 :System.out.println("nov");
            break;
            case 12 :System.out.println("dez");
            break;
            default:
                System.out.println("opção inválida");
                break;


        }
    }
}