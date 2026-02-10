public class Nodo<T> {
    private T elemento;
    private Nodo<T> anterior;
    private Nodo<T> siguiente;

    // Constructor con solo el elemento
    public Nodo(T elemento) {
        this.elemento = elemento;
        this.anterior = null;
        this.siguiente = null;
    }

    // Constructor con referencias a nodos anterior y siguiente
    public Nodo(T elemento, Nodo<T> anterior, Nodo<T> siguiente) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    // Getter para el elemento
    public T getElemento() {
        return elemento;
    }

    // Getter y setter para el nodo anterior
    public Nodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }

    // Getter y setter para el nodo siguiente
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}