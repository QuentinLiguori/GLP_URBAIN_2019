package ihm;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Quentin Liguori
 * 
 * Initialize the Menu of the graphic interface
 */
public class Menu extends JPanel implements ActionListener, Runnable{
	
	private Image img;
	private JButton jouer;
	private JButton quitter;
	
	/**
	 * Constructor of Menu initialize the menu of the graphic interface
	 * @see JButton#setText(String)
	 * @see JButton#addActionListener(ActionListener)
	 * @see JPanel#setLayout(java.awt.LayoutManager)
	 * @see JButton#setPreferredSize(Dimension)
	 * @see JPanel#add(java.awt.Component)
	 */
	public Menu() {
		
		jouer = new JButton();
		jouer.setText("Jouer");
		jouer.addActionListener(this);
		
		quitter = new JButton();
		quitter.setText("Quitter");
		quitter.addActionListener(this);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,100,400));
		jouer.setPreferredSize(new Dimension(150, 73));
		quitter.setPreferredSize(new Dimension(150, 73));
		this.add(jouer);
		this.add(quitter);
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
	
	public void paintComponent(Graphics g) {
		try {
			this.img = ImageIO.read(new File("pictures/logo.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.paintComponent(g);
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
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

