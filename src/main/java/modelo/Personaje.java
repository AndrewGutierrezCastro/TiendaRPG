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
	private int dinero;
	private ArrayList <Item> inventario;
	private Estadisticas estadisticas;
	private HashMap<Tipo, Item> equipado;
	
	//Constructor:
	public Personaje() {
		super();
		
		this.dinero = DatosEstadisticas.dinero;
		this.inventario = new ArrayList<Item>();
		this.estadisticas = new Estadisticas();
		
	}
	
	public Estadisticas getEstadisticas() {
		return this.estadisticas;
	}
}
