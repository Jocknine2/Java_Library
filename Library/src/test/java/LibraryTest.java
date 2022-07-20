import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
//        book = new Book("Harry Potter", "J.K Rowling", "Fantasy");
//        book = new Book("how to code", "Ally McGinley", "education");
    }
    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book = new Book("how to code", "Ally McGinley", "education"));
        library.addBook(book = new Book("Harry Potter", "J.K Rowling", "Fantasy"));
        library.addBook(book = new Book("Harry Potter", "J.K Rowling", "Fantasy"));
        assertEquals("Library is full", library.bookCount());
    }

    @Test
    public void checkIfLibraryIsFull(){
        library.addBook(book);
        library.addBook(book = new Book("how to code", "Ally McGinley", "education"));
        library.addBook(book = new Book("Harry Potter", "J.K Rowling", "Fantasy"));
        library.addBook(book = new Book("Harry Potter", "J.K Rowling", "Fantasy"));
        assertEquals("Library is full", library.checkIfFull());
    }
}
