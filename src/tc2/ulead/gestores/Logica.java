package tc2.ulead.gestores;

import java.util.ArrayList;

import tc2.ulead.entidades.Lista;
import tc2.ulead.entidades.Producto;
import tc2.ulead.entidades.TablaHash;
import tc2.ulead.ui.Interfaz;

public class Logica {
	Interfaz ui = new Interfaz();
	GestorLogico gl = new GestorLogico();
	ArrayList<Producto> productos = new ArrayList<Producto>();
	Lista lp = new Lista();

	public void execute1() {
		int opc;
		do {
			ui.menuPrograma1();
			opc = ui.leerOpcion();
			switch (opc) {
			case 1:
				gl.cargarArchivo(productos);
				gl.cargarLista(lp, productos);
				break;
			case 2:
				String texto = ui.leerTexto();
				lp.mostrar(texto);
				break;
			case 3:
				lp.listarCodigosUnicos();
				break;
			case 4:
				ui.msg("Fin del programa uno..Hasta pronto...");
				break;
			default:
				ui.msg("Opcion invalida");
				break;
			}
		} while (opc != 4);
	};
	
	public void execute2() {
		if (!gl.fileloaded) {
			gl.cargarArchivo(productos);
		}
		TablaHash th = new TablaHash(4095);
		for(int i = 0; i<productos.size();i++) {
			th.HashDecimal(productos.get(i));	
		}
		int opc;
		do {
			ui.menuPrograma2();
			opc = ui.leerOpcion();
			switch(opc) {
			case 1:
				th.MostrarIndices();
				break;
			case 2:
				int opcind = ui.leerIndice();
				th.MostrarValoresIndice(opcind);
				break;
			case 3:
				ui.msg("Fin del programa dos..Hasta pronto...");
				break;
			default: 
				ui.msg("Opcion invalida");
				break;
			}
		}while( opc != 3);
	};
	
	
	public void execute3() {
		if (!gl.fileloaded) {
			gl.cargarArchivo(productos);
		}
		TablaHash th = new TablaHash(50);
		for(int i = 0; i<productos.size();i++) {
			th.HashNombre(productos.get(i));	
		}
		int opc;
		do {
			ui.menuPrograma3();
			opc = ui.leerOpcion();
			switch(opc) {
			case 1:
				th.MostrarIndices();
				break;
			case 2:
				int opcind = ui.leerIndice();
				th.MostrarValoresIndice(opcind);
				break;
			case 3:
				ui.msg("Fin del programa dos..Hasta pronto...");
				break;
			default: 
				ui.msg("Opcion invalida");
				break;
			}
		}while( opc != 3);
	}
}
