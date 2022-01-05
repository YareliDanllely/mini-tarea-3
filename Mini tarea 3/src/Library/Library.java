package Library;

import Library.librarycomponents.Folder;
import Library.librarycomponents.Item;
import Library.visitor.BookEndingWith;
import Library.visitor.EmptyFolders;
import java.util.List;

/**
 * Se creó la clase library la cual contiene un Folder
 */

public class Library {
    private Folder folder;

    /**
     * Se creó el constructor de Library y se creo un folder
     * @param string nombre
     */
    public Library(String string){
        folder = new Folder(string);
    }

    /**
     * Se creó un metodo add que agrega items al folder
     * @param item item
     */
    public void add(Item item){
        folder.add(item);
    }

    /**
     * Se creó un método que permite obtener los items
     * guardados en el Folder
     * @param value indice de la lista
     * @return Item
     */
    public Item getItem(int value){
        return (Item) this.getFolder().getItem().get(value); }

    /**
     * Se creó el metodo getter de Folder
     * @return folder
     */
    public Folder getFolder() { return folder; }

    /**
     * Se creó el metodo que permite obtener los libros terminados
     * en cierto caracter
     * @param string carácter
     * @return lista de libros terminado en un carácter
     */
    public List getBookEndingWith(String string){
        BookEndingWith bookEndingWith = new BookEndingWith();
        folder.accept(bookEndingWith,string);
        return bookEndingWith.getResult(); }

    /**
     * Se creó el metodo que permite obtener los Folders
     * vacíos
     * @return lista de Folders vacíos
     */
    public List getEmptyFolders(){
        EmptyFolders emptyFolders = new EmptyFolders();
        folder.accept(emptyFolders, null);
        return emptyFolders.getResult();
    }

}



