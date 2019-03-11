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
	private Image image7;
	private Image image8;
	private Image image9;
	private Image image10;
	private Image image11;
	private Image image12;
	private Image image13;
	private Image image14;
	private Image image15;
	private Image image16;
	private Image image17;
	
	private JPanel mapPane;
	
	
	public JPanel getMapPane() {
		
		return mapPane;
	}

	public MapG() {
		mapPane = new JPanel();
		this.setBackground(Color.DARK_GRAY);
		

		
	}
	public void paintComponent(Graphics g) {
		
		try {
			this.image1 = ImageIO.read(new File("pictures/bar.jpg"));
			this.image2 = ImageIO.read(new File("pictures/cine.jpg"));
			this.image3 = ImageIO.read(new File("pictures/disco.jpg"));
			this.image4 = ImageIO.read(new File("pictures/ff.jpg"));
			this.image5 = ImageIO.read(new File("pictures/ff2.jpg"));
			this.image6 = ImageIO.read(new File("pictures/hotel.jpg"));
			this.image7 = ImageIO.read(new File("pictures/jardin.jpg"));
			this.image8 = ImageIO.read(new File("pictures/mairie.jpg"));
			this.image9 = ImageIO.read(new File("pictures/maison1.jpg"));
			this.image10 = ImageIO.read(new File("pictures/maison2.jpg"));
			this.image11 = ImageIO.read(new File("pictures/maison3.jpg"));
			this.image12 = ImageIO.read(new File("pictures/parc.jpg"));
			this.image13 = ImageIO.read(new File("pictures/resto.jpg"));
			this.image14 = ImageIO.read(new File("pictures/theatre.jpg"));
			this.image15 = ImageIO.read(new File("pictures/toitImmeuble.jpg"));
			this.image16 = ImageIO.read(new File("pictures/toitImmeuble2.jpg"));
			this.image17 = ImageIO.read(new File("pictures/villa.jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//*******************Initialisation de la map**************************************************//
		super.paintComponent(g);
		g.setColor(Color.WHITE);
	
		
		g.drawImage(image17,0, 0, 252, 148,this);         //     1     //
		g.drawImage(image9,331, 0, 168, 148,this);         //    2      //
		g.drawImage(image11,509, 0, 168, 148,this);         //     3     //
		g.drawImage(image16,756, 0, 420, 148,this);         //     4     //
		g.drawImage(image12,1260, 0, 336, 409,this);         //     5     //
		g.drawImage(image2,0, 222, 336, 227,this);         //       6   //
		g.drawImage(image15,415, 222, 168, 148,this);         //      7    //
		g.drawImage(image1,593, 222, 168, 148,this);         //       8   //
		g.drawImage(image4,835, 222, 84, 148,this);         //    9      //
		g.drawImage(image3,929, 222, 252, 148,this);         //    10      //
		g.drawImage(image7,415, 380, 168, 148,this);         //      11    //
		g.drawImage(image13,593, 380, 168, 148,this);         //   12       //
		g.drawImage(image8,835, 380, 341, 148,this);         //     13     //
		g.drawImage(image13,1420, 419, 168, 237,this);         //      14    //
		g.drawImage(image10,0, 523, 168, 79,this);         //    15      //
		g.drawImage(image5,247, 523, 84, 79,this);         //     16     //
		g.drawImage(image1,1186, 489, 168, 158,this);         //    17      //
		g.drawImage(image11,0, 612, 168, 138,this);         //      18    //
		g.drawImage(image9,247, 612, 168, 138,this);         //      19    //
		g.drawImage(image10,425, 612, 168, 138,this);         //    20     //
		g.drawImage(image6,672, 612, 420, 281,this);         //       21   //
		g.drawImage(image9,0, 760, 168, 133,this);         //      22    //
		g.drawImage(image11,247, 760, 168, 133,this);         //      23    //
		g.drawImage(image10,425, 760, 168, 133,this);         //      24    //
		g.drawImage(image14,1176, 735, 420, 158,this);         //    25      //
		
		
	}
	
}
