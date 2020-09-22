package modelo;

import java.util.ArrayList;

public class Personaje {

	/*
	 * Clase: Personaje.
	 * Atributos: Inventario, Estadisticas.
	 * Funciones: Getters.
	 * Subclases: 
	 */
	
	//Atributos:
	private ArrayList <Item> inventario;
	private Estadisticas estadisticas;
	
	
	//Constructor:
	public Personaje() {
		super();
		
		this.inventario = new ArrayList<Item>();
		this.estadisticas = new Estadisticas();
		
	}
	
	public void comprar() {
		
	}
	
	public void vender() {
		
	}
	
}
