package ihm;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

import perso.Personnage;


public class ListePersoG extends Thread implements ActionListener{
	
	// Initialize Button and Panel //
	
	private JPanel personnages;
	private JButton selectButton;
	private Personnage perso;
	private JPanel besoinPane;
	private JProgressBar energyBar;
	private JProgressBar entertainmentBar;
	private JProgressBar hungerBar;
	private JProgressBar socialBar;
	private BoxLayout box;
	private PersoCreation persoCrea;
	private Iterator<Personnage> it;
	private JLabel energie;
	private JLabel divertissement;
	private JLabel faim;
	private JLabel social;
	private DefaultListModel<String> listModel;
	private JList<String> listPerso;
	private JScrollPane listScroller;
	private int index;
	public boolean stop = false;
	
	public JPanel getBesoinPane() {
		
		return besoinPane;
	}
	
	public JPanel getPersonnages(){
		
		return personnages;
	}
	public ListePersoG() {
		
		persoCrea = new PersoCreation();
		index = -1;
		personnages = new JPanel();
		
		selectButton = new JButton("Selectionner");
		selectButton.addActionListener(this);
		
		
		
		
		
		
		energyBar = new JProgressBar();
		energyBar.setSize(200, 100);
		energyBar.setMaximum(500);
		energyBar.setMinimum(0);
		energyBar.setStringPainted(true);
		energyBar.setValue(100);
		
		entertainmentBar = new JProgressBar();
		entertainmentBar.setMaximum(500);
		entertainmentBar.setMinimum(0);
		entertainmentBar.setStringPainted(true);
		entertainmentBar.setValue(100);

		hungerBar = new JProgressBar();
		hungerBar.setMaximum(500);
		hungerBar.setMinimum(0);
		hungerBar.setStringPainted(true);
		hungerBar.setValue(100);

		socialBar = new JProgressBar();
		socialBar.setMaximum(500);
		socialBar.setMinimum(0);
		socialBar.setStringPainted(true);
		socialBar.setValue(100);

		besoinPane = new JPanel();
		
		energie = new JLabel("Energie");
		divertissement = new JLabel("Divertissement");
		faim = new JLabel("Faim");
		social = new JLabel("Social");
		
		besoinPane.add(energie);
		besoinPane.add(energyBar);
		besoinPane.add(divertissement);
		besoinPane.add(entertainmentBar);
		besoinPane.add(faim);
		besoinPane.add(hungerBar);
		besoinPane.add(social);
		besoinPane.add(socialBar);
		
		box = new BoxLayout(besoinPane, 1);
		besoinPane.setLayout(box);
	}
	
	public DefaultListModel<String> getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel<String> listModel) {
		this.listModel = listModel;
	}

	public JScrollPane getListScroller() {
		return listScroller;
	}

	public void setListScroller(JScrollPane listScroller) {
		this.listScroller = listScroller;
	}

	public JList<String> getListPerso() {
		return listPerso;
	}

	public void setListPerso(JList<String> listPerso) {
		this.listPerso = listPerso;
	}

	public void updateBesoin(Personnage perso) {
		//System.out.println(perso.getPositionX());
		//System.out.println(perso.getPositionY());
		energyBar.setValue(perso.getBesoin().getEnergie());
		entertainmentBar.setValue(perso.getBesoin().getDivertissement());
		hungerBar.setValue(perso.getBesoin().getFaim());
		socialBar.setValue(perso.getBesoin().getSocial());
		besoinPane.removeAll();
		besoinPane.add(energie);
		besoinPane.add(energyBar);
		besoinPane.add(divertissement);
		besoinPane.add(entertainmentBar);
		besoinPane.add(faim);
		besoinPane.add(hungerBar);
		besoinPane.add(social);
		besoinPane.add(socialBar);
	}
	
	public void loadJList(PersoCreation creation) {
		
		persoCrea = creation;
		
		listModel = new DefaultListModel<String>();
		//System.out.println(persoCrea.getWorld().getAllCitizens());
		for(int i = 0; i < persoCrea.getWorld().getAllCitizens().size() ; i++) {
            
			listModel.addElement(persoCrea.getWorld().getAllCitizens().get(i).getPrenomNom());
        }
		
		System.out.println(persoCrea.getWorld().getAllCitizens());
		
		listPerso = new JList<String>(listModel);
		listPerso.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listPerso.setLayoutOrientation(JList.VERTICAL);
		
		
		listScroller = new JScrollPane(listPerso);
		listScroller.setPreferredSize(new Dimension(250, 250));
		
		personnages.add(listScroller);
		personnages.add(selectButton);
	}

	public void actionPerformed(ActionEvent e) {
		
		index = listPerso.getSelectedIndex();
		if(e.getSource() == selectButton) {
			System.out.println(persoCrea.getWorld().getAllCitizens());
			updateBesoin(persoCrea.getWorld().getAllCitizens().get(index));
		}
	}
	public Personnage lastSelected() {
//		index = listPerso.getSelectedIndex();
//		perso = persoCrea.getWorld().getAllCitizens().get(index);
//		listScroller.getSelectedValue();
		return perso;
	}
	public void run() {
		int temps = 0;
        while (!stop) {
            try {
                Thread.sleep(SimuPara.SIMULATION_SPEED);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if(!stop) {  
            	
            	for(int i = 0; i < persoCrea.getWorld().getAllCitizens().size() ; i++) {
            		persoCrea.getWorld().getAllCitizens().get(i).getBesoin().updateBesoin(temps);
            	}
            	if (index != -1) {
            		updateBesoin(persoCrea.getWorld().getAllCitizens().get(index));
            	}
            	temps++;
            	if(temps > 5) {
        			temps = 0;
        		}
            }
        }
    }	
}
