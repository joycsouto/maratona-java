package VCollections.test;

import VCollections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome1 = "Joy";
        String nome2 = "Joy";
        System.out.println(nome1==nome2);
        System.out.println(nome1.equals(nome2));//COMPARAM OS VALORES, AMBOS REFERENCIAM O MESMO VALOR


        Smartphone iphone1 = new Smartphone("1234","iphone");
        Smartphone iphone2 = new Smartphone("1234","iphone");

        System.out.println(iphone1 == iphone2);//nao são as mesmas referecias, "new" = novo lugar na memoria, lugares diferentes na memoria
        System.out.println(iphone1.equals(iphone2));


    }
}
