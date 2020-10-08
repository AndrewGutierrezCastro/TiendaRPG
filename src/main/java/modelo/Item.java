package modelo;

public class Item {
	/*
	 * Clase: Item.
	 * Atributos: estadistica, producto.
	 * Funciones: Getters and Setter, Constructor.
	 */
	private Estadistica estadistica1, estadistica2;
	//private Categoria categoria;
	private Categoria categoria;
	private Tipo tipo;
	private Producto producto;
	
	public Item(int pValor, Categoria categoria, Tipo pTipo, Producto pProducto) {

		this.estadistica1 = new Estadistica(pValor, categoria);
		this.estadistica2 = new Estadistica((int)(pValor/2), categoria);
		this.tipo = pTipo;
		this.categoria = categoria;
		this.producto = pProducto;
	}
	
	public Producto getProducto() {
		return producto;
	}


	public Estadistica getEstadistica() {
		return estadistica1;
	}
	
	public Estadistica getEstadistica2() {
		return estadistica2;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	
}
