package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import controlador.InformacionItem;

public class Tienda {
	
	private HashMap<Categoria,HashMap<Tipo,List<Item>>> inventario ;

	public Tienda() {
		super();
		this.cargarInventario();
	}
	
	public Item comprarItem(InformacionItem infoItem) {
		/*
		 * FUNCION ENCARGADA DE COMPRAR EL ARTICULO DADO SU CATEGORIA, TIPO E INDEX EN SU LISTA
		 */
		
		List<Item> l = this.inventario.get(infoItem.categoriaItem).get(infoItem.tipoItem);
		return l.get(infoItem.indexLista);
			
	}
	
	public List<Item> getListItem(InformacionItem infoItem){
		return inventario.get(
					infoItem.categoriaItem)
					  .get(
						infoItem.tipoItem);
	}

	private void cargarInventario() {
		/*
		 * FUNCION ENCARGADA DE CARGAR EL JSON CON LOS DATOS EN EL HASHMAP DEINVENTARIO
		 */
		
		this.inventario = new HashMap<>();
		
		for (Tipo tipo : Tipo.values()) {
			
			if (this.inventario.get(tipo.categoria) == null) {
				this.inventario.put(tipo.categoria, new HashMap<Tipo,List<Item>>());
			}
			
			List<Producto> l = CreadorObjetos.getListProducts(tipo.toString());
			List<Item> listaItem = new ArrayList<>();
			
			for (int j = 0; j < l.size(); j++) {
				
				Item item = new Item((new Random()).nextInt(10) + 3,tipo.categoria , tipo, l.get(j));
				listaItem.add(item);
				
			}
				
			this.inventario.get(tipo.categoria).put(tipo, listaItem);
			
		}	
	}

	
	public HashMap<Categoria, HashMap<Tipo, List<Item>>> getInventario() {
		return inventario;
	}

	
}
