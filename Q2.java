/*2.Design a Book class (title, author, ISBN) and a Library class that manages a
collection (e.g., an ArrayList) of Book objects. Implement methods in Library to
add a new book, remove a book by ISBN, and display all available books.*/
import java.util.ArrayList;
import java.util.Iterator;

class Book {
    String title;
    String author;
    int ISBN;

    Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

class Library {
    private ArrayList<Book> collection = new ArrayList<>();

    public void addBook(Book book) {
        collection.add(book);
        System.out.println("Added: " + book.title);
    }

    public void removeBookByISBN(int isbn) {
        Iterator<Book> iterator = collection.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.ISBN == isbn) {
                iterator.remove();
                System.out.println("Removed book with ISBN: " + isbn);
                removed = true;
                break; 
            }
        }
        if (!removed) {
            System.out.println("No book found with ISBN: " + isbn);
        }
    }

    public void displayAllBooks() {
        if (collection.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        System.out.println("\n--- Current Library Collection ---");
        for (Book book : collection) {
            book.display();
        }
        System.out.println("----------------------------------");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.addBook(new Book("ABCD", "Raj", 1234));
        myLibrary.addBook(new Book("ABD", "Riya", 1254));
        myLibrary.addBook(new Book("ABC", "Priya", 1674));

        myLibrary.displayAllBooks();

        myLibrary.removeBookByISBN(1254);

        myLibrary.displayAllBooks();

        myLibrary.removeBookByISBN(9999);
    }
}
