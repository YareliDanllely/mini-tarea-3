package Library.librarycomponents;
import Library.visitor.Visitor;

/**
 * Se creó la clase Book
 */

public class Book extends AbstractItem {

    /**
     * Se creó el constructor de Book
     * @param title titulo
     */
     public Book(String title) { super(title); }

    @Override
     public void accept(Visitor visitor, String string){
         visitor.visitBook(this, string);
     }
}
