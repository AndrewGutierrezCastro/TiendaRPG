package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComponentesUI {
	
	ComponentesUI(){}
	
	//DEVUELVE UN JLABEL
	public static JLabel getLabel(String s, int x, int y, int width, int height){
		JLabel a = new JLabel();
		a.setFont(new Font("Arial", Font.PLAIN, 12));
		a.setText(s);
		a.setBounds(x,y,width,height);
		return a;
	}
	
	//DEVUELVE UN JBUTTON
	public static JButton getButton(String s, int x, int y, int width, int height){
		JButton a = new JButton(s);
		a.setFont(new Font("Arial", Font.PLAIN, 11));
		a.setBounds(x,y,width,height);
		//a.setEnabled(false);
		return a;
	}
	
	//DEVUELVE UN JPANEL
	public static JPanel getPanel(Color s, int x, int y, int width, int height){
		JPanel a = new JPanel();
		a.setOpaque(true);
		a.setBackground(s);
		a.setBounds(x,y,width,height);
		a.setLayout(null);
		return a;
	}
	
	//DEVUELVE UN COMBOBOX
	public static JComboBox getComboBox(){
		JComboBox a = new JComboBox<>();
		return a;
	}

}
