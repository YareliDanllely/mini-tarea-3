package Library.librarycomponents;
import Library.visitor.Visitor;


/**
 * Se creó una interfaz que compartiran
 * los Items
 */

public interface Item {
    /**
     * Se creó el getter para el atributo Tittle
     * de los items
     * @return retorna el titulo de los items
     */
    String getTitle();

    /**
     * Se creó un método accept que como su nombre lo dice
     * permitirá aceptar al visitante
     * @param visitor visitante
     * @param string string que se utilizará para ver los libros
     *               que terminan en tales caracteres
     */
    void accept(Visitor visitor, String string);
}
