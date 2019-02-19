package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Map extends JPanel implements MouseListener {
	private int posX=555;
	private int posY=640;
	private int posX2=1360;
	private int posY2=467;
	private Image image01;
	private Image image02;
	private Image image11;
	private Image image12;
	private Image image13;
	private Image image20;
	private Image image21;
	private Image image22;
	private Image image23;
	private Image image25;
	private Image image26;
	public Map() {
		this.setBackground(Color.darkGray);
		this.setSize(500,500);
		this.addMouseListener(this);
		
	}
	public void paintComponent(Graphics g) {
		
		try {
			this.image01 = ImageIO.read(new File("src/Tiles/tile_0241.png"));
			this.image02 = ImageIO.read(new File("src/Tiles/tile_0403.png"));
			this.image11 = ImageIO.read(new File("src/toitImmeuble01.jpg"));
			this.image12 = ImageIO.read(new File("src/toitImmeuble02.jpg"));
			this.image13 = ImageIO.read(new File("src/jardin2.jpg"));
			this.image20 = ImageIO.read(new File("src/maison.jpg"));
			this.image21 = ImageIO.read(new File("src/maison2.jpg"));
			this.image22 = ImageIO.read(new File("src/maison3.jpg"));
			this.image21 = ImageIO.read(new File("src/maison4.jpg"));
			this.image23 = ImageIO.read(new File("src/maison5.jpg"));
			this.image25 = ImageIO.read(new File("src/maison7.jpg"));
			this.image26 = ImageIO.read(new File("src/maison8.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//*******************Initialisation de la map**************************************************//
		super.paintComponent(g);
		g.setColor(Color.WHITE);
	
		
		g.drawLine(265,0,265,130);
		g.drawLine(285,0,285,130);
		g.drawLine(550,0,550,130);
		g.drawLine(265,150,265,280);
		g.drawLine(285,150,285,280);
		g.drawLine(550,150,550,280);
		g.drawLine(0,0,265,0);
		g.drawLine(0,130,265,130);
		g.drawLine(0,150,265,150);
		g.drawLine(0,280,265,280);
		g.drawLine(285,0,550,0);
		g.drawLine(285,130,550,130);
		g.drawLine(285,150,550,150);
		g.drawLine(285,280,550,280);
		
		g.drawLine(265,305,265,435);
		g.drawLine(285,305,285,435);
		g.drawLine(550,305,550,435);
		g.drawLine(265,455,265,580);
		g.drawLine(285,455,285,580);
		g.drawLine(550,455,550,580);
		g.drawLine(0,305,265,305);
		g.drawLine(0,435,265,435);
		g.drawLine(0,455,265,455);
		g.drawLine(0,580,265,580);
		g.drawLine(285,305,550,305);
		g.drawLine(285,435,550,435);
		g.drawLine(285,455,550,455);
		g.drawLine(285,580,550,580);
		
		g.drawLine(265,605,265,740);
		g.drawLine(285,605,285,740);
		g.drawLine(550,605,550,740);
		g.drawLine(265,760,265,900);
		g.drawLine(285,760,285,900);
		g.drawLine(550,760,550,900);
		g.drawLine(0,605,265,605);
		g.drawLine(0,740,265,740);
		g.drawLine(0,760,265,760);
		g.drawLine(0,900,265,900);
		g.drawLine(285,605,550,605);
		g.drawLine(285,740,550,740);
		g.drawLine(285,760,550,760);
		g.drawLine(285,900,550,900);
//..........................................................................//
		g.drawLine(575,0,575,130);
		g.drawLine(832,0,832,130);
		g.drawLine(852,0,852,130);
		g.drawLine(1110,0,1110,130);
		g.drawLine(575,150,575,280);
		g.drawLine(832,150,832,280);
		g.drawLine(852,150,852,280);
		g.drawLine(1110,150,1110,280);
		g.drawLine(575,0,832,0);
		g.drawLine(575,130,832,130);
		g.drawLine(575,150,832,150);
		g.drawLine(575,280,832,280);
		g.drawLine(852,0,1110,0);
		g.drawLine(852,130,1110,130);
		g.drawLine(852,150,1110,150);
		g.drawLine(852,280,1110,280);
		
		g.drawLine(575,305,575,435);
		g.drawLine(832,305,832,435);
		g.drawLine(852,305,852,435);
		g.drawLine(1110,305,1110,435);
		g.drawLine(575,455,575,580);
		g.drawLine(832,455,832,580);
		g.drawLine(852,455,852,580);
		g.drawLine(1110,455,1110,580);
		g.drawLine(575,305,832,305);
		g.drawLine(575,435,832,435);
		g.drawLine(575,455,832,455);
		g.drawLine(575,580,832,580);
		g.drawLine(852,305,1110,305);
		g.drawLine(852,435,1110,435);
		g.drawLine(852,455,1110,455);
		g.drawLine(852,580,1110,580);
		
		g.drawLine(575,605,575,740);
		g.drawLine(832,605,832,740);
		g.drawLine(852,605,852,740);
		g.drawLine(1110,605,1110,740);
		g.drawLine(575,760,575,900);
		g.drawLine(832,760,832,900);
		g.drawLine(852,760,852,900);
		g.drawLine(1110,760,1110,900);
		g.drawLine(575,605,832,605);
		g.drawLine(575,740,832,740);
		g.drawLine(575,760,832,760);
		g.drawLine(575,900,832,900);
		g.drawLine(852,605,1110,605);
		g.drawLine(852,740,1110,740);
		g.drawLine(852,760,1110,760);
		g.drawLine(852,900,1110,900);
		
	//............................................................./
		g.drawLine(1135,0,1135,130);
		g.drawLine(1407,0,1407,130);
		g.drawLine(1427,0,1427,130);
		g.drawLine(1700,0,1700,130);
		g.drawLine(1135,150,1135,280);
		g.drawLine(1407,150,1407,280);
		g.drawLine(1427,150,1427,280);
		g.drawLine(1700,150,1700,280);
		g.drawLine(1135,0,1407,0);
		g.drawLine(1135,130,1407,130);
		g.drawLine(1135,150,1407,150);
		g.drawLine(1135,280,1407,280);
		g.drawLine(1427,0,1700,0);
		g.drawLine(1427,130,1700,130);
		g.drawLine(1427,150,1700,150);
		g.drawLine(1427,280,1700,280);
		
		g.drawLine(1135,305,1135,435);
		g.drawLine(1407,305,1407,435);
		g.drawLine(1427,305,1427,435);
		g.drawLine(1700,305,1700,435);
		g.drawLine(1135,455,1135,580);
		g.drawLine(1407,455,1407,580);
		g.drawLine(1427,455,1427,580);
		g.drawLine(1700,305,1700,435);
		g.drawLine(1135,305,1407,305);
		g.drawLine(1135,435,1407,435);
		g.drawLine(1135,455,1407,455);
		g.drawLine(1135,580,1407,580);
		g.drawLine(1427,305,1700,305);
		g.drawLine(1427,435,1700,435);
		g.drawLine(1427,455,1700,455);
		g.drawLine(1427,580,1700,580);
		
		g.drawLine(1135,605,1135,740);
		g.drawLine(1407,605,1407,740);
		g.drawLine(1427,605,1427,740);
		g.drawLine(1700,605,1700,740);
		g.drawLine(1135,760,1135,900);
		g.drawLine(1407,760,1407,900);
		g.drawLine(1427,760,1427,900);
		g.drawLine(1700,760,1700,900);
		g.drawLine(1135,605,1407,605);
		g.drawLine(1135,740,1407,740);
		g.drawLine(1135,760,1407,760);
		g.drawLine(1135,900,1407,900);
		g.drawLine(1427,605,1700,605);
		g.drawLine(1427,740,1700,740);
		g.drawLine(1427,760,1700,760);
		g.drawLine(1427,900,1700,900);


//*******************Construction des batiments***************************************************************//
		//g.fillOval(posX, posY,20,20);
		g.setColor(Color.green);
		g.fillOval(300,500 ,20,20);
		//g.fillRect(0, 0, 265, 135);
		
	//***************pelouse********************************************//	
		g.drawImage(image13,0,0, 265,135, this);
		g.drawImage(image13,0,145, 265,135, this);
		g.drawImage(image13,0,305, 265,135, this);
		g.drawImage(image13,0,455, 265,135, this);
		g.drawImage(image13,0,605, 265,135, this);
		g.drawImage(image13,0,760, 265,135, this);
		
		g.drawImage(image13,285,0, 265,135, this);
		g.drawImage(image13,285,145, 265,135, this);
		g.drawImage(image13,285,305, 265,135, this);
		g.drawImage(image13,285,455, 265,135, this);
		g.drawImage(image13,285,605, 265,135, this);
		g.drawImage(image13,285,760, 265,135, this);
		
		g.drawImage(image13,575,0, 257,135, this);
		g.drawImage(image13,575,145, 257,135, this);
		g.drawImage(image13,575,305, 257,135, this);
		g.drawImage(image13,575,455, 257,135, this);
		g.drawImage(image13,575,605, 257,135, this);
		g.drawImage(image13,575,760, 257,135, this);
		
		g.drawImage(image13,852,0, 258,135, this);
		g.drawImage(image13,852,145, 258,135, this);
		g.drawImage(image13,852,305, 258,135, this);
		g.drawImage(image13,852,455, 258,135, this);
		g.drawImage(image13,852,605, 258,135, this);
		g.drawImage(image13,852,760, 258,135, this);
		
		g.drawImage(image13,1135,0, 272,135, this);
		g.drawImage(image13,1135,145, 272,135, this);
		g.drawImage(image13,1135,305, 272,135, this);
		g.drawImage(image13,1135,455, 272,135, this);
		g.drawImage(image13,1135,605, 272,135, this);
		g.drawImage(image13,1135,760, 272,135, this);
		
		g.drawImage(image13,1427,0, 273,135, this);
		g.drawImage(image13,1427,145, 273,135, this);
		g.drawImage(image13,1427,305, 273,135, this);
		g.drawImage(image13,1427,455, 273,135, this);
		g.drawImage(image13,1427,605, 273,135, this);
		g.drawImage(image13,1427,760, 273,135, this);
		
		//***************************Personnages***************************************//
		
		g.drawImage(image01, posX, posY, 30, 30, this);
		g.drawImage(image02, posX2, posY2, 30, 30, this);
		
		
		
		
	//*****************************Batiments****************************************************//
		g.drawImage(image20, 1155,460, 80, 60, this);
		g.drawImage(image21, 1155,520, 80, 60, this);
		g.drawImage(image26, 1271,490, 90, 90, this);
		g.drawImage(image20,20,5, 80, 60, this);
		g.drawImage(image21,20,70, 80, 60, this);
		g.drawImage(image22, 155,65, 60, 60, this);
		g.drawImage(image22, 155,5, 60, 60, this);
		g.drawImage(image11, 877,170, 90, 90, this);
		g.drawImage(image12, 1007,170, 50, 90, this);
		g.drawImage(image22, 310,315, 60, 60, this);
		g.drawImage(image22, 310,375, 60, 60, this);
		g.drawImage(image22, 440,315, 60, 60, this);
		g.drawImage(image22, 440,375, 60, 60, this);
		g.drawImage(image20, 595,460, 80, 60, this);
		g.drawImage(image20, 595,520, 80, 60, this);
		g.drawImage(image21, 725,460, 80, 60, this);
		g.drawImage(image21, 725,520, 80, 60, this);
		g.drawImage(image26, 600,170, 80, 80, this);
		g.drawImage(image11, 710,170, 90, 90, this);
		g.drawImage(image20, 5,610, 80, 60, this);
		g.drawImage(image22, 160,610, 60, 60, this);
		g.drawImage(image21, 5,676, 80, 60, this);
		g.drawImage(image20, 135,676, 80, 60, this);
		g.drawImage(image11, 852,330, 90, 90, this);
		g.drawImage(image12, 1010,330, 50, 90, this);
		g.drawImage(image20, 20,460, 80, 60, this);
		g.drawImage(image25, 20,520, 80, 60, this);
		g.drawImage(image23, 150,460, 80, 60, this);
		g.drawImage(image20, 150,520, 80, 60, this);
		g.drawImage(image22, 1472,610, 60, 60, this);
		g.drawImage(image21, 1447,670, 80, 60, this);
		g.drawImage(image20, 1577,610, 80, 60, this);
		g.drawImage(image23, 1577,670, 80, 60, this);
		g.drawImage(image21, 1477,310, 80, 60, this);
		g.drawImage(image23, 1477,370, 80, 60, this);
		g.drawImage(image26, 1592,310, 80, 80, this);
		g.drawImage(image23, 1447,460, 80, 60, this);
		g.drawImage(image21, 1447,520, 80, 60, this);
		g.drawImage(image23, 1577,460, 80, 60, this);
		g.drawImage(image23, 1577,520, 80, 60, this);
		g.drawImage(image21, 872,460, 80, 60, this);
		g.drawImage(image20, 872,520, 80, 60, this);
		g.drawImage(image21, 1002,460, 80, 60, this);
		g.drawImage(image20, 1002,520, 80, 60, this);
		g.drawImage(image25, 305,460, 80, 60, this);
		g.drawImage(image23, 300,520, 80, 60, this);
		g.drawImage(image26, 435,460, 70, 60, this);
		g.drawImage(image20, 425,520, 80, 60, this);
		g.drawImage(image11, 600,620, 90, 90, this);
		g.drawImage(image11, 710,620, 90, 90, this);
		g.drawImage(image11, 1452,15, 90, 90, this);
		g.drawImage(image11, 1562,15, 90, 90, this);
		g.drawImage(image23, 1155,610, 80, 60, this);
		g.drawImage(image21, 1155,670, 80, 60, this);
		g.drawImage(image12, 1300,620, 50, 90, this);
		g.drawImage(image26, 600,320, 80, 80, this);
		g.drawImage(image11, 710,320, 90, 90, this);
		g.drawImage(image11, 310,170, 90, 90, this);
		g.drawImage(image11, 420,170, 90, 90, this);
		g.drawImage(image23, 20,160, 80, 60, this);
		g.drawImage(image12, 1300,170, 50, 90, this);
		g.drawImage(image21, 20,220, 80, 60, this);
		g.drawImage(image20, 1155,160, 80, 60, this);
		g.drawImage(image20, 1155,220, 80, 60, this);
		g.drawImage(image26, 155,160, 80, 80, this);
		g.drawImage(image11, 1160,320, 90, 90, this);
		g.drawImage(image12, 1300,320, 50, 90, this);
		g.drawImage(image11, 1452,170, 90, 90, this);
		g.drawImage(image12, 1592,170, 50, 90, this);
		g.drawImage(image11, 310,620, 90, 90, this);
		g.drawImage(image12, 450,620, 50, 90, this);
		g.drawImage(image11, 25,320, 90, 90, this);
		g.drawImage(image12, 165,320, 50, 90, this);
		g.drawImage(image26, 877,620, 80, 80, this);
		g.drawImage(image23, 1002,610, 80, 60, this);
		g.drawImage(image20, 1002,670, 80, 60, this);
		g.drawImage(image26, 320,15, 80, 80, this);
		g.drawImage(image21, 435,5, 80, 60, this);
		g.drawImage(image23, 435,65, 80, 60, this);
		g.drawImage(image23, 595,5, 80, 60, this);
		g.drawImage(image20, 595,65, 80, 60, this);
		g.drawImage(image20, 725,5, 80, 60, this);
		g.drawImage(image23, 725,65, 80, 60, this);
		g.drawImage(image23, 872,5, 80, 60, this);
		g.drawImage(image23, 872,65, 80, 60, this);
		g.drawImage(image20, 1002,5, 80, 80, this);
		g.drawImage(image21, 1002,65, 80, 60, this);
		g.drawImage(image20, 1155,5, 80, 60, this);
		g.drawImage(image20, 1155,65, 80, 60, this);
		g.drawImage(image20, 1285,5, 80, 60, this);
		g.drawImage(image21, 1285,65, 80, 60, this);
		g.drawImage(image20, 20,770, 80, 60, this);
		g.drawImage(image23, 155,770, 90, 70, this);
		g.drawImage(image20, 305,770, 80, 60, this);
		g.drawImage(image23, 440,770, 90, 70, this);
		g.drawImage(image23, 600,770, 90, 70, this);
		g.drawImage(image25, 730,770, 90, 60, this);
		g.drawImage(image23, 877,770, 90, 70, this);
		g.drawImage(image25, 1007,770, 90, 70, this);
		g.drawImage(image23, 1160,770, 90, 70, this);
		g.drawImage(image23, 1290,770, 90, 60, this);
		g.drawImage(image25, 1452,770, 90, 70, this);
		g.drawImage(image23, 1582,770, 90, 70, this);
		
		
		
		
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		posX=e.getX();
		posY=e.getY();
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
