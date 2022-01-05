package Library.visitor;
import Library.librarycomponents.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Se creó la clase BookEndingWith la cual realizará la
 * búsqueda de los libros terminados en un string
 * especifico, posee ademas una lista de Book
 */

public class BookEndingWith extends Visitor {
    private List<Book> booksEndingWithSameWord = new ArrayList<Book>();

    @Override
    public void visitBook(Book book,String string) {
        if (book.getTitle().endsWith(string)){
            booksEndingWithSameWord.add(book); }
    }

    /**
     * Se creó un método que retorna la lista de libros
     * terminados en cierto carácter
     * @return lista de libros terminados en la misma palabra
     */
    public List getResult(){
        return booksEndingWithSameWord;
    }


}
