package modelo;

import java.util.Arrays;
import java.util.List;

public class Estadisticas{
	
	/*
	 * Clase: Estadisticas.
	 * Atributos: defensa, ataque, velocidad, vida, suerte.
	 * Funciones: Getters.
	 */
	

	//Atributos:
	private Estadistica 
				defensa,
				ataque,
				velocidad,
				vida,
				magia;

	//Constructor:
	public Estadisticas() {
		super();
		
		this.ataque = new Estadistica(
						DatosEstadisticas.ataque, 
						DatosEstadisticas.cAtaque,
						NombreEstadistica.ATAQUE);
		this.defensa = new Estadistica(
						DatosEstadisticas.defensa, 
						DatosEstadisticas.cDefensa,
						NombreEstadistica.DEFENSA);
		this.velocidad = new Estadistica(
						DatosEstadisticas.velocidad, 
						DatosEstadisticas.cVelocidad,
						NombreEstadistica.VELOCIDAD);
		this.vida = new Estadistica(
					DatosEstadisticas.vida, 
					DatosEstadisticas.cVida,
					NombreEstadistica.VIDA);
		this.magia = new Estadistica(
					DatosEstadisticas.magia, 
					DatosEstadisticas.cMagia,
					NombreEstadistica.MAGIA);
		
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
		return magia;
	}

	public List<Estadistica> getArrayListStats(){
		return Arrays.asList(
				defensa, 
				ataque, 
				velocidad,
				vida,
				magia);
	}



	
	
	

	
}
