/*19. A library wants to store details of multiple books.
Question:
Create a class Book with attributes:
 title
 author
 price
Create an array of Book objects and display the details of all books.*/

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
        System.out.println("-------------------------");
    }
}

public class Q19 {
    public static void main(String[] args) {
        Book[] libraryBooks = new Book[3];

        libraryBooks[0] = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 12.99);
        libraryBooks[1] = new Book("Pride and Prejudice", "Jane Austen", 9.50);
        libraryBooks[2] = new Book("1984", "George Orwell", 11.25);

        for (Book book : libraryBooks) {
            book.displayDetails();
        }
    }
}
