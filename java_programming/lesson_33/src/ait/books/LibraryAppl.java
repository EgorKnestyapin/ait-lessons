package ait.books;

import ait.books.dao.Library;
import ait.books.dao.LibraryImpl;
import ait.books.model.Book;

import java.util.Arrays;

public class LibraryAppl {
    public static void main(String[] args) {
        Library library = new LibraryImpl(10);
        Book[] books = new Book[6];
        books[0] = new Book(100, 1960, "Pushkin");
        books[1] = new Book(200, 1970, "Lermontov");
        books[2] = new Book(300, 1950, "Tolstoi");
        books[3] = new Book(400, 1975, "Dostoevski");
        books[4] = new Book(500, 1930, "Chekhov");
        books[5] = new Book(600, 1900, "Pushkin");

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }

        System.out.println(library.size());
        System.out.println("=================");
        System.out.println(Arrays.toString(books));
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
        Book[] pBooks = library.findByAuthor("Pushkin");
        System.out.println(Arrays.toString(pBooks));
    }
}
