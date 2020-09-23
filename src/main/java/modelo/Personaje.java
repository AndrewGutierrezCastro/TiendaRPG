package modelo;

import java.util.ArrayList;
import java.util.HashMap;

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
	private HashMap<Tipo, Item> equipado;
	
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
