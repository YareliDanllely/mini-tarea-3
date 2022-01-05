package Library.visitor;
import Library.librarycomponents.Book;
import Library.librarycomponents.Folder;
import Library.librarycomponents.Item;
import Library.librarycomponents.Journal;
import java.util.List;

/**
 * Se creó la clase visitor la cual contiene los métodos
 * que realizarán un cierta consulta, en este caso para
 * Book, Jounal, Folder
 */
public class Visitor {

    /**
     * Se creó una método de visita para Book
     * @param book Libro
     * @param string String
     */
    public void visitBook(Book book, String string){}

    /**
     * Se creó un método de visita para Journal
     * @param journal Journal
     * @param string string
     */
    public void visitJournal(Journal journal, String string){}

    /**
     * Se creó un método de visita para Folder, el cual
     * recorre todos los elementos de la lista de folder
     * y ejecuta el método accept asociado a ese item
     * @param folder folder
     * @param string string
     */
    public void visitFolder(Folder folder, String string){
        List<Item> list = folder.getItem();
        for (Item item : list)
            item.accept(this, string); }

}
