package vista;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Helpers {

	public static Icon getImagen(BufferedImage imagen, int ancho, int alto) {
			
			ImageIcon iconoImagen = null;
			Image IconReescalada = null;

			iconoImagen = new ImageIcon(imagen);
			IconReescalada = iconoImagen.getImage();
			Image newimg = IconReescalada.getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
			iconoImagen = new ImageIcon(newimg);
			return iconoImagen;
		}
}
