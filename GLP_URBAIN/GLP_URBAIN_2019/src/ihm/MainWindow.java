package ihm;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import org.omg.CORBA.INITIALIZE;

public class MainWindow {
	
	private JPanel leftPane;
	private JSplitPane topPane;
	private JSplitPane mainPane;
	private static JFrame mainFrame;
	private ActionG action;
	private ListePersoG personnages;
	private BesoinG besoin;
	private MapG map;
	private TopBar topBarpane;
	private BoxLayout boxLeftPane;
	private Menu menu;
	private JPanel menuPane;
	
	public MainWindow() {
		
		// Initialization of the left panel //
		menu = new Menu();
		menuPane = menu.getMenu();
		action = new ActionG();
		personnages = new ListePersoG();
		besoin = new BesoinG();
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

		topPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,topBarpane.getTopBarPane(),map.getMapPane());
		topPane.setDividerLocation(32);
		topPane.setDividerSize(0);
		
		// Initialization of the main panel //
		mainPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPane,topPane);
		mainPane.setDividerLocation(210);
		mainPane.setDividerSize(0);
		
		
	}
	
	public JSplitPane getMainPane() {
		
		return mainPane;
	}
	public static void initialize() {
		
		
	}
	public static void main(String[] args) {
		
		
		// Creation of the window //
		MainWindow window = new MainWindow();

		mainFrame = new JFrame();
		mainFrame.setTitle("Urbain");
		//mainFrame.add(window.getMenuPane());
		mainFrame.add(window.getMainPane());
		//_mainFrame.pack();
		mainFrame.setSize(1820,980);
		mainFrame.setResizable(true);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public JPanel getMenuPane() {
		return menuPane;
	}

	public void setMenuPane(JPanel menuPane) {
		this.menuPane = menuPane;
	}
}
