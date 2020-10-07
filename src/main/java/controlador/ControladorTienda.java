package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.CreadorObjetos;
import modelo.Item;
import modelo.Personaje;
import modelo.Producto;
import modelo.Tipo;
import vista.vTienda;


public class ControladorTienda implements ActionListener, ListSelectionListener {
	
	private vTienda ventana;
	private Personaje personaje;
	private HashMap<String,HashMap<String,List<Item>>> inventario ;
	
	public ControladorTienda() {
		this.ventana = new vTienda(this);
		this.personaje = new Personaje();
		this.ventana.cargar();
		this.cargarInventario();
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
		if (categoria == "") {
			this.ventana.comboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>());
			this.ventana.comboBoxSeleccion.setEnabled(false);
			this.ventana.lblSeleccion.setText("Seleccione la ...");
			this.actualizarStatsPantalla(0,"",0);
			return;
		}
		
		this.ventana.comboBoxSeleccion.setEnabled(true);
		switch(categoria) {
		case "Armas":
			this.ventana.lblSeleccion.setText("Seleccione la arma:");
			this.ventana.comboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ESPADA", "HACHA", "ARCO", "BACULOMAGICO"}));
			break;
		case "Armaduras":
			this.ventana.lblSeleccion.setText("Seleccione la armadura:");
			this.ventana.comboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "CASCO", "ESCUDO", "PECHERA", "GUANTES", "PANTALONES"}));
			break;
		case "Pociones":
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
		
		List<Item> l = this.inventario.get(this.ventana.comboBoxCategoria.getSelectedItem().toString()).get(this.ventana.comboBoxSeleccion.getSelectedItem().toString());
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
			int index = this.ventana.listaCompras.getSelectedIndex();
			List<Item> l = this.inventario.get(this.ventana.comboBoxCategoria.getSelectedItem().toString()).get(this.ventana.comboBoxSeleccion.getSelectedItem().toString());
			Item item = l.get(index);
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
		String [] list = {"Armaduras","Armas","Pociones"};
		String [] list2 = {"CASCO","ESCUDO","PECHERA","GUANTES","PANTALONES","ESPADA","HACHA","ARCO","BACULOMAGICO","POCION"};
		int [] list3 = {5,9,10};//MODIFICAR CUANDO SE AGREGUE LA PARTE DE LAS POCIONES
		int cont = 0;
		
		for (int i = 0; i < 3; i++) {//VA A AGREGAR A TODOS LOS PRODUCTOS CUALESQUIERA AL HASMAP DE FORMA LOGICA
			
			HashMap<String,List<Item>> l2 = new HashMap<>(); 
			
			for (int w = cont; w < list3[i]; w++) {
				
				List<Producto> l = CreadorObjetos.getListProducts(list2[cont]);
				List<Item> listaItem = new ArrayList<>();
				
				for (int j = 0; j < l.size(); j++) {
					
					Item item = new Item((new Random()).nextInt(10) + 3, Tipo.valueOf(list2[cont]), l.get(j));
					listaItem.add(item);
					
				}
				
				l2.put(list2[cont], listaItem);
				cont++;
			}
			this.inventario.put(list[i], l2);
		}
			
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		
	/*
	 * FUNCION ENCARGADA DE RECIBIR LA SEÑAL POR PARTE DEL ITEM SELECCIONADO DEL JLIST
	 */
		
		boolean w = arg0.getValueIsAdjusting();
		if (w) {//Se realiza dado que se ejecuta el listener cuando se presiona el boton y cuando se suelta
			
			int index = this.ventana.listaCompras.getSelectedIndex();
			List<Item> l = this.inventario.get(this.ventana.comboBoxCategoria.getSelectedItem().toString()).get(this.ventana.comboBoxSeleccion.getSelectedItem().toString());
			Item item = l.get(index);
			this.actualizarStatsPantalla(1, item.getTipo().toString(), item.getEstadistica().getValor());
			
		}
	}
	
	private void actualizarStatsPantalla(int accion, String tipo, int valor) {
		
	/*
	 * FUNCION ENCARGADA DE MODIFICAR LAS ESTADISTICAS CUANDO SE SELECCIONA UN PRODUCTO
	 */
		if (accion == 0) {
			
			this.ventana.lblAtaque.setText("Ataque: "+this.personaje.getEstadisticas().getAtaque().getValor());
			this.ventana.lblDefensa.setText("Defensa: "+this.personaje.getEstadisticas().getDefensa().getValor());
			this.ventana.lblVelocidad.setText("Velocidad: "+this.personaje.getEstadisticas().getVelocidad().getValor());
			this.ventana.lblMagia.setText("Magia: "+this.personaje.getEstadisticas().getSuerte().getValor());
			this.ventana.lblVida.setText("Vida: "+this.personaje.getEstadisticas().getVida().getValor());
			
		}else {
			
			this.actualizarStatsPantalla(0, "", 0);
			switch (tipo) {
			case "CASCO":
				
				this.ventana.lblDefensa.setText("Defensa: "+this.personaje.getEstadisticas().getDefensa().getValor()+"  +  "+valor);
				this.ventana.lblVida.setText("Vida: "+this.personaje.getEstadisticas().getVida().getValor()+"  +  "+(int)(valor/2));
				
				break;
			case "ESCUDO":
				
				this.ventana.lblDefensa.setText("Defensa: "+this.personaje.getEstadisticas().getDefensa().getValor()+"  +  "+valor);
				this.ventana.lblAtaque.setText("Ataque: "+this.personaje.getEstadisticas().getAtaque().getValor()+"  +  "+(int)(valor/2));
				
				break;
			case "PECHERA":
				
				this.ventana.lblDefensa.setText("Defensa: "+this.personaje.getEstadisticas().getDefensa().getValor()+"  +  "+valor);
				this.ventana.lblVida.setText("Vida: "+this.personaje.getEstadisticas().getVida().getValor()+"  +  "+(int)(valor/2));
				
				break;
			case "GUANTES":
				
				this.ventana.lblMagia.setText("Magia: "+this.personaje.getEstadisticas().getSuerte().getValor()+"  +  "+valor);
				this.ventana.lblDefensa.setText("Defensa: "+this.personaje.getEstadisticas().getDefensa().getValor()+"  +  "+(int)(valor/2));
				
				break;
			case "PANTALONES":
				
				this.ventana.lblVelocidad.setText("Velocidad: "+this.personaje.getEstadisticas().getVelocidad().getValor()+"  +  "+valor);
				this.ventana.lblDefensa.setText("Defensa: "+this.personaje.getEstadisticas().getDefensa().getValor()+"  +  "+(int)(valor/2));
				
				break;
			case "ESPADA":
				
				this.ventana.lblAtaque.setText("Ataque: "+this.personaje.getEstadisticas().getAtaque().getValor()+"  +  "+valor);
				this.ventana.lblDefensa.setText("Defensa: "+this.personaje.getEstadisticas().getDefensa().getValor()+"  +  "+(int)(valor/2));
				
				break;
			case "HACHA":
				
				this.ventana.lblAtaque.setText("Ataque: "+this.personaje.getEstadisticas().getAtaque().getValor()+"  +  "+valor);
				this.ventana.lblDefensa.setText("Defensa: "+this.personaje.getEstadisticas().getDefensa().getValor()+"  +  "+(int)(valor/2));
				
				break;
			case "ARCO":
				
				this.ventana.lblAtaque.setText("Ataque: "+this.personaje.getEstadisticas().getAtaque().getValor()+"  +  "+valor);
				this.ventana.lblMagia.setText("Magia: "+this.personaje.getEstadisticas().getSuerte().getValor()+"  +  "+(int)(valor/2));
				
				break;
			case "BACULOMAGICO":
				
				this.ventana.lblAtaque.setText("Ataque: "+this.personaje.getEstadisticas().getAtaque().getValor()+"  +  "+(int)(valor/2));
				this.ventana.lblMagia.setText("Magia: "+this.personaje.getEstadisticas().getSuerte().getValor()+"  +  "+valor);
				
				break;
			case "POCION":
				
				this.ventana.lblVida.setText("Vida: "+this.personaje.getEstadisticas().getVida().getValor()+"  +  "+valor);
				this.ventana.lblMagia.setText("Magia: "+this.personaje.getEstadisticas().getSuerte().getValor()+"  +  "+(int)(valor/2));
				
				break;
			}
			
		}
	}
	
	

}
