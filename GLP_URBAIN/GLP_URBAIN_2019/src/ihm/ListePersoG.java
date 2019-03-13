package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import perso.Personnage;
import world.World;

public class ListePersoG extends Thread implements ActionListener{
	
	// Initialize Button and Panel //
	private JPanel personnages;
	private JButton persoButton[];
	private Personnage perso;
	private JPanel besoinPane;
	private JProgressBar energyBar;
	private JProgressBar entertainmentBar;
	private JProgressBar hungerBar;
	private JProgressBar socialBar;
	private BoxLayout box;
	private World world;
	private Iterator<Personnage> it;
	private JLabel energie;
	private JLabel divertissement;
	private JLabel faim;
	private JLabel social;
	 public static final int CHRONO_SPEED = 1000;
	 public boolean stop = false;
	
	public JPanel getBesoinPane() {
		
		return besoinPane;
	}
	
	public JPanel getPersonnages(){
		
		return personnages;
	}
	public ListePersoG() {
		
		personnages = new JPanel();
		world = new World();
		persoButton = new JButton[world.getAllCitizens().size()];
		
		for(int i = 0; i < world.getAllCitizens().size() ; i++) {
            
			persoButton[i] = new JButton();
            persoButton[i].setText(world.getAllCitizens().get(i).getPrenomNom());
            personnages.add(persoButton[i]);
            persoButton[i].addActionListener(this);
        }
		
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
	
	public void updateBesoin(Personnage perso) {
		
		energyBar.setValue(perso.getBesoin().getEnergie());
		entertainmentBar.setValue(perso.getBesoin().getDivertissement());
		hungerBar.setValue(perso.getBesoin().getFaim());
		socialBar.setValue(perso.getBesoin().getSocial());
		besoinPane.removeAll();
		besoinPane.add(energyBar);
		besoinPane.add(entertainmentBar);
		besoinPane.add(hungerBar);
		besoinPane.add(socialBar);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == persoButton[0]) {
			
			updateBesoin(world.getAllCitizens().get(0));
		}
		if(e.getSource() == persoButton[1]) {
			
			updateBesoin(world.getAllCitizens().get(1));
		}
		if(e.getSource() == persoButton[2]) {
			
			updateBesoin(world.getAllCitizens().get(2));
		}
	}
	public void lastSelected() {
		
		
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
            	for(int i = 0; i < world.getAllCitizens().size() ; i++) {
                    world.getAllCitizens().get(i).getBesoin().updateBesoin(temps);
//                    updateBesoin(world.getAllCitizens().get(i));
                }
            	temps++;
            	if(temps > 5) {
        			temps = 0;
        		}
            }
        }
    }	
}
