
/**
 *
 * @author Leonel
 */
public class Nodo {

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDer() {
        return Der;
    }

    public void setDer(Nodo Der) {
        this.Der = Der;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo(int dato, Nodo izdo, Nodo Der, Nodo raiz) {
        this.dato = dato;
        this.izdo = izdo;
        this.Der = Der;
        this.raiz = raiz;
    }
    
    private int dato;
    private Nodo izdo;
    private Nodo Der;
    private Nodo raiz;
    Nodo() {}
}
