public class Lista<T>{
	private Nodo cabeza;
	private Nodo rabo;
	private int longitud;

	//Metodo que inicializa una Lista vacia
	public Lista(){
		this.cabeza = null;
		this.rabo = null;
		this.longitud = 0;
	}
	//Metodo para agregar un elemento al Final de la lista
	public void add(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento, rabo, null);
        if (rabo == null) { // Si la lista estaba vacía
            cabeza = rabo = nuevo;
        } else {
            rabo.setSiguiente(nuevo);
            rabo = nuevo;
        }
        longitud++;
    }
    //Metodo para buscar un elemento T especificado en la lista
    public int buscar(T elemento) {
    Nodo<T> actual = cabeza;
    int índice = 0;
    
    while (actual != null) {
        if (actual.getElemento().equals(elemento)) {
            return índice; // Regresa la posición del elemento
        }
        actual = actual.getSiguiente();
        índice++;
    }
    return -1; // Retorna -1 si el elemento no está en la lista
	}

    //Metodo para imprimir la lista
    public void printList() {
        Nodo<T> actual = cabeza;
        System.out.print("[ ");
        while (actual != null) {
            System.out.print(actual.getElemento() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println("]");
    }

}