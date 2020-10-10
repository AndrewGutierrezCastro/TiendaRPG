package vista;

import javax.swing.JLabel;

import modelo.Categoria;
import modelo.NombreEstadistica;
import modelo.Tipo;

public class JLabelEstadistica extends JLabel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Categoria categoria;
	private NombreEstadistica nombreEstadistica;
	private String title;
	public JLabelEstadistica(Categoria categoria, NombreEstadistica nombreEstadistica, String title) {
		super();
		this.categoria = categoria;
		this.title = title;
		this.nombreEstadistica = nombreEstadistica;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public NombreEstadistica getNombreEstadistica() {
		return nombreEstadistica;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public void setText(String text) {
		super.setText(title + text);
	}
	
	
}
