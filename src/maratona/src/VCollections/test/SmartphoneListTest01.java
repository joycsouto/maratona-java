package VCollections.test;

import VCollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("123","iphone");
        Smartphone phone2 = new Smartphone("124","samsung");
        Smartphone phone3 = new Smartphone("134","lg");
        List<Smartphone> smartphone = new ArrayList<>();

        smartphone.add(phone1);
        smartphone.add(phone2);
        smartphone.add(phone3);

        for (Smartphone smartphones : smartphone){
            System.out.println(smartphones);
        }
        Smartphone phone4 = new Smartphone("123","iphone");
        System.out.println(smartphone.contains(phone4));
        int index = smartphone.indexOf(phone4);
        System.out.println(index);
        System.out.println(smartphone.get(index));
    }
}
