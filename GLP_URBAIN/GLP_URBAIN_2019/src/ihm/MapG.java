package ihm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MapG extends JPanel {
	private Image image1;
	private Image image2;
	private Image image3;
	private Image image4;
	private Image image5;
	private Image image6;
	private JPanel mapPane;
	
	public JPanel getMapPane() {
		
		return mapPane;
	}

	public MapG() {
		mapPane = new JPanel();
		mapPane.setBackground(Color.darkGray);

		
	}
	public void paintComponent(Graphics g) {
		
		try {
			this.image1 = ImageIO.read(new File("src/maison4.jpg"));
			this.image2 = ImageIO.read(new File("src/maison5.jpg"));
			this.image3 = ImageIO.read(new File("src/toitImmeuble01.jpg"));
			this.image4 = ImageIO.read(new File("src/maison8.jpg"));
			this.image5 = ImageIO.read(new File("src/maison7.jpg"));
			this.image6 = ImageIO.read(new File("src/maison.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//*******************Initialisation de la map**************************************************//
		super.paintComponent(g);
		g.setColor(Color.WHITE);
	
		
		g.drawImage(image1,120, 60, 180, 100,this);
		g.drawImage(image6,360, 60, 180, 100,this);
		g.drawImage(image6,120, 220, 180, 100,this);
		g.drawImage(image2,360, 220, 180, 100,this);
		
		g.drawImage(image2,120, 450, 180, 100,this);
		g.drawImage(image2,360, 450, 180, 100,this);
		g.drawImage(image5,120, 590, 180, 100,this);
		g.drawImage(image4,360, 590, 180, 100,this);
		
		
		
		g.drawImage(image4,840, 60, 180, 100,this);
		g.drawImage(image5,1080, 60, 180, 100,this);
		g.drawImage(image3,840, 220, 180, 100,this);
		g.drawImage(image4,1080, 220, 180, 100,this);
		
		g.drawImage(image4,840, 450, 180, 100,this);
		g.drawImage(image5,1080, 450, 180, 100,this);
		g.drawImage(image2,840, 590, 180, 100,this);
		g.drawImage(image1,1080, 590, 180, 100,this);
		
		
		
		
	}
	
}
