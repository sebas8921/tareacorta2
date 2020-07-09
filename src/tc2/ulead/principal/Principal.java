package tc2.ulead.principal;

import tc2.ulead.gestores.Logica;
import tc2.ulead.ui.Interfaz;

public class Principal {

	public static void main(String[] args) {
		Logica programa = new Logica();
		Interfaz ui = new Interfaz();
		int opc;
		do {
			ui.menuPrincipal();
			opc = ui.leerOpcion();
			switch (opc) {
			case 1:
				programa.execute1();
				break;
			case 2:
				programa.execute2();
				break;
			case 3:
				programa.execute3();
				break;
			case 4:
				ui.msg("Gracias por hacer uso de la tarea corta 2...Hasta pronto!");
				break;
			default:
				ui.msg("Opcion invalida");
				break;

			}
		} while (opc != 4);
	}

}
