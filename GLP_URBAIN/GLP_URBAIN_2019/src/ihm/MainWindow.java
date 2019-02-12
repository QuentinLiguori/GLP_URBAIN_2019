package ihm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

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
	public MainWindow() {
		
		// Initialization of the left panel //
		action = new ActionG();
		personnages = new ListePersoG();
		besoin = new BesoinG();
		leftPane = new JPanel();
		leftPane.add(action.getActionPane());
		leftPane.add(personnages.getPersonnages());
		leftPane.add(personnages.getSelectButton());
		leftPane.add(besoin.getBesoinPane());
		
		// Initialization of the top panel //
		map = new MapG();
		topBarpane = new TopBar();

		topPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,topBarpane.getTopBarPane(),map.getMapPane());
		topPane.setDividerLocation(100);
		topPane.setDividerSize(0);
		
		// Initialization of the top panel //
		mainPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPane,topPane);
		mainPane.setDividerLocation(210);
		mainPane.setDividerSize(0);
	}
	
	public JSplitPane getMainPane() {
		
		return mainPane;
	}
	public static void main(String[] args) {
		
		MainWindow window = new MainWindow();
		
		// Creation of the window //
		mainFrame = new JFrame();
		mainFrame.setTitle("Urbain");
		mainFrame.setLocationRelativeTo(null);
		mainFrame.add(window.getMainPane());
		mainFrame.setSize(1000,500);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
