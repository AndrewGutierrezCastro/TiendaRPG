package modelo;

public class Item {
	/*
	 * Clase: Item.
	 * Atributos: estadistica, producto.
	 * Funciones: Getters and Setter, Constructor.
	 */
	private Estadistica estadistica;
	private Categoria categoria;
	private Tipo tipo;
	private Producto producto;
	
	public Item(int pValor, Categoria categoria, Tipo pTipo, Producto pProducto) {

		this.estadistica = new Estadistica(pValor, categoria);
		this.tipo = pTipo;
		this.categoria = categoria;
		this.producto = pProducto;
	}
	
	public Producto getProducto() {
		return producto;
	}

	public Estadistica getEstadistica() {
		return estadistica;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	
}
