package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

import controlador.ControladorTienda;

import java.awt.Font;

public class vTienda {

	private JFrame frame;
	public JScrollPane 
			srcllPnArmas, 
			scrllPnArmadura,
			srcllPnInventario;
	public JButton 
			btnVender,
			btnComprar;
	
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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(501, 22, 380, 389);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(411, 22, 80, 135);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 400, 400);
		frame.getContentPane().add(tabbedPane);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnComprar.setBounds(0, 0, 80, 50);
		panel.add(btnComprar);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(0, 80, 80, 50);
		panel.add(btnVender);
		
		srcllPnArmas = new JScrollPane();
		tabbedPane.addTab("Armas", null, srcllPnArmas, null);
		
		scrllPnArmadura = new JScrollPane();
		tabbedPane.addTab("Armadura", null, scrllPnArmadura, null);
		
		srcllPnInventario = new JScrollPane();
		srcllPnInventario.setBounds(0, 0, 195, 389);
		panel_1.add(srcllPnInventario);
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
