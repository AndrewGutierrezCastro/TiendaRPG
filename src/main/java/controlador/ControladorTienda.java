package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.Categoria;
import modelo.CreadorObjetos;
import modelo.Estadistica;
import modelo.Item;
import modelo.NombreEstadistica;
import modelo.Personaje;
import modelo.Producto;
import modelo.Tienda;
import modelo.Tipo;
import vista.ComponentesUI;
import vista.Helpers;
import vista.JLabelEstadistica;
import vista.vTienda;


public class ControladorTienda implements ActionListener, ListSelectionListener {
	
	private vTienda ventana;
	private Personaje personaje;
	private Tienda tienda;
	private HashMap<NombreEstadistica, JLabelEstadistica> hashMapLblStats;
	
	public ControladorTienda() {
		this.ventana = new vTienda(this);
		this.personaje = new Personaje();
		this.tienda = new Tienda();
		this.ventana.cargar();
		this.cargarLabelsEstadistica();
		
	}

	public void actionPerformed(ActionEvent arg0) {
		
		switch(arg0.getActionCommand()) {
		case "COMPRAR":
			this.comprarItem();
			break;
			
		case "VENDER":
			this.venderItem();
			break;
			
		case "EQUIPAR":
			this.equiparItem();
			break;
			
		case "CATEGORIA":
			this.cambiarOpcionesComboBox();
			break;
			
		case "SELECCION":
			this.asignarProductosPorTipo();
			break;
		}
		
	}
	
	private InformacionItem getItemSeleccionadoTienda() {
		if (!this.ventana.listaCompras.isSelectionEmpty()) {
			Categoria categoriaItem =  Categoria.valueOf(this.ventana.comboBoxCategoria.getSelectedItem().toString());
			Tipo tipoItem = Tipo.valueOf(this.ventana.comboBoxSeleccion.getSelectedItem().toString());
			int indexLista =  this.ventana.listaCompras.getSelectedIndex();
			return new InformacionItem(categoriaItem, tipoItem, indexLista);
		}
		return null;
	}
	
	private InformacionItem getTipoSeleccionado() {
		String categoria = this.ventana.comboBoxCategoria.getSelectedItem().toString();
		String tipo = this.ventana.comboBoxSeleccion.getSelectedItem().toString();
		if(categoria != "" && tipo != "") {
			Categoria categoriaItem =  Categoria.valueOf(categoria);
			Tipo tipoItem = Tipo.valueOf(tipo);
			int indexLista =  this.ventana.listaCompras.getSelectedIndex();
			return new InformacionItem(categoriaItem, tipoItem, indexLista);
		}
		return null;
	}
	
	private void venderItem() {
		
		if (!this.ventana.listaInventario.isSelectionEmpty()) {
			Item item = this.personaje.getItemInventario(this.ventana.listaInventario.getSelectedIndex());
			
			if (this.personaje.isEquipado(item)) {
				JOptionPane.showMessageDialog(null, "¡No se puede vender un item equipado!");
				return;
			}
			
			int desicion = JOptionPane.
					showConfirmDialog(null,
						"¿Esta seguro que desea vender este Item a USD "+
							item.getProducto().getPrice().getCurrent_price()/2+"?");
			
			if (desicion == JOptionPane.YES_OPTION) {
				this.personaje.venderItem(item);
				this.ventana.lblDinero.setText("Dinero: "+this.personaje.getDinero());
				this.asignarProductosComprados();
			}
		}else { JOptionPane.showMessageDialog(null, "¡Debe seleccionar una opción a vender!");}
		
	}
	
	private void comprarItem() {
		/*
		 * Este metodo se encarga de llamar al metodo comprar en tienda 
		 * Validar si se selecciono un item de la lista en UI, Obtener sus 
		 * datos.
		 * Llamar al metodo comprar en Personaje
		 
		 * */
		
		InformacionItem infoItem = getItemSeleccionadoTienda();
		if (infoItem != null) {	
			
			Item item = tienda.comprarItem(infoItem);
			
			if(personaje.comprarItem(item)) {
				
				JOptionPane.showMessageDialog(null, "¡Comprado correctamente!");
				System.out.println(item.getProducto().getPrice().getCurrent_price());
				this.ventana.lblDinero.setText("Dinero: "+this.personaje.getDinero());		
				this.asignarProductosComprados();
				System.out.println(this.personaje.getInventario().size());
			
			}else {
				JOptionPane.showMessageDialog(null, "¡No tiene dinero o ya lo tiene en inventario!");
			}
				
		}else {	JOptionPane.showMessageDialog(null, "¡Debe selccionar algun item!");}

	}	
	
	private void equiparItem() {
		
		if (!this.ventana.listaInventario.isSelectionEmpty()) {
			
			Item item = this.personaje.getItemInventario(this.ventana.listaInventario.getSelectedIndex());
			if(!this.personaje.isEquipado(item)) {
				this.personaje.equiparItem(item);
				JOptionPane.showMessageDialog(null, "¡El item se ha equipado con exito!");
			}else {
				this.personaje.desequiparItem(item);
				JOptionPane.showMessageDialog(null, "¡El item ya no se encuentra equipado!");
			}
			this.setPersonajeEstads();
			this.asignarProductosComprados();
			
			
		}else { JOptionPane.showMessageDialog(null, "¡Debe seleccionar una opción a equipar!");}
	}
	

