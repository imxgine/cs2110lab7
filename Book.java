/** A class modeling a book. */
public class Book {
    String title;
    String author;
    int year;

    /** Create a new book with title b. */
    public Book(String t, String a, int y) {
        title= t;
        author= a;
        year= y;
    }

    /** Print this book. */
    public void printBook() {
        System.out.println(title + " " + author + " (" + year + ")");
    }

    /** Some book examples. */
    public static void main(String[] args) {
        Book b= new Book("A Clockwork Orange", "Alexa Vanhattum", 1962);
        b.printBook();
    }
}