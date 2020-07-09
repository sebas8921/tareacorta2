package tc2.ulead.entidades;

import tc2.ulead.ui.Interfaz;

public class TablaHash {
	
	Lista tablahash[];
	Interfaz ui = new Interfaz();
	
	
	public TablaHash(int n) {
		 tablahash = new Lista[n];
	}
	
		public void HashDecimal(Producto prod) {
			int indice = Integer.parseInt(prod.getCodigo().substring(30, 33),16);
			if (indice > 4094) indice = 4094;
			if (indice < 0) indice = 0;
			Lista primerelemento = new Lista();
			primerelemento.insertar(prod);
			if(tablahash[indice] == null) {
				tablahash[indice] = primerelemento;
			}else {
				tablahash[indice].insertar(prod);
			}
	}
		public void MostrarIndices() {
			ui.msg("Acontinuacion la lista de indices disponibles de la tabla hash:  ");
			ui.msg("-----------------------------------------------------------------------");
			for(int i = 0; i < tablahash.length;i++) {
				if(tablahash[i] != null) ui.msg(String.valueOf(i)); 
			}
		}
		public void MostrarValoresIndice(int opcind) {
			ui.msg("Los productos en el indice "+opcind+" son:");
			ui.msg("-----------------------------------------------------------------------");
			tablahash[opcind].mostrar();
		}
		
		public void HashNombre(Producto prod) {
			int indice = sumarConsonantes(prod.getNombre());
			Lista primerelemento = new Lista();
			primerelemento.insertar(prod);
			if(tablahash[indice] == null) {
				tablahash[indice] = primerelemento;
			}else {
				tablahash[indice].insertar(prod);
			}
			
		}
		
		private int sumarConsonantes(String nombre) {
			int cont = 0;
			for(int i = 0; i<nombre.length();i++) {
				char car = nombre.charAt(i);
				if (Character.isLetter(car) && car != 'a' && car != 'e' && car != 'i' && car != 'o' && car != 'u') {
					cont = cont+1;
				}
			}
			if (cont >49) cont = 49;
			return cont;
		}
		
}
