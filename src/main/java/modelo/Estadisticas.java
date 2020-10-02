package modelo;

public class Estadisticas implements DatosEstadisticas{
	
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
		
		this.ataque = new Estadistica(DatosEstadisticas.ataque);
		this.defensa = new Estadistica(DatosEstadisticas.defensa);
		this.velocidad = new Estadistica(DatosEstadisticas.velocidad);
		this.vida = new Estadistica(DatosEstadisticas.vida);
		this.suerte = new Estadistica(DatosEstadisticas.suerte);
		
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
