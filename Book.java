/** A class modeling a book. */
public class Book {
    String title;
    int year;

    /** Create a new book with title b and year y. */
    public Book(String t, int y) {
        title= t;
        year=y;
    }

    /** Print this book. */
    public void printBook() {
        System.out.println(title + " (" + year + ")");
    }

    /** Some book examples. */
    public static void main(String[] args) {
        Book b = new Book("The Clockwork Orange", 1962);
        b.printBook();
    }
}