package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import perso.Action;
import ville.PlanVille;
import world.World;

/**
 * @author Quentin Liguori
 *
 * MainWindow is the main class of our Graphic Interface 
 * 
 * it initialize the mainframe and the mainPanel of the game
 * 
 * During the game you can :
 * 		Select a character 
 * 		Assign him an action
 * 		Take care of the need of the character 
 * 		Follow the character and his evolution on the map
 */

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
	public static boolean gameStart;
	
	/**
	 * Constructor MainWindow
	 * <p> When an object is builded, initialize parameter and wait the action to be done</p>
	 * 
	 * @see Menu#getJouer()
	 * @see JButton#addActionListener()
	 * @see JPanel#add(java.awt.Component)
	 * @see JPanel#setLayout(java.awt.LayoutManager)
	 * @see JSplitPane#setDividerLocation(double)
	 * @see JSplitPane#setDividerSize(int)
	 * @see ActionG#getSelect()
	 * @see JFrame#setTitle(String)
	 * @see JFrame#setContentPane(java.awt.Container)
	 * @see JFrame#setSize(int, int)
	 * @see JFrame#setResizable(boolean)
	 * @see JFrame#setVisible(boolean)
	 * @see JFrame#setDefaultCloseOperation(int)
	 */
	
	public MainWindow() {
		
		// Initialization of the left panel //
		
		ville = new PlanVille();
		menu = new Menu();
		menu.getJouer().addActionListener(new Acceuil());
		act = new Action();
		persoCreation = new PersoCreation();
		persoCreation.getJouer().addActionListener(new Jouer());
		
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
		mainFrame.setContentPane(menu.getMenu()); 		
		mainFrame.setSize(1870,980);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	/**
	 * Return the mainPanel of the game
	 * @return mainPane
	 */
	public JSplitPane getMainPane() {
		
		return mainPane;
	}
	
	/**
	 * Return the Menu Panel of the game
	 * @return menuPane
	 */
	public JPanel getMenuPane() {
		return menuPane;
	}
	
	/**
	 * Set the Menu Panel
	 * @param menuPane
	 */
	public void setMenuPane(JPanel menuPane) {
		this.menuPane = menuPane;
	}
	
	/**
	 * Return the JFrame of the application
	 * @return mainFrame
	 */
	public static JFrame getMainFrame() {
		return mainFrame;
	}
	
	/**
	 * Set the Main Frame
	 * @param mainFrame
	 */
	public static void setMainFrame(JFrame mainFrame) {
		MainWindow.mainFrame = mainFrame;
	}
	
	/**
	 * Set content in the Frame and revalidate to pass to the next panel
	 * @see PersoCreation#getMain()
	 * @see JFrame#setContentPane(java.awt.Container)
	 * @see JFrame#revalidate()
	 */
	public void acceuil() {
		mainFrame.setContentPane(persoCreation.getMain());
		mainFrame.revalidate();
	}
	
	/**
	 * Set content in the Frame and revalidate to pass to the next panel
	 * @see JFrame#setContentPane(java.awt.Container)
	 * @see JFrame#revalidate()
	 */
	public void jouer() {
		mainFrame.setContentPane(mainPane);
		mainFrame.revalidate();
	}
	
	/**
	 * Start the clock as the game start
	 * @see TopBar#start()
	 * @see ListePersoG#start()
	 */
	public void run() {
		topBarpane.start();	
		personnages.start();		
	}

	/**
	 * Wait an action to be performed, react to the action
	 * @see ActionEvent#getSource()
	 * @see ActionG#getSelect()
	 * @see ActionG#getAction()
	 * @see JComboBox#getSelectedItem()
	 * @see Object#equals(Object)
	 * @see Action#deplacer(ville.BatimentCible, perso.Personnage)
	 * @see Action#manger(ville.BatimentCible, perso.Personnage)
	 * @see Action#dormir(ville.BatimentCible, perso.Personnage)
	 * @see Action#divertir(ville.BatimentCible, perso.Personnage)
	 * @see Action#social(ville.BatimentCible, perso.Personnage)
	 * @see PlanVille#searchBat(String)
	 * @see ActionG#getBatiment()
	 * @see Object#toString()
	 * @see PersoCreation#getWorld()
	 * @see World#searchCitizen(int)
	 * @see ListePersoG#getListPerso()
	 * @see JList#getSelectedIndex()
	 * @see PlanVille#searchByName(String)
	 * @see MapG#repaint()
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == action.getSelect()) {
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
			else if(action.getAction().getSelectedItem().equals("Se divertir")) {
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
	
	/**
	 * 
	 * @author Quentin Liguori
	 *
	 */
	public class Jouer implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see ListePersoG#loadJList(PersoCreation)
		 * @see MainWindow#jouer()
		 */
		public void actionPerformed(ActionEvent e) {
			gameStart = true;
			personnages.loadJList(persoCreation);
			MainWindow.this.jouer();
		}
		
	}
	/**
	 * 
	 * @author Quentin Liguori
	 *
	 */
	public class Acceuil implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			MainWindow.this.acceuil();			
		}		
	}	
}
