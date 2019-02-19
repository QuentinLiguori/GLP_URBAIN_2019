package ihm;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import ville.BatimentCible;
import ville.PlanVille;

public class ActionG implements ActionListener {
	private JPanel actionPane;
	private JComboBox<String> batiment;
	private JComboBox<String> action;
	private GridLayout box;
	private PlanVille plan;
	public JPanel getActionPane() {
		
		return actionPane;
	}
	public ActionG() {
		
		actionPane = new JPanel();
		
		plan = new PlanVille();
		batiment = new JComboBox<String>();
		batiment.addItem("Liste de batiment");
		
		action = new JComboBox<String>();
		action.addItem("Manger");
		action.addItem("Dormir");
		action.addItem("Se divertir");
		action.addItem("Social");
		
		action.setSize(200, 20);
		batiment.setSize(200, 20);

		
		action.addActionListener(this);
		batiment.addActionListener(this);
		
		actionPane.add(action);
		actionPane.add(batiment);

		
		box = new GridLayout(8,1);
		actionPane.setLayout(box);
	}
	
	public JComboBox<String> getBatiment() {
		return batiment;
	}
	public void setBatiment(JComboBox<String> batiment) {
		this.batiment = batiment;
	}
	public JComboBox<String> getAction() {
		return action;
	}
	public void setAction(JComboBox<String> action) {
		this.action = action;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == action) {

			if(action.getSelectedItem().equals("Manger")) {
				batiment.removeAllItems();
				Set cles = plan.getBatiments().keySet();
				Iterator it = cles.iterator();
				while (it.hasNext()){
				   Object cle = it.next(); // tu peux typer plus finement ici
				   BatimentCible valeur = plan.getBatiments().get(cle);
				   batiment.addItem(valeur.getNom());
				}
				
			}
			else if(action.getSelectedItem().equals("Se divertir")) {
				batiment.removeAllItems();

			}
			else if(action.getSelectedItem().equals("Dormir")) {
				batiment.removeAllItems();

			}
			else if(action.getSelectedItem().equals("Social")) {
				batiment.removeAllItems();

			}
		}
	}
}
