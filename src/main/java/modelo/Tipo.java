package modelo;

public enum Tipo {
	/*
	 * Enumerable: Item.
	 * Tipos: CASCO, ..., BACULOMAGICO;
	 * Funciones: Ninguna
	 */
	
	CASCO(Categoria.ARMADURA),
	ESCUDO(Categoria.ARMADURA),
	PECHERA(Categoria.ARMADURA),
	GUANTES(Categoria.ARMADURA),
	PANTALONES(Categoria.ARMADURA),
	ESPADA(Categoria.ARMA),
	HACHA(Categoria.ARMA),
	ARCO(Categoria.ARMA),
	BACULOMAGICO(Categoria.ARMA),
	POCION(Categoria.CONSUMIBLES);
	
	public Categoria categoria;
	
	Tipo(Categoria pCategoria) {
		this.categoria = pCategoria;
	}
}
