package VCollections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {

    List<String> book = new ArrayList<>();
    book.add("1984 - George Orwell");
    book.add("The picture of Dorian Gray - Oscar Wilde");
    book.add("The Midnight library - Matt Haig");
    book.add("Contos Negreiros - Marcelino Freire");
    book.add("O sol é para todos - Harper Lee");
    book.add("O peso do pássaro morto - Aline Bei");
        System.out.println(book);
        Collections.sort(book);
    for (String books : book){
        System.out.println(books);
    }
}}
