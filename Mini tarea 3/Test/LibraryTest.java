import Library.Library;
import Library.librarycomponents.Folder;
import Library.librarycomponents.Book;
import Library.librarycomponents.Journal;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class LibraryTest {
    private Library library;
    private Folder folder;
    private Book bookOne;
    private Book bookTwo;
    private Book bookThree;
    private Journal journal;
    private TestCase Assertions;

    @Before
    public void setUp() {
        library = new Library("library");
        folder = new Folder("EmptyFolder");
        bookOne = new Book("LittleCat");
        bookTwo = new Book("SuperCat");
        bookThree = new Book("BigDog");
        journal = new Journal("Technology");

    }

    @Test
    public void testAddToLibrary(){
        library.add(bookOne);
        library.add(bookTwo);
        library.add(journal);
        Assertions.assertEquals(library.getItem(0),bookOne);
        Assertions.assertEquals(library.getItem(1),bookTwo);
        Assertions.assertEquals(library.getItem(2),journal);
    }

    @Test
    public void testBookEndingWith(){
        library.add(bookOne);
        library.add(bookTwo);
        library.add(journal);
        List listOfBooksEndingWithCat = library.getBookEndingWith("Cat");
        Assertions.assertEquals(listOfBooksEndingWithCat.get(0), bookOne);
        Assertions.assertEquals(listOfBooksEndingWithCat.get(1),bookTwo);

    }

    @Test
    public void testEmptyFolder(){
        library.add(folder);
        library.add(bookTwo);
        library.add(journal);
        List listOfEmptyFolder = library.getEmptyFolders();
        Assertions.assertEquals(listOfEmptyFolder.get(0), folder);

    }



}
