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
	
	public Item(int pValor, Producto pProducto) {

		this.estadistica = new Estadistica(pValor);
		this.producto = pProducto;
	}
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
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
