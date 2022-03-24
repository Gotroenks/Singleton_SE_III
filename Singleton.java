package DesignPatterns;

/*
* Singleton "apressado"
*
* @author<a>"Isaac Gerboni"</a>
* @see <a href="https://github.com/Gotroenks" "GitHub"></a>
*/

public class Singleton {

    static Singleton singleton = new Singleton();
    String imprimeDocumento, removeDocumento, removeTodosDocumento;

    private Singleton() {

    }

    public String getImprimeDocumento() {
        return imprimeDocumento;
    }

    public void setImprimeDocumento(String imprimeDocumento) {
        this.imprimeDocumento = imprimeDocumento;
    }

    public String getRemoveDocumento() {
        return removeDocumento;
    }

    public void setRemoveDocumento(String removeDocumento) {
        this.removeDocumento = removeDocumento;
    }

    public String getRemoveTodosDocumento() {
        return removeTodosDocumento;
    }

    public void setRemoveTodosDocumento(String removeTodosDocumento) {
        this.removeTodosDocumento = removeTodosDocumento;
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
