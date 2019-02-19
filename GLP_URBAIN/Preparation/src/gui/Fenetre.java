package gui;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	public Fenetre() {
		super("Urbain");
		this.setSize(1700,900);
		this.setLocationRelativeTo(null);
		
		this.setContentPane(new Map());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
