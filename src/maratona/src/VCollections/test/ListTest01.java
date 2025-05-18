package VCollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01
{
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Joyce");
        nomes.add("Souto");
        for (String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("18");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }

    }
}
