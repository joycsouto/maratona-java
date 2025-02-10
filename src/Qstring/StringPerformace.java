package Qstring;

public class StringPerformace {
    public static void main(String[] args) {
      long inicio = System.currentTimeMillis();
//        lendoString(50_000);
       long fim = System.currentTimeMillis();
//        System.out.println("String lento "+(fim- inicio)+"ms");


        inicio = System.currentTimeMillis();
        lendoStringBuffer(50_000);
        fim = System.currentTimeMillis();
        System.out.println("StringBuffer um pouco rapido "+(fim- inicio)+"ms");

        inicio = System.currentTimeMillis();
        lendoStringBuider(50_000);
        fim = System.currentTimeMillis();
        System.out.println("StringBuider rápido "+(fim- inicio)+"ms");

    }

    public static void lendoString(int quantity) {
        String text = "";
        for (int i = 0; i < quantity; i++) {
            text += i;
        }
    }

    public static void lendoStringBuider(int quantity) {
        StringBuilder sb = new StringBuilder(quantity);
        for (int i = 0; i < quantity; i++) {
            sb.append(i);

        }

    }
    public static void lendoStringBuffer(int quantity) {
        StringBuffer sbb = new StringBuffer(quantity);
        for (int i = 0; i < quantity; i++) {
            sbb.append(i);


        }

    }


}


//pesquisar sobre string e exercicios de date e calenderc