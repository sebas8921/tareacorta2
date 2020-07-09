package tc2.ulead.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class Interfaz {

	private PrintStream output = new PrintStream(System.out);
	private Scanner input = new Scanner(System.in);

	public void menuPrograma1() {
		output.println("Bienvenido al Primer programa...Carga de un archivo a una lista enlazada y elistamiento de codigos unicos");
		output.println("Menu principal");
		output.println("----------------------");
		output.println("1.Cargar el archivo");
		output.println("2.Buscar datos");
		output.println("3.Listar codigos unicos alfanumericos");
		output.println("4.Salir");
	}

	public int leerOpcion() {
		output.println("Digite el numero de la opcion que desea realizar: ");
		return input.nextInt();
	}
	
	public int leerIndice() {
		output.println("Digite el numero del indice que desea mostrar: ");
		return input.nextInt();
	}


	public String leerTexto() {
		output.println("Ingrese el producto o un texto aproximado del mismo: ");
		return input.next();
	}

	public void msg(String msg) {
		output.println(msg);
	}

	
	public void menuPrograma2() {
		output.println("Bienvenido al segundo programa...metodologia hash basada en numero deciamal del codigo del producto");
		output.println("Menu principal");
		output.println("----------------------");
		output.println("1.Listar campos de la tabla hash con datos disponibles");
		output.println("2.Listar productos de un indice específico");
		output.println("3.Salir");
	}

	public void menuPrograma3() {
		output.println("Bienvenido al tercer programa...Metodologia hash basada en el nombre del producto");
		output.println("Menu principal");
		output.println("----------------------");
		output.println("1.Listar campos de la tabla hash con datos disponibles");
		output.println("2.Listar productos de un indice específico");
		output.println("3.Salir");
	}

	public void menuPrincipal() {
		output.println("Bienvenido al menu principal de la tarea corta 2, la misma consta de 3 programas");
		output.println("----------------------");
		output.println("1.Lectura de archivo, visualizacion de productos y codigos unicos...");
		output.println("2.Carga y manipulacion  datos del archivo en una tabla hash utilizando indices en base al codigo de producto");
		output.println("3.Carga y manipulacion  datos del archivo en una tabla hash utilizando indices en base al nombre de producto");
		output.println("4.Salir");
		
	}
}
