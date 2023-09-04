package ait.books.dao;

import ait.books.model.Book;

public interface Library {
    boolean addBook(Book book);

    Book removeBook(long isbn);

    Book findByIsbn(long isbn);

    Book[] findByAuthor(String author);

    int size();
}
