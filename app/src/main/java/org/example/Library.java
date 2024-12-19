package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void checkOutBook(String title, Patron patron) {
        Book book = findBook(title);
        if (book != null && !book.isCheckedOut()) {
            book.setCheckedOut(true);
            System.out.println(patron.getName() + " checked out " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(String title, Patron patron) {
        Book book = findBook(title);
        if (book != null && book.isCheckedOut()) {
            book.setCheckedOut(false);
            System.out.println(patron.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Book was not checked out.");
        }
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - " +
                    (book.isCheckedOut() ? "Checked Out" : "Available"));
        }
    }
}
