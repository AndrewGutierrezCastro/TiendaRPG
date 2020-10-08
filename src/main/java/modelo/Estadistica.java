package modelo;

public class Estadistica{
	/*
	 * Clase: Estadistica.
	 * Atributos: valor
	 * Funciones: Getters and setter.
	 */
	private int valor;
	private Categoria categoria;
	
	public Estadistica(int valor, Categoria categoria) {
		super();
		this.valor = valor;
		this.categoria = categoria;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
