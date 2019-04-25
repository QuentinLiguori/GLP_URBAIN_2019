package ihm;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import perso.Action;
import perso.Personnage;
import ville.BatimentCible;
import ville.PlanVille;

/**
 * @author Quentin Liguori
 * 
 *	This class initialize the part of the graphic interface who manages the action of a character
 */

public class ActionG implements ActionListener {
	private JPanel actionPane;
	private JComboBox<String> batiment;
	private JComboBox<String> action;
	private GridLayout box;
	private PlanVille plan;
	public ListePersoG listPerso;
	private JButton select;
	
	/**
	 * 
	 * @return JPanel
	 */
	public JPanel getActionPane() {
		
		return actionPane;
	}
	
	/**
	 * Constructor of ActionG
	 * When a object is built, initialize The action part of the graphic interface
	 * 
	 * @see JComboBox#addItem(Object)
	 * @see JComboBox#setSize(int, int)
	 * @see JButton#setText(String)
	 * @see JComboBox#addActionListener(ActionListener)
	 * @see JPanel#add(java.awt.Component)
	 * @see JPanel#setLayout(java.awt.LayoutManager)
	 */
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
		
		action.setSize(100, 20);
		batiment.setSize(100, 20);
		
		select = new JButton();
		select.setText("Selectionner");
		
		
		action.addActionListener(this);
		batiment.addActionListener(this);
		
		actionPane.add(action);
		actionPane.add(batiment);
		actionPane.add(select);
		
		box = new GridLayout(8,1);
		actionPane.setLayout(box);
	}
	
	/**
	 * return The JButton Select
	 * @return select
	 */
	public JButton getSelect() {
		return select;
	}
	/**
	 * @param select
	 */
	public void setSelect(JButton select) {
		this.select = select;
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
	
	/**
	 * Wait an action to performed an appropriate answer, and adapt the graphic interface following the action
	 * 
	 * @see ActionEvent#getSource()
	 * @see JComboBox#getSelectedItem()
	 * @see Object#equals(Object)
	 * @see JComboBox#removeAllItems()
	 * @see PlanVille#getBatiments()
	 * @see ArrayList#size()
	 * @see ArrayList#get(int)
	 * @see BatimentCible#getFonction()
	 * @see BatimentCible#getNom()
	 * @see JComboBox#addItem(Object)
	 */
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == action) {
			String mot = (String)action.getSelectedItem();
			
			if(action.getSelectedItem().equals("Manger")) {
				batiment.removeAllItems();
				for(int i = 0; i < plan.getBatiments().size() ; i++) {
		            
					if(plan.getBatiments().get(i).getFonction().equals("Faim")) {						
						batiment.addItem(plan.getBatiments().get(i).getNom());
					}
		        }	
			}
			else if(action.getSelectedItem().equals("Se divertir")) {
				batiment.removeAllItems();
				for(int i = 0; i < plan.getBatiments().size() ; i++) {
		            
					if(plan.getBatiments().get(i).getFonction().equals("Divertissement")) {
						
						batiment.addItem(plan.getBatiments().get(i).getNom());
					}
		        }
			}
			else if(action.getSelectedItem().equals("Dormir")) {
				batiment.removeAllItems();
				for(int i = 0; i < plan.getBatiments().size() ; i++) {
		            
					if(plan.getBatiments().get(i).getFonction().equals("Energie")) {
						
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
