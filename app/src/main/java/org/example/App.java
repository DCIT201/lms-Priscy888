/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);

        // Create patrons
        Patron patron1 = new Patron("John Doe");
        Patron patron2 = new Patron("Jane Smith");

        // Add patrons to library
        library.addPatron(patron1);
        library.addPatron(patron2);

        // List all books
        library.listBooks();

        // Simulate book checkout and return
        library.checkOutBook("1984", patron1);
        library.listBooks();
        library.returnBook("1984", patron1);
        library.listBooks();
    }
}
