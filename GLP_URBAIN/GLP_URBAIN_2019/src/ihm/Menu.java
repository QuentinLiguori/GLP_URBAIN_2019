package ihm;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Quentin Liguori
 * 
 * Initialize the Menu of the graphic interface
 */
public class Menu extends JPanel implements ActionListener, Runnable{
	
	private JButton jouer;
	private JButton quitter;
	private JPanel menu;
	
	/**
	 * Constructor of Menu initialize the menu of the graphic interface
	 * @see JButton#setText(String)
	 * @see JButton#addActionListener(ActionListener)
	 * @see JPanel#setLayout(java.awt.LayoutManager)
	 * @see JButton#setPreferredSize(Dimension)
	 * @see JPanel#add(java.awt.Component)
	 */
	public Menu() {
		
		menu = new JPanel();
		jouer = new JButton();
		jouer.setText("Jouer");
		jouer.addActionListener(this);
		
		quitter = new JButton();
		quitter.setText("Quitter");
		quitter.addActionListener(this);
		
		menu.setLayout(new FlowLayout(FlowLayout.CENTER,100,400));
		jouer.setPreferredSize(new Dimension(150, 73));
		quitter.setPreferredSize(new Dimension(150, 73));
		menu.add(jouer);
		menu.add(quitter);
	}
	
	/**
	 * Return JPanel of the menu pf the graphic interface
	 * @return menu
	 */
	public JPanel getMenu() {
		return menu;
	}
	
	/**
	 * Set the Menu of the graphic interface
	 * @param menu
	 */
	public void setMenu(JPanel menu) {
		this.menu = menu;
	}
	
	/**
	 * Return the JButton to play on the menu
	 * @return jouer
	 */
	public JButton getJouer() {
		return jouer;
	}
	
	/**
	 * Set the JButton to play on the menu
	 * @param jouer
	 */
	public void setJouer(JButton jouer) {
		this.jouer = jouer;
	}
	
	/**
	 * Return the JButton to quit on the menu
	 * @return quitter
	 */
	public JButton getQuitter() {
		return quitter;
	}

	/**
	 * Set the JButton to quit on the menu
	 * @param quitter
	 */
	public void setQuitter(JButton quitter) {
		this.quitter = quitter;
	}

	/**
	 * Wait an action to be performed, react to the action to quit the game
	 * @see ActionEvent#getSource()
	 */
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == quitter) {
			
			System.exit(0);
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}	
}

