package tc2.ulead.entidades;

public class Producto {
	
	private String codigo, nombre, categoria;
	
	public Producto(String codigo, String nombre, String categoria) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto: "
				+ "\ncodigo=" + codigo 
				+ "\nnombre=" + nombre 
				+ "\ncategoria=" + categoria + 
				"\n";
	}
	
}
