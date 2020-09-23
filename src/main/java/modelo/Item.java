package modelo;

public class Item {
	/*
	 * Clase: Item.
	 * Atributos: estadistica.
	 * Funciones: Getters and Setter, Constructor.
	 */
	private Estadistica estadistica;
	private Categoria categoria;
	private Tipo tipo;
	
	public Item(int pValor) {

		this.estadistica = new Estadistica(pValor);
	}

	public Estadistica getEstadistica() {
		return estadistica;
	}

	public void setEstadistica(Estadistica estadistica) {
		this.estadistica = estadistica;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
}
