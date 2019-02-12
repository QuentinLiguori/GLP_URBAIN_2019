package ihm;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopBar {
	
	private JPanel topBarPane;
	private JLabel label;
	
	public JPanel getTopBarPane() {
		
		return topBarPane;
	}
	public TopBar() {
		
		label = new JLabel("Heure et Date");
		topBarPane = new JPanel();
		topBarPane.add(label);
		
	}
}
