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
	private float dinero;
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
		this.equipado = new HashMap<>();
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
	
	public float getDinero() {
		return this.dinero;
	}
	
	public void setDinero(float dinero) {
		this.dinero = dinero;
	}
	
	public ArrayList<Item> getInventario(){
		return this.inventario;
	}
	
	public void setInventario(ArrayList<Item> inventario) {
		this.inventario = inventario;
	}
	
}
