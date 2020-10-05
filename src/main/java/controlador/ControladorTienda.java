package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import modelo.CreadorObjetos;
import modelo.Personaje;
import modelo.Producto;
import vista.vTienda;


public class ControladorTienda implements ActionListener{
	
	private vTienda ventana;
	private Personaje personaje;
	private HashMap<String,HashMap<String,List<Producto>>> inventario ;
	
	public ControladorTienda() {
		ventana = new vTienda(this);
		ventana.cargar();
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
			this.ventana.comboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Armas", "Armaduras", "Pociones"}));
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
		
		List<Producto> l = this.inventario.get(this.ventana.comboBoxCategoria.getSelectedItem().toString()).get(this.ventana.comboBoxSeleccion.getSelectedItem().toString());
		for (Producto producto : l) {
			modelo.addElement(contador+"/ "+producto.getTitle()+", PRICE: "+producto.getPrice()); 
			contador++;
		}
	}
	
	private void comprarObjeto() {
		/*
		 * FUNCION ENCARGADA DE COMPRAR EL ARTICULO
		 */
		
		if (!this.ventana.listaCompras.isSelectionEmpty()) {
			int index = this.ventana.listaCompras.getSelectedIndex();
			List<Producto> l = this.inventario.get(this.ventana.comboBoxCategoria.getSelectedItem().toString()).get(this.ventana.comboBoxSeleccion.getSelectedItem().toString());
			Producto producto = l.get(index);
			System.out.println(producto.getTitle());

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
		String [] list2 = {"CASCO","ESCUDO","PECHERA","GUANTES","PANTALONES","ESPADA","HACHA","ARCO","BACULOMAGICO"};
		int [] list3 = {5,9};//MODIFICAR CUANDO SE AGREGUE LA PARTE DE LAS POCIONES
		int cont = 0;
		
		for (int i = 0; i < 2; i++) {//VA A AGREGAR A TODOS LOS PRODUCTOS CUALESQUIERA AL HASMAP DE FORMA LOGICA
			
			HashMap<String,List<Producto>> l2 = new HashMap<>(); 
			for (int w = cont; w < list3[i]; w++) {
				List<Producto> l = CreadorObjetos.getListProducts(list2[cont]);
				l2.put(list2[cont], l);
				cont++;
			}
			this.inventario.put(list[i], l2);
		}
			
	}
	
	

}
