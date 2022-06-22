import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBooks() {
        return this.books.size();
    }

    public void addBook(Book book1) {
        if (getBooks() < capacity) {
            this.books.add(book1);
        } else {
            System.out.println("The library is full");
        }
    }
}
