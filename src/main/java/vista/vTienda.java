package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;

import controlador.ControladorTienda;
import modelo.Categoria;
import modelo.NombreEstadistica;

public class vTienda {

	private JFrame frame;
	
	public JList<String>
			listaInventario,
			listaCompras;
	
	public JScrollPane 
			scrllPnTienda,
			srcllPnInventario;
	
	public JTabbedPane
			tabbedPane;
	
	public JButton 
			btnEquipar,
			btnVender,
			btnComprar;
	
	public JLabel
			lblDinero,
			lblGategoria,
			lblSeleccion,
			lblImagen,
			lblInventario,
			lblEstadisticas;
	
	public JLabelEstadistica 
			lblAtaque,
			lblDefensa,
			lblVelocidad,
			lblVida,
			lblMagia;
	
	public JPanel
			panelTienda,
			panelTienda2,
			panelInventario,
			panelInventario2,
			panelPersonaje;
	
	public JComboBox
			comboBoxCategoria,
			comboBoxSeleccion;
	
	private ControladorTienda controlador;
	/**
	 * Create the application.
	 */
	public vTienda(ControladorTienda pControlador) {
		controlador = pControlador;
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void cargar() {
		initialize();
		setActionCommands();
		setActionListener();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		
		
		//PROPIEDADES DEL FRAME
		this.frame = new JFrame();
		this.frame.setBounds(100, 100, 600, 550);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setLayout(null);
		this.frame.setLocationRelativeTo(null);
		this.frame.setTitle("Tienda RPG");
		this.frame.setResizable(false);
		
		
		//PROPIEDADES DEL JTABBEDPANE
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(15, 10, 300, 480);
		frame.getContentPane().add(tabbedPane);
		
		
		
		//PROPIEDADES DE LOS PANELES
		this.panelTienda = ComponentesUI.getPanel(null,0, 0, 0, 0);
		this.panelInventario = ComponentesUI.getPanel(Color.gray,0, 0, 0, 0);
		
		this.panelTienda2 = ComponentesUI.getPanel(Color.green,10, 85, 275, 330);
		this.panelTienda.add(this.panelTienda2);
		
		this.panelInventario2 = ComponentesUI.getPanel(Color.green, 10, 50, 275, 365);
		this.panelInventario.add(this.panelInventario2);
		
		this.panelPersonaje = ComponentesUI.getPanel(Color.cyan, 330, 30, 240, 460);
		this.frame.add(this.panelPersonaje);
		
		
		
		//PROPIEDADES DE LOS TABBED PANE
		tabbedPane.addTab("Tienda", null, this.panelTienda, null);
		
		tabbedPane.addTab("Inventario", null, this.panelInventario, null);
		
		
		
		//PROPIEDADES DE LOS LABELS	
		this.lblDinero = ComponentesUI.getLabel("Dinero: "+modelo.DatosEstadisticas.dinero, 328, 10, 100, 20);
		this.frame.add(this.lblDinero);
		
		this.lblInventario = ComponentesUI.getLabel("INVENTARIO DEL PERSONAJE", 60, 20, 200, 20);
		this.panelInventario.add(this.lblInventario);
		
		this.lblImagen = ComponentesUI.getLabel("", 20, 60, 200, 150);
		this.panelPersonaje.add(lblImagen);
		
		this.lblGategoria = ComponentesUI.getLabel("Seleccione la Categoria: ",10,10,150,20);
		this.panelTienda.add(this.lblGategoria);
		
		this.lblSeleccion = ComponentesUI.getLabel("Seleccione la ...", 10, 50, 150, 20);
		this.panelTienda.add(this.lblSeleccion);
		
		this.lblEstadisticas = ComponentesUI.getLabel("   ESTADISTICAS DEL PERSONAJE",20,20,200,20);
		this.panelPersonaje.add(this.lblEstadisticas);
		
		this.lblAtaque = ComponentesUI.
					getLabel("Ataque: ",
							String.valueOf(modelo.DatosEstadisticas.ataque),
							modelo.DatosEstadisticas.cAtaque,
							NombreEstadistica.ATAQUE,
							10,240,200,20);
		this.panelPersonaje.add(this.lblAtaque);

		this.lblDefensa = ComponentesUI.
					getLabel("Defensa: ",
							String.valueOf(modelo.DatosEstadisticas.defensa),
							modelo.DatosEstadisticas.cDefensa,
							NombreEstadistica.DEFENSA,
							10,280,200,20);
		this.panelPersonaje.add(this.lblDefensa);
		
		this.lblVelocidad = ComponentesUI.
					getLabel("Velocidad: ",
							String.valueOf(modelo.DatosEstadisticas.velocidad),
							modelo.DatosEstadisticas.cVelocidad,
							NombreEstadistica.VELOCIDAD,
							10,320,200,20);
		this.panelPersonaje.add(this.lblVelocidad);
		
		this.lblVida = ComponentesUI.
					getLabel("Vida: ",
							String.valueOf(modelo.DatosEstadisticas.vida),
							modelo.DatosEstadisticas.cVida,
							NombreEstadistica.VIDA,
							10,360,200,20);
		this.panelPersonaje.add(this.lblVida);
		
		this.lblMagia = ComponentesUI.
					getLabel("Magia: ",
							String.valueOf(modelo.DatosEstadisticas.magia),
							modelo.DatosEstadisticas.cMagia,
							NombreEstadistica.MAGIA,
							10,400,200,20);
		this.panelPersonaje.add(this.lblMagia);
		
		
		
		//PROPIEDADES DE LOS BOTONES
		this.btnComprar = ComponentesUI.getButton("Comprar",10, 425, 275, 20);
		this.panelTienda.add(this.btnComprar);
		
		this.btnEquipar = ComponentesUI.getButton("Equipar",10, 425, 135, 20);
		this.panelInventario.add(this.btnEquipar);
		
		this.btnVender = ComponentesUI.getButton("Vender",150, 425, 135, 20);
		this.panelInventario.add(this.btnVender);
		
		

		//PROPIEDADES DE LOS COMBOBOX
		this.comboBoxCategoria = new JComboBox <>();
		this.comboBoxCategoria.setBounds(160, 10, 125, 20);
		this.comboBoxCategoria.setFont(new Font("Arial", Font.PLAIN, 11));
		this.comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(Categoria.values()));
		this.panelTienda.add(this.comboBoxCategoria);
		
		this.comboBoxSeleccion = new JComboBox <>();
		this.comboBoxSeleccion.setBounds(160, 50, 125, 20);
		this.comboBoxSeleccion.setFont(new Font("Arial", Font.PLAIN, 11));
		this.comboBoxSeleccion.setEnabled(false);
		this.panelTienda.add(this.comboBoxSeleccion);

		//PROPIEDADES DE LOS JLIST
		this.listaCompras = new JList<>();
		this.panelTienda2.add(this.listaCompras);
		
		this.listaInventario = new JList<>();
		this.panelInventario2.add(this.listaInventario);
		
		//PROPIEDADES DEL SCROLLPANE
		this.scrllPnTienda = new JScrollPane(this.listaCompras);
		this.scrllPnTienda.setBounds(0, 0, 275, 330);
		this.panelTienda2.add(this.scrllPnTienda);
		
		this.srcllPnInventario = new JScrollPane(this.listaInventario);
		this.srcllPnInventario.setBounds(0, 0, 275, 365);
		this.panelInventario2.add(this.srcllPnInventario);
				
		
		
		//INICIALIZACION DE LA PANTALLA
		frame.setVisible(true);
	}
	
	public void setActionListener() {
		
		//BOTONES
		this.btnComprar.addActionListener(controlador);
		this.btnVender.addActionListener(controlador);
		this.btnEquipar.addActionListener(controlador);
		
		//COMBOBOX
		this.comboBoxCategoria.addActionListener(controlador);
		this.comboBoxSeleccion.addActionListener(controlador);
		
		//JLIST
		this.listaCompras.addListSelectionListener(controlador);
		this.listaInventario.addListSelectionListener(controlador);
		
	}
	
	private void setControlador(ControladorTienda pControlador) {
		this.controlador = pControlador;
	}
	
	private void setActionCommands() {
		
		//BOTONES
		this.btnVender.setActionCommand("VENDER");
		this.btnComprar.setActionCommand("COMPRAR");
		this.btnEquipar.setActionCommand("EQUIPAR");
		
		//COMBOBOX
		this.comboBoxCategoria.setActionCommand("CATEGORIA");
		this.comboBoxSeleccion.setActionCommand("SELECCION");
		
	}
	
	public List<JLabelEstadistica> getJlblEstadisticas(){
		return Arrays.asList(
				lblAtaque,
				lblDefensa,
				lblVelocidad,
				lblVida,
				lblMagia);
	}
}

