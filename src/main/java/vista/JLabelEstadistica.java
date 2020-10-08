package vista;

import javax.swing.JLabel;

import modelo.Categoria;
import modelo.Tipo;

public class JLabelEstadistica extends JLabel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Categoria categoria;
	private String title;
	public JLabelEstadistica(Categoria categoria, String title) {
		super();
		this.categoria = categoria;
		this.title = title;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public void setText(String text) {
		super.setText(title + text);
	}
	
	
}
