package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;

import controlador.ControladorTienda;

public class vTienda {

	private JFrame frame;
	
	public JScrollPane 
			scrllPnTienda,
			srcllPnInventario;
	
	public JTabbedPane
			tabbedPane;
	
	public JButton 
			btnVender,
			btnComprar;
	
	public JLabel
			lblAtaque,
			lblDefensa,
			lblVelocidad,
			lblVida,
			lblSuerte,
			lblGategoria,
			lblEstadisticas;
	
	public JPanel
			panelTienda,
			panelTienda2,
			panelInventario,
			panelInventario2,
			panelPersonaje;
	
	public JComboBox
			comboBoxSeleccion;
	
	public Image
			img_Fondo;
	
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
		
		//PROPIEDADES DE LAS IMAGENES
		this.img_Fondo = new ImageIcon(getClass().getResource("/Imagenes/Tienda_interior.png")).getImage();
		
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
		this.panelInventario = ComponentesUI.getPanel(Color.red,0, 0, 0, 0);
		
		this.panelTienda2 = ComponentesUI.getPanel(Color.green,10, 50, 275, 365);
		this.panelTienda.add(this.panelTienda2);
		
		this.panelPersonaje = ComponentesUI.getPanel(Color.cyan, 330, 30, 240, 460);
		this.frame.add(this.panelPersonaje);
		
		
		
		//PROPIEDADES DE LOS SCROLLPANE
		scrllPnTienda = new JScrollPane();
		tabbedPane.addTab("Tienda", null, this.panelTienda, null);
		
		srcllPnInventario = new JScrollPane();
		tabbedPane.addTab("Inventario", null, this.panelInventario, null);
		
		
		
		//PROPIEDADES DE LOS LABELS		
		this.lblGategoria = ComponentesUI.getLabel("Seleccione la Categoria: ",10,10,150,20);
		this.panelTienda.add(this.lblGategoria);
		
		this.lblEstadisticas = ComponentesUI.getLabel("   ESTADISTICAS DEL PERSONAJE",10,20,200,20);
		this.panelPersonaje.add(this.lblEstadisticas);
		
		this.lblAtaque = ComponentesUI.getLabel("Ataque: ",10,240,200,20);
		this.panelPersonaje.add(this.lblAtaque);

		this.lblDefensa = ComponentesUI.getLabel("Defensa: ",10,280,200,20);
		this.panelPersonaje.add(this.lblDefensa);
		
		this.lblVelocidad = ComponentesUI.getLabel("Velocidad: ",10,320,200,20);
		this.panelPersonaje.add(this.lblVelocidad);
		
		this.lblVida = ComponentesUI.getLabel("Vida: ",10,360,200,20);
		this.panelPersonaje.add(this.lblVida);
		
		this.lblSuerte = ComponentesUI.getLabel("Suerte: ",10,400,200,20);
		this.panelPersonaje.add(this.lblSuerte);
		
		
		
		//PROPIEDADES DE LOS BOTONES
		this.btnComprar = ComponentesUI.getButton("Comprar",10, 425, 80, 20);
		this.panelTienda.add(this.btnComprar);
		
		this.btnVender = ComponentesUI.getButton("Vender",100, 425, 80, 20);
		this.panelTienda.add(this.btnVender);
		
		

		//PROPIEDADES DE LOS COMBOBOX
		this.comboBoxSeleccion = new JComboBox <>();
		this.comboBoxSeleccion.setBounds(160, 10, 100, 20);
		this.comboBoxSeleccion.setFont(new Font("Arial", Font.PLAIN, 11));
		this.comboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armas", "Armaduras", "Pociones"}));
		this.panelTienda.add(this.comboBoxSeleccion);

		
		
		//INICIALIZACION DE LA PANTALLA
		frame.setVisible(true);
	}
	
	public void setActionListener() {
		btnComprar.addActionListener(controlador);
		btnVender.addActionListener(controlador);
	}
	private void setControlador(ControladorTienda pControlador) {
		this.controlador = pControlador;
	}
	private void setActionCommands() {
		btnVender.setActionCommand("VENDER");
		btnComprar.setActionCommand("COMPRAR");
	}
	
}

