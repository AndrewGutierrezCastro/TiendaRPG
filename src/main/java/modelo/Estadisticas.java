package modelo;

public class Estadisticas {
	
	/*
	 * Clase: Estadisticas.
	 * Atributos: defensa, ataque, velocidad, vida, suerte.
	 * Funciones: Getters.
	 */
	

	//Atributos:
	private Estadistica defensa, ataque, velocidad, vida, suerte;

	//Constructor:
	public Estadisticas() {
		super();
		
		this.ataque = new Estadistica(50);
		this.defensa = new Estadistica(80);
		this.velocidad = new Estadistica(10);
		this.vida = new Estadistica(100);
		this.suerte = new Estadistica(30);
		
	}

	
	//Funciones:
	public Estadistica getDefensa() {
		return defensa;
	}

	public Estadistica getAtaque() {
		return ataque;
	}

	public Estadistica getVelocidad() {
		return velocidad;
	}

	public Estadistica getVida() {
		return vida;
	}

	public Estadistica getSuerte() {
		return suerte;
	}
	
	

	
}
