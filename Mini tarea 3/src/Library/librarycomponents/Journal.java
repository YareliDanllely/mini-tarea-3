package Library.librarycomponents;
import Library.visitor.Visitor;

/**
 * Se creó la clase Journal
 */

public class Journal extends AbstractItem {

    /**
     * Se creó el constructor de Journal
     * @param title titulo
     */
    public Journal(String title) { super(title); }

    @Override
    public void accept(Visitor visitor, String string) {
        visitor.visitJournal(this, string); }
}
