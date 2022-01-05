package Library.librarycomponents;
import Library.visitor.Visitor;

/**
 * Se creó una clase Abstracta que sera la base para los
 * diferentes Items
 */

public abstract class AbstractItem implements Item {
    protected String title;

    /**
     * Se creó el constructor de la clase
     * @param title titulo
     */
    public AbstractItem(String title) { this.title = title; }

    @Override
    public String getTitle() { return title; }

    @Override
    public void accept(Visitor visitor, String string) {

    }
}
