package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import perso.Action;
import ville.PlanVille;

public class MainWindow implements Runnable, ActionListener{
	
	private JPanel leftPane;
	private JSplitPane topPane;
	private JSplitPane mainPane;
	private static JFrame mainFrame;
	private ActionG action;
	private ListePersoG personnages;
	private MapG map;
	private TopBar topBarpane;
	private BoxLayout boxLeftPane;
	private Menu menu;
	private JPanel menuPane;
	public static PersoCreation persoCreation;
	private Action act;
	private PlanVille ville;
	private boolean endGame = false;
	
	public MainWindow() {
		
		// Initialization of the left panel //
		ville = new PlanVille();
		menu = new Menu();
		act = new Action();
		persoCreation = new PersoCreation();
		
		action = new ActionG();
		personnages = new ListePersoG();
		leftPane = new JPanel();
		
		// Ajout des Panels //
		leftPane.add(action.getActionPane());
		leftPane.add(personnages.getBesoinPane());
		leftPane.add(personnages.getPersonnages());
		
		boxLeftPane = new BoxLayout(leftPane,1);
		leftPane.setLayout(boxLeftPane);
		
		// Initialization of the top panel //
		map = new MapG();
		topBarpane = new TopBar();

		topPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,topBarpane.getTopBarPane(),map);
		topPane.setDividerLocation(32);
		topPane.setDividerSize(0);
		
		action.getSelect().addActionListener(this);
		menu.getJouer().addActionListener(this);
		// Initialization of the main panel //
		mainPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPane,topPane);
		mainPane.setDividerLocation(250);
		mainPane.setDividerSize(0);
		
		mainFrame = new JFrame();
		mainFrame.setTitle("Urbain");
		mainFrame.add(mainPane); //ligne à changer pour afficher tout le main window
		
		mainFrame.setSize(1870,980);
		//mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public JSplitPane getMainPane() {
		
		return mainPane;
	}
	public static void initialize() {
		
		
	}
	public JPanel getMenuPane() {
		return menuPane;
	}

	public void setMenuPane(JPanel menuPane) {
		this.menuPane = menuPane;
	}
	public void run() {
		topBarpane.start();	
		personnages.start();
//		while(!endGame) {
//			map.repaint();
//		}
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menu.getJouer()) {
		}
		else if(e.getSource() == action.getSelect()) {
			if(action.getAction().getSelectedItem().equals("Manger")) {
				act.deplacer(ville.searchBat(action.getBatiment().getSelectedItem().toString()), persoCreation.getWorld().searchCitizen(personnages.getListPerso().getSelectedIndex()));
				act.manger(ville.searchByName(action.getBatiment().getSelectedItem().toString()), persoCreation.getWorld().searchCitizen(personnages.getListPerso().getSelectedIndex()));
				map.repaint();
			}
			else if(action.getAction().getSelectedItem().equals("Dormir")) {
				act.deplacer(ville.searchBat(action.getBatiment().getSelectedItem().toString()), persoCreation.getWorld().searchCitizen(personnages.getListPerso().getSelectedIndex()));
				act.dormir(ville.searchByName(action.getBatiment().getSelectedItem().toString()), persoCreation.getWorld().searchCitizen(personnages.getListPerso().getSelectedIndex()));
				map.repaint();
			}
			else if(action.getAction().getSelectedItem().equals("Se dirvertir")) {
				act.deplacer(ville.searchBat(action.getBatiment().getSelectedItem().toString()), persoCreation.getWorld().searchCitizen(personnages.getListPerso().getSelectedIndex()));
				act.divertir(ville.searchByName(action.getBatiment().getSelectedItem().toString()), persoCreation.getWorld().searchCitizen(personnages.getListPerso().getSelectedIndex()));
				map.repaint();
			}
			else if(action.getAction().getSelectedItem().equals("Social")) {
				act.deplacer(ville.searchBat(action.getBatiment().getSelectedItem().toString()), persoCreation.getWorld().searchCitizen(personnages.getListPerso().getSelectedIndex()));
				act.social(ville.searchByName(action.getBatiment().getSelectedItem().toString()), persoCreation.getWorld().searchCitizen(personnages.getListPerso().getSelectedIndex()));
				map.repaint();
			}
		}
	}
	
}

