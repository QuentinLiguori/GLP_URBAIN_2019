package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu implements ActionListener, Runnable{
	
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
		
		menu.add(jouer);
		menu.add(quitter);
	}

	public JPanel getMenu() {
		return menu;
	}

	public void setMenu(JPanel menu) {
		this.menu = menu;
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
