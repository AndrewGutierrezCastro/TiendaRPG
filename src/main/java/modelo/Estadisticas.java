package modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Estadisticas{
	
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
		
		this.ataque = new Estadistica(DatosEstadisticas.ataque, DatosEstadisticas.cAtaque);
		this.defensa = new Estadistica(DatosEstadisticas.defensa, DatosEstadisticas.cDefensa);
		this.velocidad = new Estadistica(DatosEstadisticas.velocidad, DatosEstadisticas.cVelocidad);
		this.vida = new Estadistica(DatosEstadisticas.vida, DatosEstadisticas.cVida);
		this.suerte = new Estadistica(DatosEstadisticas.magia, DatosEstadisticas.cMagia);
		
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

	public ArrayList<Estadistica> getArrayListStats(){
		return (ArrayList<Estadistica>)
				Arrays.asList(
				defensa, 
				ataque, 
				velocidad,
				vida,
				suerte);
	}



	
	
	

	
}
