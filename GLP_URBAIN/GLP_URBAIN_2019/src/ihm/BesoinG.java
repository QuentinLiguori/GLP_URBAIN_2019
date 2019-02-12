package ihm;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class BesoinG {
	
	private JPanel besoinPane;
	private JProgressBar energyBar;
	private JProgressBar entertainmentBar;
	private JProgressBar hungerBar;
	private JProgressBar socialBar;
	private BoxLayout box;
	
	public JPanel getBesoinPane() {
		
		return besoinPane;
	}
	
	public BesoinG() {
		
		// Initialization of the 4 bar to see the shape of the people //
		energyBar = new JProgressBar();
		energyBar.setMaximum(500);
		energyBar.setMinimum(0);
		energyBar.setStringPainted(true);
		
		entertainmentBar = new JProgressBar();
		entertainmentBar.setMaximum(500);
		entertainmentBar.setMinimum(0);
		entertainmentBar.setStringPainted(true);
		
		hungerBar = new JProgressBar();
		hungerBar.setMaximum(500);
		hungerBar.setMinimum(0);
		hungerBar.setStringPainted(true);
		
		socialBar = new JProgressBar();
		socialBar.setMaximum(500);
		socialBar.setMinimum(0);
		socialBar.setStringPainted(true);
		
		besoinPane = new JPanel();
		besoinPane.add(energyBar);
		besoinPane.add(entertainmentBar);
		besoinPane.add(hungerBar);
		besoinPane.add(socialBar);
		
		box = new BoxLayout(besoinPane, 1);
		besoinPane.setLayout(box);
		
	}
}
