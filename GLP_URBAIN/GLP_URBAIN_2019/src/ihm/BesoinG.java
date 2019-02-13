package ihm;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import perso.Personnage;

public class BesoinG {
	
	private JPanel besoinPane;
	private JProgressBar energyBar;
	private JProgressBar entertainmentBar;
	private JProgressBar hungerBar;
	private JProgressBar socialBar;
	private BoxLayout box;
	private Personnage perso;
	
	public JPanel getBesoinPane() {
		
		return besoinPane;
	}
	
	public BesoinG() {
		
		perso = new Personnage("Moulin", "Gerard", "M", 22);
		// Initialization of the 4 bar to see the shape of the people //
		energyBar = new JProgressBar();
		energyBar.setMaximum(500);
		energyBar.setMinimum(0);
		energyBar.setStringPainted(true);
		energyBar.setValue(perso.getBesoin().getEnergie());
		
		entertainmentBar = new JProgressBar();
		entertainmentBar.setMaximum(500);
		entertainmentBar.setMinimum(0);
		entertainmentBar.setStringPainted(true);
		entertainmentBar.setValue(perso.getBesoin().getDivertissement());

		hungerBar = new JProgressBar();
		hungerBar.setMaximum(500);
		hungerBar.setMinimum(0);
		hungerBar.setStringPainted(true);
		hungerBar.setValue(perso.getBesoin().getFaim());

		socialBar = new JProgressBar();
		socialBar.setMaximum(500);
		socialBar.setMinimum(0);
		socialBar.setStringPainted(true);
		socialBar.setValue(perso.getBesoin().getSocial());

		besoinPane = new JPanel();
		besoinPane.add(energyBar);
		besoinPane.add(entertainmentBar);
		besoinPane.add(hungerBar);
		besoinPane.add(socialBar);
		
		box = new BoxLayout(besoinPane, 1);
		besoinPane.setLayout(box);
		
	}
	
	
}
