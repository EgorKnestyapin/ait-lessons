package ait.books.dao;

import ait.books.model.Book;

import java.util.function.Predicate;

public class LibraryImpl implements Library {
    private Book[] books;
    private int size;

    public LibraryImpl(int capacity) {
        books = new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length || findByIsbn(book.getIsbn()) != null) {
            return false;
        }
        books[size++] = book;
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                Book bookForRemove = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return bookForRemove;
            }
        }
        return null;
    }

    @Override
    public Book findByIsbn(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book[] findByAuthor(String author) {
        Predicate<Book> predicate = book -> book.getAuthor().equals(author);
        return findBooksByPredicate(predicate);
    }

    private Book[] findBooksByPredicate(Predicate<Book> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(books[i])) {
                count++;
            }
        }
        Book[] foundBooks = new Book[count];
        for (int i = 0, j = 0; j < foundBooks.length; i++) {
            if (predicate.test(books[i])) {
                foundBooks[j++] = books[i];
            }
        }
        return foundBooks;
    }

    @Override
    public int size() {
        return size;
    }
}
