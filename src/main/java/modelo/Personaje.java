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
	private HashMap<Categoria, Estadistica> hashMapJugadorStats;
	private HashMap<Tipo, Item> equipado;
	
	//Constructor:
	public Personaje() {
		super();
		
		this.dinero = DatosEstadisticas.dinero;
		this.inventario = new ArrayList<Item>();
		this.estadisticas = new Estadisticas();
		this.cargarHashMapEstadisticas();
	}
	
	public Estadisticas getEstadisticas() {
		return this.estadisticas;
	}
	
	private void cargarHashMapEstadisticas() {
		hashMapJugadorStats = new HashMap<>();
		for (Estadistica estad : estadisticas.getArrayListStats()) {
			hashMapJugadorStats.put(estad.getCategoria(), estad);
		}
	}

	public HashMap<Categoria, Estadistica> getHashMapJugadorStats() {
		return hashMapJugadorStats;
	}
	
}
