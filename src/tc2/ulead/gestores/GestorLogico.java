package tc2.ulead.gestores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import tc2.ulead.entidades.Lista;
import tc2.ulead.entidades.Producto;
import tc2.ulead.ui.Interfaz;

public class GestorLogico {

	public boolean fileloaded = false;
	Interfaz ui = new Interfaz();

	public void cargarArchivo(ArrayList<Producto> productos) {
		try {
			Scanner filereader = new Scanner(new File("C:\\dev\\flipkart.csv"), "UTF-8");
			ArrayList<String> registros = new ArrayList<String>();

			while (filereader.hasNextLine()) {
				String linea = filereader.nextLine();
				registros.add(linea);
			}
			registros.remove(0);
			filereader.close();
			for (int i = 0; i < registros.size(); i++) {
				String datos[] = registros.get(i).split(",");
				Producto producto = new Producto(datos[0], datos[1], datos[2]);
				productos.add(producto);
			}
			fileloaded = true;
			ui.msg("El archivo fue cargado con exito..");

		} catch (FileNotFoundException e) {
			ui.msg("No fue posible encontrar el archivo...");
		}
	}

	public void cargarLista(Lista lista, ArrayList<Producto> productos) {

		for (int i = 0; i < productos.size(); i++) {
			lista.insertar(productos.get(i));
		}

	}

}
