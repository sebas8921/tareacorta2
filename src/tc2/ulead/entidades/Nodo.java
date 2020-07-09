package tc2.ulead.entidades;

public class Nodo {
	private Nodo siguiente;
	private Producto dato;
	
	public Nodo(Producto dato, Nodo siguiente) {
		this.siguiente = siguiente;
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Producto getDato() {
		return dato;
	}

	public void setDato(Producto dato) {
		this.dato = dato;
	}
	
	
}
