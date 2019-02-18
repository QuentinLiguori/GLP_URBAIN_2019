package ihm;

import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import perso.Personnage;
import world.World;

public class ListePersoG {
	
	// Initialize Button and Panel //
	private JComboBox<String> personnages;
	private JButton selectbutton;
	private JLabel perso1;
	private Personnage perso;
	private JTextArea text;
	
	public JComboBox<String> getPersonnages(){
		
		return personnages;
	}
	public ListePersoG() {
		
		personnages = new JComboBox<>();
		World world = new World();
		Iterator<Personnage> it = world.getAllCitizens().iterator();
		
		while(it.hasNext()) {
			
			personnages.addItem(it.next().getNom());
		}
		
		
	}

	


	
}
