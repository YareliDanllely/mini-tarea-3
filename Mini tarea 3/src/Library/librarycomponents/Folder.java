package Library.librarycomponents;

import Library.visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

/**
 * Se creó la clase Folder, la cual posee una lista
 * de items
 */

public class Folder extends AbstractItem {
    private List<Item> items = new ArrayList<Item>();

    /**
     * Se creó el constructor de Folder
     * @param title titulo
     */
    public Folder(String title) {
        super(title);
    }

    @Override
    public void accept(Visitor visitor, String string) {
        visitor.visitFolder(this,string); }

    /**
     * Se creó el método add que permite agregar items a la lista
     * de folder
     * @param item item
     */
    public void add(Item item) {
        items.add(item);
    }

    /**
     * Se creó el getter de la lista Item
     * @return lista de items
     */
    public List getItem(){
        return items;
    }


}