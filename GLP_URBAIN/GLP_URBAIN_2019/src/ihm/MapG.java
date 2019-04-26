package ihm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import perso.Personnage;
import ville.PlanVille;
import world.World;

/**
 * 
 * @author Quentin Liguori
 * This class initialize the all Map of the city
 */
public class MapG extends JPanel {
	
	private PlanVille ville;
	private World world;
	
	private Image image0;
	private Image image00;
	private Image image000;
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
	
	/**
	 * Return the JPanel with the all map on it
	 * @return mapPane
	 */
	public JPanel getMapPane() {
		
		return mapPane;
	}
	
	/**
	 * Constructor of MapG
	 */
	public MapG() {
		mapPane = new JPanel();
		ville = new PlanVille();
		this.setBackground(Color.DARK_GRAY);
		
	}
	
	/**
	 * Paint the component of the map on the JPanel of the map
	 * 
	 * @see ImageIO#read(File)
	 * @see IOException#printStackTrace()
	 * @see JPanel#paintComponents(Graphics)
	 * @see Graphics#setColor(Color)
	 * @see Graphics#drawImage(Image, int, int, int, int, int, int, int, int, java.awt.image.ImageObserver)
	 * @see Graphics#drawString(String, int, int)
	 */
	public void paintComponent(Graphics g) {
		
		try {
			this.image0 = ImageIO.read(new File("pictures/tile_0051.jpg"));
			this.image00 = ImageIO.read(new File("pictures/tile_0213.jpg"));
			this.image000 = ImageIO.read(new File("pictures/tile_0375.jpg"));
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
			

		super.paintComponent(g);
		g.setColor(Color.WHITE);
		
		//*******************Cr�ation Batiments**************************************************//
		g.drawImage(image17,ville.getVilla().getHautGauche().getX(),ville.getVilla().getHautGauche().getY(),ville.getVilla().getBasDroite().getX()-ville.getVilla().getHautGauche().getX(),ville.getVilla().getBasDroite().getY()-ville.getVilla().getHautGauche().getY(),this);         //     villa     //
		g.drawImage(image9,ville.getHome1().getHautGauche().getX(),ville.getHome1().getHautGauche().getY(),ville.getHome1().getBasDroite().getX()-ville.getHome1().getHautGauche().getX(),ville.getHome1().getBasDroite().getY()-ville.getHome1().getHautGauche().getY(),this);         //    home1      //
		g.drawImage(image11,ville.getHome2().getHautGauche().getX(),ville.getHome2().getHautGauche().getY(),ville.getHome2().getBasDroite().getX()-ville.getHome2().getHautGauche().getX(),ville.getHome2().getBasDroite().getY()-ville.getHome2().getHautGauche().getY(),this);         //    home2    //
		g.drawImage(image16,ville.getBureau1().getHautGauche().getX(),ville.getBureau1().getHautGauche().getY(),ville.getBureau1().getBasDroite().getX()-ville.getBureau1().getHautGauche().getX(),ville.getBureau1().getBasDroite().getY()-ville.getBureau1().getHautGauche().getY(),this);         //     bureau1     //
		g.drawImage(image12,ville.getParc().getHautGauche().getX(),ville.getParc().getHautGauche().getY(),ville.getParc().getBasDroite().getX()-ville.getParc().getHautGauche().getX(),ville.getParc().getBasDroite().getY()-ville.getParc().getHautGauche().getY(),this);         //     parc     //
		g.drawImage(image2,ville.getCinema().getHautGauche().getX(),ville.getCinema().getHautGauche().getY(),ville.getCinema().getBasDroite().getX()-ville.getCinema().getHautGauche().getX(),ville.getCinema().getBasDroite().getY()-ville.getCinema().getHautGauche().getY(),this);         //       cine//
		g.drawImage(image15,ville.getBureau2().getHautGauche().getX(),ville.getBureau2().getHautGauche().getY(),ville.getBureau2().getBasDroite().getX()-ville.getBureau2().getHautGauche().getX(),ville.getBureau2().getBasDroite().getY()-ville.getBureau2().getHautGauche().getY(),this);         //    bureau2   //
		g.drawImage(image1,ville.getBar1().getHautGauche().getX(),ville.getBar1().getHautGauche().getY(),ville.getBar1().getBasDroite().getX()-ville.getBar1().getHautGauche().getX(),ville.getBar1().getBasDroite().getY()-ville.getBar1().getHautGauche().getY(),this);         //       bar   //
		g.drawImage(image4,ville.getFastFood1().getHautGauche().getX(),ville.getFastFood1().getHautGauche().getY(),ville.getFastFood1().getBasDroite().getX()-ville.getFastFood1().getHautGauche().getX(),ville.getFastFood1().getBasDroite().getY()-ville.getFastFood1().getHautGauche().getY(),this);         //    fastfood      //
		g.drawImage(image3,ville.getDisco().getHautGauche().getX(),ville.getDisco().getHautGauche().getY(),ville.getDisco().getBasDroite().getX()-ville.getDisco().getHautGauche().getX(),ville.getDisco().getBasDroite().getY()-ville.getDisco().getHautGauche().getY(),this);         //    disco      //
		g.drawImage(image7,ville.getParc2().getHautGauche().getX(),ville.getParc2().getHautGauche().getY(),ville.getParc2().getBasDroite().getX()-ville.getParc2().getHautGauche().getX(),ville.getParc2().getBasDroite().getY()-ville.getParc2().getHautGauche().getY(),this);         //      parc2    //
		g.drawImage(image13,ville.getResto1().getHautGauche().getX(),ville.getResto1().getHautGauche().getY(),ville.getResto1().getBasDroite().getX()-ville.getResto1().getHautGauche().getX(),ville.getResto1().getBasDroite().getY()-ville.getResto1().getHautGauche().getY(),this);         //   resto1      //
		g.drawImage(image8,ville.getMairie().getHautGauche().getX(),ville.getMairie().getHautGauche().getY(),ville.getMairie().getBasDroite().getX()-ville.getMairie().getHautGauche().getX(),ville.getMairie().getBasDroite().getY()-ville.getMairie().getHautGauche().getY(),this);         //     mairie     //
		g.drawImage(image13,ville.getResto2().getHautGauche().getX(),ville.getResto2().getHautGauche().getY(),ville.getResto2().getBasDroite().getX()-ville.getResto2().getHautGauche().getX(),ville.getResto2().getBasDroite().getY()-ville.getResto2().getHautGauche().getY(),this);         //      resto2   //
		g.drawImage(image10,ville.getHome3().getHautGauche().getX(),ville.getHome3().getHautGauche().getY(),ville.getHome3().getBasDroite().getX()-ville.getHome3().getHautGauche().getX(),ville.getHome3().getBasDroite().getY()-ville.getHome3().getHautGauche().getY(),this);         //    home3     //
		g.drawImage(image5,ville.getFastFood2().getHautGauche().getX(),ville.getFastFood2().getHautGauche().getY(),ville.getFastFood2().getBasDroite().getX()-ville.getFastFood2().getHautGauche().getX(),ville.getFastFood2().getBasDroite().getY()-ville.getFastFood2().getHautGauche().getY(),this);         //    fastfood2     //
		g.drawImage(image1,ville.getBar2().getHautGauche().getX(),ville.getBar2().getHautGauche().getY(),ville.getBar2().getBasDroite().getX()-ville.getBar2().getHautGauche().getX(),ville.getBar2().getBasDroite().getY()-ville.getBar2().getHautGauche().getY(),this);         //    bar2      //
		g.drawImage(image11,ville.getHome4().getHautGauche().getX(),ville.getHome4().getHautGauche().getY(),ville.getHome4().getBasDroite().getX()-ville.getHome4().getHautGauche().getX(),ville.getHome4().getBasDroite().getY()-ville.getHome4().getHautGauche().getY(),this);         //      home4    //
		g.drawImage(image9,ville.getHome5().getHautGauche().getX(),ville.getHome5().getHautGauche().getY(),ville.getHome5().getBasDroite().getX()-ville.getHome5().getHautGauche().getX(),ville.getHome5().getBasDroite().getY()-ville.getHome5().getHautGauche().getY(),this);         //      home5    //
		g.drawImage(image10,ville.getHome6().getHautGauche().getX(),ville.getHome6().getHautGauche().getY(),ville.getHome6().getBasDroite().getX()-ville.getHome6().getHautGauche().getX(),ville.getHome6().getBasDroite().getY()-ville.getHome6().getHautGauche().getY(),this);         //    home6     //
		g.drawImage(image6,ville.getHotel().getHautGauche().getX(),ville.getHotel().getHautGauche().getY(),ville.getHotel().getBasDroite().getX()-ville.getHotel().getHautGauche().getX(),ville.getHotel().getBasDroite().getY()-ville.getHotel().getHautGauche().getY(),this);         //       hotel   //
		g.drawImage(image9,ville.getHome7().getHautGauche().getX(),ville.getHome7().getHautGauche().getY(),ville.getHome7().getBasDroite().getX()-ville.getHome7().getHautGauche().getX(),ville.getHome7().getBasDroite().getY()-ville.getHome7().getHautGauche().getY(),this);         //      home7    //
		g.drawImage(image11,ville.getHome8().getHautGauche().getX(),ville.getHome8().getHautGauche().getY(),ville.getHome8().getBasDroite().getX()-ville.getHome8().getHautGauche().getX(),ville.getHome8().getBasDroite().getY()-ville.getHome8().getHautGauche().getY(),this);         //      home8    //
		g.drawImage(image10,ville.getHome9().getHautGauche().getX(),ville.getHome9().getHautGauche().getY(),ville.getHome9().getBasDroite().getX()-ville.getHome9().getHautGauche().getX(),ville.getHome9().getBasDroite().getY()-ville.getHome9().getHautGauche().getY(),this);         //      home9    //
		g.drawImage(image14,ville.getTheatre().getHautGauche().getX(),ville.getTheatre().getHautGauche().getY(),ville.getTheatre().getBasDroite().getX()-ville.getTheatre().getHautGauche().getX(),ville.getTheatre().getBasDroite().getY()-ville.getTheatre().getHautGauche().getY(),this);         //    theatre     //
   
		//************************personnage*******************************************************//
				for(int i = 0; i < MainWindow.persoCreation.getWorld().getAllCitizens().size() ; i++) {
		            g.drawImage(image0,MainWindow.persoCreation.getWorld().getAllCitizens().get(i).getPositionX(),MainWindow.persoCreation.getWorld().getAllCitizens().get(i).getPositionY(), 20, 20,this);
		            g.drawString(MainWindow.persoCreation.getWorld().getAllCitizens().get(i).getPrenomNom(), MainWindow.persoCreation.getWorld().getAllCitizens().get(i).getPositionX(), MainWindow.persoCreation.getWorld().getAllCitizens().get(i).getPositionY() - 3);
				}
//*********************************dessins des routes*************************************************************//
		
	}
	
	/**
	 * Paint the character on the map
	 * @param posX
	 * @param posY
	 * @param g
	 * @see Graphics#drawImage(Image, int, int, int, int, int, int, int, int, java.awt.image.ImageObserver)
	 * @see Graphics#drawString(String, int, int)
	 */
	/*public void paintPerso(int posX, int posY, Graphics g) {
		g.drawImage(image0,posX,posY, 20, 20,this);
        g.drawString(posX, , ());

	}*/
	
}
