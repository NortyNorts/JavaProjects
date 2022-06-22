import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("A Song for the dark time", "Ian Rankin", "Fiction");
        book2 = new Book("Skin care", "Caroline Hirons", "non-fiction");
        book3 = new Book("The Guest List", "Lucy Foley", "Fiction");
        book4 = new Book("Gino's Italian Escape", "Gino DeCampo", "non-fiction");
    }

    @Test
    public void shouldHaveNoBooks(){
    assertEquals(0, library.getBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3,library.getBooks());
    }

}
