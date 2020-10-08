package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
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
import modelo.Personaje;
import modelo.Producto;
import modelo.Tipo;
import vista.ComponentesUI;
import vista.Helpers;
import vista.JLabelEstadistica;
import vista.vTienda;


public class ControladorTienda implements ActionListener, ListSelectionListener {
	
	private vTienda ventana;
	private Personaje personaje;
	private HashMap<Categoria,HashMap<Tipo,List<Item>>> inventario ;
	private HashMap<Categoria, ArrayList<JLabelEstadistica>> hashMapLblStats;
	
	
	public ControladorTienda() {
		this.ventana = new vTienda(this);
		this.personaje = new Personaje();
		this.ventana.cargar();
		this.cargarInventario();
		this.cargarLabelsEstadistica();
		
	}

	public void actionPerformed(ActionEvent arg0) {
		
		switch(arg0.getActionCommand()) {
		case "COMPRAR":
			this.comprarObjeto();
			break;
			
		case "VENDER":
			System.out.println("Parte del VENDER");
			break;
			
		case "EQUIPAR":
			System.out.println("Parte del EQUIPAR");
			break;
			
		case "CATEGORIA":
			this.cambiarOpcionesComboBox();
			break;
			
		case "SELECCION":
			this.asignarProductosPorTipo();
			break;
		}
		
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
		
		List<Item> l = this.inventario.get(Categoria.valueOf(this.ventana.comboBoxCategoria.getSelectedItem().toString())).get(Tipo.valueOf(this.ventana.comboBoxSeleccion.getSelectedItem().toString()));
		for (Item item : l) {
			modelo.addElement(contador+"/ "+item.getProducto().getTitle()+", PRICE: "+item.getProducto().getPrice()); 
			contador++;
		}
	}
	
	private void comprarObjeto() {
		/*
		 * FUNCION ENCARGADA DE COMPRAR EL ARTICULO
		 */
		
		if (!this.ventana.listaCompras.isSelectionEmpty()) {
			List<Item> l = this.inventario.get(Categoria.valueOf(this.ventana.comboBoxCategoria.getSelectedItem().toString())).get(Tipo.valueOf(this.ventana.comboBoxSeleccion.getSelectedItem().toString()));
			Item item = l.get(this.ventana.listaCompras.getSelectedIndex());
			System.out.println(item.getProducto().getTitle());

		}else {
			JOptionPane.showMessageDialog(null, "¡Debe seleccionar una opción a comprar!");
		}
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
	
	@Override
	public void valueChanged(ListSelectionEvent arg0){
		
	/*
	 * FUNCION ENCARGADA DE RECIBIR LA SEÑAL POR PARTE DEL ITEM SELECCIONADO DEL JLIST
	 */
		
		if (arg0.getValueIsAdjusting()) {//Se realiza dado que se ejecuta el listener cuando se presiona el boton y cuando se suelta
			this.setPersonajeEstads();
			int index = this.ventana.listaCompras.getSelectedIndex();
			List<Item> l = this.inventario.get(Categoria.valueOf(this.ventana.comboBoxCategoria.getSelectedItem().toString())).get(Tipo.valueOf(this.ventana.comboBoxSeleccion.getSelectedItem().toString()));
			Item item = l.get(index);
			actualizarLabel(item.getEstadistica());
			this.agregarImagen(item);
			

		}
	}
	
	private void cargarLabelsEstadistica() {
		/*
		 * Se crea el hashmap de labelsEstadisticas 
		 * apartir de una lista de JlabelsEstadistica
		 * */
		hashMapLblStats = new HashMap<Categoria,ArrayList<JLabelEstadistica>>();
		List<JLabelEstadistica> arrayListLblStats = ventana.getJlblEstadisticas();
		
		for (JLabelEstadistica lblEstadistica : arrayListLblStats) {
			if(hashMapLblStats.get(lblEstadistica.getCategoria()) == null){
				hashMapLblStats.put(lblEstadistica.getCategoria(), new ArrayList<JLabelEstadistica>());
			}
			hashMapLblStats.get(lblEstadistica.getCategoria()).add(lblEstadistica);
		}
	}
	
	private void actualizarLabel(Estadistica estad) {
		/* Este metodo actualiza las labels de estadisticas con el estad enviado
		 * Este tiene categoria y un valor, solo eso es necesario para identificar las labels
		 * a modificar
		 * */
		ArrayList<JLabelEstadistica> arrayLabel = hashMapLblStats.get(estad.getCategoria());
		int valorPersonaje;
		int valorEstadistica = estad.getValor();
		for (JLabelEstadistica lblStats : arrayLabel) {
			valorPersonaje = personaje.getHashMapJugadorStats().get(estad.getCategoria()).getValor();
			lblStats.setText(valorPersonaje + "  +  " + valorEstadistica);
			valorEstadistica = valorEstadistica / 2;
		}
	}
	
	private void setPersonajeEstads() {
		/*
		 * Este metodo setea las estads del personaje recorriendo el 
		 * hash de estadisticas para llamar el metodo
		 * */
		for (Estadistica estad : personaje.getHashMapJugadorStats().values()) {
			int valor = personaje.getHashMapJugadorStats().get(estad.getCategoria()).getValor();
			ArrayList<JLabelEstadistica> arrayLabel = hashMapLblStats.get(estad.getCategoria());
			for (JLabelEstadistica lblStats : arrayLabel) {
				lblStats.setText(String.valueOf(valor));
			}
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
