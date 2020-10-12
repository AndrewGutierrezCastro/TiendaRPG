package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import vista.JLabelEstadistica;

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
	private HashMap<NombreEstadistica, Estadistica> hashMapJugadorStats;
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
	
	public boolean comprarItem(Item item) {
		float costo = item.getProducto().getPrice().getCurrent_price();
		
		if(costo <= dinero && !inventario.contains(item)) {	
			dinero -= costo ;//Literalmente hablando esta es la compra
			inventario.add(item);
			return true;
		}
		return false;
	}
	
	public boolean venderItem(Item item) {
		dinero += item.getProducto().getPrice().getCurrent_price()/2;
		return inventario.remove(item);
	}
	
	public Item getItemInventario(int index) {
		return inventario.get(index);
	}
	
	public Estadisticas getEstadisticas() {
		return this.estadisticas;
	}
	
	public HashMap<NombreEstadistica, Estadistica>  getHashMapJugadorStats() {
		return hashMapJugadorStats;
	}
	
	public ArrayList<Item> getInventario(){
		return this.inventario;
	}
	
	private void cargarHashMapEstadisticas() {

		hashMapJugadorStats = new HashMap<NombreEstadistica, Estadistica>();
		
		for (Estadistica estadistica : estadisticas.getArrayListStats()) {
			hashMapJugadorStats.put(estadistica.getNombreEstadistica(), estadistica);
		}
	}

	public void equiparItem(Item item) {
			
		Item item2 = this.equipado.get(item.getTipo());
		int valorEstadistica;
		
		if (item2 != null) {//Si ya contiene un item de un tipo equipado
			this.desequiparItem(item2);
		}
		
		valorEstadistica = item.getEstadistica().getValor();
		for (NombreEstadistica nmbrEstadistica : item.getTipo().listNmbrSts) {
			
			Estadistica estadistica = this.hashMapJugadorStats.get(nmbrEstadistica);
			estadistica.setValor(estadistica.getValor()+valorEstadistica);
			valorEstadistica = (valorEstadistica / 2);	

		}
		
		//VERIFICA SI ES UNA POCION PARA USARLA E ELIMINARLA
		if (item.getCategoria() != Categoria.CONSUMIBLES) {
			this.equipado.put(item.getTipo(), item);
		}else {
			this.inventario.remove(item);
		}	
	}
	
	public void desequiparItem(Item item) {
		
		int valorEstadistica = item.getEstadistica().getValor();
		
		for (NombreEstadistica nmbrEstadistica : item.getTipo().listNmbrSts) {
			
			Estadistica estadistica = this.hashMapJugadorStats.get(nmbrEstadistica);
			estadistica.setValor(estadistica.getValor()-valorEstadistica);
			valorEstadistica = (valorEstadistica / 2);	

		}
		this.equipado.remove(item.getTipo());
	}
	
	public boolean isEquipado(Item item) {
		/*
		 * Averigua si el item ya se encuentra equipado
		 */
		if (this.equipado.containsValue(item)) {
			return true;
		}
		return false;
	}
	
	public float getDinero() {
		return this.dinero;
	}
	
	public void setDinero(float dinero) {
		this.dinero = dinero;
	}
	
	public void setInventario(ArrayList<Item> inventario) {
		this.inventario = inventario;
	}
	
}
