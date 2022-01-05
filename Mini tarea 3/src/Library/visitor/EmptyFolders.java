package Library.visitor;
import Library.librarycomponents.Folder;
import Library.librarycomponents.Item;
import java.util.ArrayList;
import java.util.List;

/**
 * Se creó la clase EmptyFolders la cual buscara las
 * folders vacíos, posee una lista de Folders
 */
public class EmptyFolders extends Visitor{
    private List<Folder> emptyFolders = new ArrayList<Folder>();

    /**
     * Se sobreescribio el método visitFolder, en este caso si el folder
     * es vacío se agrega a la lista emptyFolders en caso contrario,
     * se recorre el folder
     * @param folder folder
     * @param string string
     */
    @Override
    public void visitFolder(Folder folder, String string) {
        if (folder.getItem().size()==0){
            emptyFolders.add(folder); }
        else{
        List<Item> list = folder.getItem();
        for (Item item : list)
            item.accept(this, string);} }

    /**
     * Se creó el método que retorna la lista
     * de folders vacíos
     * @return lista de folders vacíos
     */
    public List getResult(){ return emptyFolders; }
}
