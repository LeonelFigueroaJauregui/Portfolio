package practica5;

public class Nodo {

    String cancion;
    String imagen;
    Nodo siguiente;

    public Nodo(String cancion, String imagen, Nodo siguiente) {
        this.cancion = cancion;
        this.imagen = imagen;
        this.siguiente = siguiente;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
