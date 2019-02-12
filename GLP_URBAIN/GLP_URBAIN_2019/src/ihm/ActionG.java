package ihm;


import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ActionG {
	private JPanel actionPane;
	private JComboBox<String> batiment;
	private JComboBox<String> action;
	private BoxLayout box;
	
	public JPanel getActionPane() {
		
		return actionPane;
	}
	public ActionG() {
		
		actionPane = new JPanel();
		batiment = new JComboBox<String>();
		batiment.addItem("Liste de batiment");
		
		action = new JComboBox<String>();
		action.addItem("Liste d'actions");
		
		actionPane.add(batiment);
		actionPane.add(action);
		
		box = new BoxLayout(actionPane, 1);
		actionPane.setLayout(box);
	}
}
