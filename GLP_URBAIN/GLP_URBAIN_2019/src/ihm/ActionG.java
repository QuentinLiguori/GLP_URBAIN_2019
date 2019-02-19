package ihm;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JButton;
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
				for(int i = 0; i < plan.getBatiments().size() ; i++) {
		            
					if(plan.getBatiments().get(i).getFonction().equals("Manger")) {
						
						batiment.addItem(plan.getBatiments().get(i).getNom());
					}
		        }	
			}
			else if(action.getSelectedItem().equals("Se divertir")) {
				batiment.removeAllItems();
				for(int i = 0; i < plan.getBatiments().size() ; i++) {
		            
					if(plan.getBatiments().get(i).getFonction().equals("Detente")) {
						
						batiment.addItem(plan.getBatiments().get(i).getNom());
					}
		        }
			}
			else if(action.getSelectedItem().equals("Dormir")) {
				batiment.removeAllItems();
				for(int i = 0; i < plan.getBatiments().size() ; i++) {
		            
					if(plan.getBatiments().get(i).getFonction().equals("Habitation")) {
						
						batiment.addItem(plan.getBatiments().get(i).getNom());
					}
		        }
			}
			else if(action.getSelectedItem().equals("Social")) {
				batiment.removeAllItems();
				for(int i = 0; i < plan.getBatiments().size() ; i++) {
		            
					if(plan.getBatiments().get(i).getFonction().equals("Social")) {
						
						batiment.addItem(plan.getBatiments().get(i).getNom());
					}
		        }
			}
		}
	}
}
