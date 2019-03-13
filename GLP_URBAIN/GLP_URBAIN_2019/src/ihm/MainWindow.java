package ihm;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class MainWindow implements Runnable{
	
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
	
	public MainWindow() {
		
		// Initialization of the left panel //
		menu = new Menu();
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
		
		// Initialization of the main panel //
		mainPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPane,topPane);
		mainPane.setDividerLocation(250);
		mainPane.setDividerSize(0);
		
		mainFrame = new JFrame();
		mainFrame.setTitle("Urbain");
		mainFrame.add(getMainPane());
		mainFrame.setSize(1870,980);
		mainFrame.setResizable(false);
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
	}
	
}

