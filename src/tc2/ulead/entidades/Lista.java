package tc2.ulead.entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import tc2.ulead.ui.Interfaz;

public class Lista {
	private Nodo inicio;
	private Nodo fin;
	Interfaz ui = new Interfaz();

	public Lista() {
		inicio = null;
		fin = null;
	};

	public boolean estaVacia() {
		return inicio == null;
	};

	public void insertar(Producto producto) {
		Nodo nuevonodo;
		if (this.estaVacia()) {
			nuevonodo = new Nodo(producto, null);
			this.inicio = nuevonodo;
			this.fin = nuevonodo;
		} else {
			nuevonodo = new Nodo(producto, null);
			this.fin.setSiguiente(nuevonodo);
			this.fin = nuevonodo;
		}
	};

	public void mostrar() {
		if (this.estaVacia()) {
			ui.msg("La lista esta vacia...");
		} else {
			Nodo temporal;
			temporal = inicio;
			while (temporal != null) {
				ui.msg(temporal.getDato().toString());
				temporal = temporal.getSiguiente();
			}
		}
	};

	public void mostrar(String texto) {
		if (this.estaVacia()) {
			ui.msg("La lista esta vacia...");
		} else {
			Nodo temporal;
			temporal = inicio;
			int i = 0;
			while (temporal != null) {
				if (temporal.getDato().getNombre().contains(texto)) {
					ui.msg("Posicion lineal [" + i + "] , Producto: " + temporal.getDato().getNombre());
				}
				temporal = temporal.getSiguiente();
				i++;
			}
		}
	};

	public void listarCodigosUnicos() {

		if (this.estaVacia()) {
			ui.msg("La lista esta vacia...");
		} else {
			ArrayList<String> codigos = new ArrayList<String>();
			Nodo temporal;
			temporal = inicio;
			while (temporal != null) {
				codigos.add(temporal.getDato().getCodigo().substring(30, 33));
				temporal = temporal.getSiguiente();
			}
			Set<String> sCodigos = new HashSet<String>(codigos);
			for(String valor:sCodigos) {
				ui.msg(valor);
			}
			
		}
	};

}
