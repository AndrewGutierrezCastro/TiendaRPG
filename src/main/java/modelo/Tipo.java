package modelo;

import java.util.List;
import java.util.Arrays;
public enum Tipo {
	/*
	 * Enumerable: Item.
	 * Tipos: CASCO, ..., BACULOMAGICO;
	 * Funciones: Ninguna
	 */
	
	CASCO(Categoria.ARMADURA,Arrays.asList(NombreEstadistica.DEFENSA,NombreEstadistica.VIDA)),
	
	ESCUDO(Categoria.ARMADURA,Arrays.asList(NombreEstadistica.DEFENSA,NombreEstadistica.ATAQUE)),
	
	PECHERA(Categoria.ARMADURA,Arrays.asList(NombreEstadistica.DEFENSA,NombreEstadistica.VIDA)),
	
	GUANTES(Categoria.ARMADURA,Arrays.asList(NombreEstadistica.DEFENSA,NombreEstadistica.MAGIA)),
	
	PANTALONES(Categoria.ARMADURA,Arrays.asList(NombreEstadistica.DEFENSA,NombreEstadistica.VELOCIDAD)),
	
	ESPADA(Categoria.ARMA,Arrays.asList(NombreEstadistica.ATAQUE,NombreEstadistica.MAGIA)),
	
	HACHA(Categoria.ARMA,Arrays.asList(NombreEstadistica.ATAQUE,NombreEstadistica.MAGIA)),
	
	ARCO(Categoria.ARMA,Arrays.asList(NombreEstadistica.ATAQUE,NombreEstadistica.MAGIA)),
	
	BACULOMAGICO(Categoria.ARMA,Arrays.asList(NombreEstadistica.MAGIA,NombreEstadistica.VIDA)),
	
	POCION(Categoria.CONSUMIBLES,Arrays.asList(NombreEstadistica.VIDA,NombreEstadistica.MAGIA));


	
	public Categoria categoria;
	public List<NombreEstadistica> listNmbrSts;
	
	Tipo(Categoria pCategoria, List<NombreEstadistica> list) {
		this.categoria = pCategoria;
		this.listNmbrSts = list;
	}
}
