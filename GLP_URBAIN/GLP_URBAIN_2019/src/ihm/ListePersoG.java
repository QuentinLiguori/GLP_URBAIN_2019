package ihm;

import javax.swing.JButton;
import javax.swing.JScrollPane;

public class ListePersoG {
	
	// Initialize Button and Panel //
	private JScrollPane personnages;
	private JButton selectbutton;
	
	public JScrollPane getPersonnages() {
		
		return personnages;
	}
	
	public JButton getSelectButton() {
		
		return selectbutton;
	}
	
	public ListePersoG() {
		
		personnages = new JScrollPane();
		selectbutton = new JButton("Selectionner");
	}

	


	
}
