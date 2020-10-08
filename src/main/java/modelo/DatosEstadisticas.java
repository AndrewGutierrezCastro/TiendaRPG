package modelo;

public interface DatosEstadisticas {
	
	public final int ataque = 50,
			   defensa = 80,
			   velocidad = 10, 
			   vida = 50, 
			   magia = 30, 
			   dinero = 10000;
	
	public final Categoria 
			   cAtaque = Categoria.ARMA,
			   cDefensa = Categoria.ARMADURA,
			   cVelocidad = Categoria.ARMADURA,
			   cVida = Categoria.ARMADURA,
			   cMagia = Categoria.MAGIA;
}
