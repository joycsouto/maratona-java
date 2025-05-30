package VCollections.test;

import VCollections.domain.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSortTest01 {
    public static void main(String[] args) {

        List<Book> book = new ArrayList<>();
        book.add(new Book(2L,"1984 - George Orwell",40.0));
        book.add(new Book(3L,"The picture of Dorian Gray - Oscar Wilde",50));
        book.add(new Book(5L,"The Midnight library - Matt Haig",30));
        book.add(new Book(1L,"Contos Negreiros - Marcelino Freire",60));
        book.add(new Book(4L,"O sol é para todos - Harper Lee",50));
        book.add(new Book(6L,"O peso do pássaro morto - Aline Bei",30));

        System.out.println(book);

        Collections.sort(book);

        for (Book book1 : book) {
            System.out.println(book1);
        }

    }
}
