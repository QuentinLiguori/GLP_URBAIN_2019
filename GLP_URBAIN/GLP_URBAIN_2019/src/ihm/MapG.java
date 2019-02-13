package ihm;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MapG {
	
	private JPanel mapPane;
	
	public JPanel getMapPane() {
		
		return mapPane;
	}
	
	public MapG() {
		
		mapPane = new JPanel();
		mapPane.setBackground(Color.BLACK);
		
	}
}
