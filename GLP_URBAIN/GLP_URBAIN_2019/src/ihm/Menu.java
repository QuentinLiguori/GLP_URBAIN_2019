package ihm;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener, Runnable{
	
	private JButton jouer;
	private JButton quitter;
	private JPanel menu;
	
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
	

	public JPanel getMenu() {
		return menu;
	}

	public void setMenu(JPanel menu) {
		this.menu = menu;
	}
	
	

	public JButton getJouer() {
		return jouer;
	}

	public void setJouer(JButton jouer) {
		this.jouer = jouer;
	}

	public JButton getQuitter() {
		return quitter;
	}

	public void setQuitter(JButton quitter) {
		this.quitter = quitter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jouer) {
			
		}
		if(e.getSource() == quitter) {
			
			System.exit(0);
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

