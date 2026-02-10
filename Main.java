public class Main{
	public static void main(String[] args) {
		Lista<Integer> lista = new Lista<>();
        //Agregamos unos elementos a nuestra nueva lista
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.printList(); // Imprimimos nuestra lista

        int índice = lista.buscar(20);
        System.out.println("Índice de 20: " + índice); // 1
        //Probamos nuestro metodo para buscar un elemento
        índice = lista.buscar(40);
	}
}