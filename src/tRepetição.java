public class tRepetição {
    public static void main(String[] args) {
        int numero = 0;
        while (numero <= 100) {
            if (numero % 2 == 0)

                System.out.println(numero);
            numero++;

        }

        do {
            numero++;
            if (numero % 2 == 0) {
                System.out.println("----------------------do while---------------------" + numero);
            }
        } while (numero <= 100);
        {


            for (numero = 0; numero <= 100; numero++) {
                if (numero % 2 == 0) {
                    System.out.println("##########fori#########" + numero);
                }
            }
        }
    }
}