	private void cambiarOpcionesComboBox() {
	/*
	 * FUNCION ENCARGADA DE CAMBIAR LAS OPCIONES DEL COMBOBOX DE SELECCION 
	 */
		
		String categoria = this.ventana.comboBoxCategoria.getSelectedItem().toString();
		this.ventana.listaCompras.setModel(new DefaultListModel());
		
		this.ventana.comboBoxSeleccion.setEnabled(true);
		
		switch(categoria) {
		case "ARMA":
			this.ventana.lblSeleccion.setText("Seleccione la arma:");
			this.ventana.comboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ESPADA", "HACHA", "ARCO", "BACULOMAGICO"}));
			break;
		case "ARMADURA":
			this.ventana.lblSeleccion.setText("Seleccione la armadura:");
			this.ventana.comboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "CASCO", "ESCUDO", "PECHERA", "GUANTES", "PANTALONES"}));
			break;
		case "CONSUMIBLES":
			this.ventana.lblSeleccion.setText("Seleccione la poción:");
			this.ventana.comboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "POCION"}));
			break;
		}
	}
	
	private void asignarProductosComprados() {
		
		DefaultListModel model = new DefaultListModel();
		this.ventana.listaInventario.setModel(model);
		
		DefaultListModel modelo = (DefaultListModel) this.ventana.listaInventario.getModel();
		int contador = 1;
		
		List<Item> l = this.personaje.getInventario();
		for (Item item : l) {
			modelo.addElement(contador+"/ "+"("+item.getCategoria().toString()+") "+item.getProducto().getTitle()); 
			contador++;
		}
	}
	
	
	private void asignarProductosPorTipo() {
		/*
		 * FUNCION ENCARGADA DE ASIGNAR LOS PRODUCTOS A LA LISTA DEPENDIENDO DE LA CATEGORIA Y ARMA SELECCIONADA
		 */
		
		DefaultListModel model = new DefaultListModel();
		this.ventana.listaCompras.setModel(model);
		
		String tipo = this.ventana.comboBoxSeleccion.getSelectedItem().toString();
		if (tipo == "") {return;}
		
		DefaultListModel modelo = (DefaultListModel) this.ventana.listaCompras.getModel();
		int contador = 1;
		
		List<Item> l = tienda.getListItem(getTipoSeleccionado());
		for (Item item : l) {
			modelo.addElement(contador+"/ "+item.getProducto().getTitle()+", PRICE: "+item.getProducto().getPrice()); 
			contador++;
		}
	}
	
	@Override
	public void valueChanged(ListSelectionEvent arg0){
		
	/*
	 * FUNCION ENCARGADA DE RECIBIR LA SEÑAL POR PARTE DEL ITEM SELECCIONADO DEL JLIST
	 */

		if (arg0.getValueIsAdjusting()) {//Se realiza dado que se ejecuta el listener cuando se presiona el boton y cuando se suelta
			
			if(arg0.getSource() == this.ventana.listaCompras) {//Se ejecuta si la señal es proveniente de la lista de la tienda
				
				this.setPersonajeEstads();
				int index = this.ventana.listaCompras.getSelectedIndex();
				List<Item> l = tienda.getListItem(getItemSeleccionadoTienda());
				Item item = l.get(index);
				actualizarLabel(item);
				this.agregarImagen(item);
				
			}else {
				this.setPersonajeEstads();
				int index = this.ventana.listaInventario.getSelectedIndex();
				Item item = this.personaje.getInventario().get(index);
				actualizarLabel(item);
				this.agregarImagen(item);
				this.actualizarBtnEquipar(item);
				
			}
		}
	}
	
	private void actualizarBtnEquipar(Item item) {
		
		if (this.personaje.isEquipado(item)) {
			this.ventana.btnEquipar.setText("Desequipar");
		}else {
			this.ventana.btnEquipar.setText("Equipar");
		}
	}
	
	private void cargarLabelsEstadistica() {
		/*
		 * Se crea el hashmap de labelsEstadisticas 
		 * apartir de una lista de JlabelsEstadistica
		 * */
		
		hashMapLblStats = new HashMap<NombreEstadistica, JLabelEstadistica>();
		List<JLabelEstadistica> arrayListLblStats = ventana.getJlblEstadisticas();
		
		for (JLabelEstadistica lblEstadistica : arrayListLblStats) {
			hashMapLblStats.put(lblEstadistica.getNombreEstadistica(), lblEstadistica);
		}
	}
	
	private void actualizarLabel(Item item) {
		/* Este metodo actualiza las labels de estadisticas con el estad enviado
		 * Este tiene categoria y un valor, solo eso es necesario para identificar las labels
		 * a modificar
		 * */
		int valorPersonaje = 0;
		int valorEstadistica = item.getEstadistica().getValor();
		for (NombreEstadistica nmbrEstadistica : item.getTipo().listNmbrSts) {
				
			valorPersonaje = personaje.getHashMapJugadorStats().get(nmbrEstadistica).getValor();	
			hashMapLblStats.get(nmbrEstadistica).setText(valorPersonaje + "  +  " + valorEstadistica);
			valorEstadistica = (valorEstadistica / 2);
			
		}
	}
	
	private void setPersonajeEstads() {
		/*
		 * Este metodo setea las estads del personaje recorriendo el 
		 * hash de estadisticas para llamar el metodo
		 * */
		int valorPersonaje = 0;
		NombreEstadistica nmbrEstadistica;
		for (Estadistica estadistica : personaje.getHashMapJugadorStats().values()) {
			nmbrEstadistica = estadistica.getNombreEstadistica();
			valorPersonaje = personaje.getHashMapJugadorStats().get(nmbrEstadistica).getValor();
			hashMapLblStats.get(nmbrEstadistica).setText(String.valueOf(valorPersonaje));
		}
	}
	
	private void agregarImagen(Item item) {
		
		try {
			this.ventana.lblImagen.setIcon(
					Helpers.getImagen(
					ComponentesUI.getWebImage(
					new URL(item.getProducto().getThumbnail())),
					200, 150));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
