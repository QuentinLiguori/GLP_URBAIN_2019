package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import perso.Personnage;
import world.World;

public class ListePersoG implements ActionListener{
	
	// Initialize Button and Panel //
	private JPanel personnages;
	private JButton selectbutton;
	private Personnage perso;
	private JTextArea text;
	
	public JPanel getPersonnages(){
		
		return personnages;
	}
	public ListePersoG() {
		
		personnages = new JPanel();
		World world = new World();
		Iterator<Personnage> it = world.getAllCitizens().iterator();
		while(it.hasNext()) {
			
			JButton perso1 = new JButton();
			perso1.setText(it.next().getPrenomNom());
			personnages.add(perso1);
			perso1.addActionListener(this);
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//if(e.getSource()==perso1) 
	}

	


	
}
