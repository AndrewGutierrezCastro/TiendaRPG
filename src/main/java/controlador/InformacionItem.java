package controlador;

import modelo.Categoria;
import modelo.Tipo;

public class InformacionItem {
	public Categoria categoriaItem;
	public Tipo tipoItem;
	public int indexLista;
	
	public InformacionItem(Categoria categoriaItem, Tipo tipoItem, int indexLista) {
		super();
		this.categoriaItem = categoriaItem;
		this.tipoItem = tipoItem;
		this.indexLista = indexLista;
	}
	
	
}
