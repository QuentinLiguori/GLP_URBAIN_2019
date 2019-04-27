package ihm;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import perso.Personnage;
import world.World;

/**
 * This class manage the panel with the character creation 
 * @author Quentin Liguori
 *
 */
public class PersoCreation implements ActionListener{
	
	// Initialisation du random pour le joueur //
	
		private Random rand;
		private String[] randPrenomM;
		private String[] randNom;
		private String[] randPrenomF;
		private int randAge;
	
	//..................Les labels......................................
		private JLabel persoCrea;
		private JLabel nom;
		private JLabel prenom;
		private JLabel age;
		private JLabel sexe;
		private JLabel jeux;
		
	//.............Les Panels...........................................
		private JPanel persCreationPane;
		private JPanel left;
		private JPanel right;
		private JPanel topRight;
		private JPanel bottomRight;
		private JPanel main;
		
	//................Les textFields et boutons.........................
		private JButton creer;
		private JButton aleatoire;
		private JButton jouer;
		private JTextField newnom;
		private JTextField newprenom;
		private JSpinner newage;
		private JComboBox<String> newsexe;
		private JList<String> list;
		private DefaultListModel<String> mod;
		private World world;
	
	/**
	 * Constructor of PersoCreation, initialize the character creation of the graphic interface
	 * 
	 * @see JPanel#setLayout(java.awt.LayoutManager)
	 * @see JLabel#setFont(Font)
	 * @see JLabel#setText(String)
	 * @see JComboBox#addItem(Object)
	 * @see JPanel#add(java.awt.Component)
	 * @see JPanel#setLayout(java.awt.LayoutManager)
	 * @see JButton#setPreferredSize(Dimension)
	 * @see JComboBox#setSelectedItem(Object)
	 */
	public PersoCreation() {
		
		world = new World();
	
	// Initialisation des tableaux pour les resonnages aléatoire //
		
		rand = new Random();
		
		randPrenomF = new String[20];
		randPrenomM = new String [20];
		randNom = new String[30];
		
		// Base de données des prénoms Masculin Aléatoire //
		
		randPrenomM[0] = "Lionel";
		randPrenomM[1] = "Quentin";
		randPrenomM[2] = "Mohamed";
		randPrenomM[3] = "Adrien";
		randPrenomM[4] = "Roger";
		randPrenomM[5] = "Jules";
		randPrenomM[6] = "Paul";
		randPrenomM[7] = "Jake";
		randPrenomM[8] = "Alan";
		randPrenomM[9] = "Remi";
		randPrenomM[10] = "Bernard";
		randPrenomM[11] = "Loic";
		randPrenomM[12] = "Lucas";
		randPrenomM[13] = "David";
		randPrenomM[14] = "Jean";
		randPrenomM[15] = "Kevin";
		randPrenomM[16] = "William";
		randPrenomM[17] = "Eliot";
		randPrenomM[18] = "Louis";
		randPrenomM[19] = "Theo";
		
		// Base de données des prénoms féminin aléatoires //
		
		randPrenomF[0] = "Julie";
		randPrenomF[1] = "Lea";
		randPrenomF[2] = "Laura";
		randPrenomF[3] = "Axelle";
		randPrenomF[4] = "Sarah";
		randPrenomF[5] = "Elise";
		randPrenomF[6] = "Brigitte";
		randPrenomF[7] = "Carole";
		randPrenomF[8] = "Jeanne";
		randPrenomF[9] = "Audrey";
		randPrenomF[10] = "Huguette";
		randPrenomF[11] = "Natalie";
		randPrenomF[12] = "Jessie";
		randPrenomF[13] = "Isabelle";
		randPrenomF[14] = "Celina";
		randPrenomF[15] = "Camille";
		randPrenomF[16] = "Anne";
		randPrenomF[17] = "Lucie";
		randPrenomF[18] = "Louise";
		randPrenomF[19] = "Manon";
		
		// Bases de données des noms de familles aléatoires //
		
		randNom[0] = "Petit";
		randNom[1] = "Durand";
		randNom[2] = "Peralta";
		randNom[3] = "Leroux";
		randNom[4] = "Picard";
		randNom[5] = "Fournier";
		randNom[6] = "Leroy";
		randNom[7] = "Snively";
		randNom[8] = "Guyot";
		randNom[9] = "Cordier";
		randNom[10] = "Pichon";
		randNom[11] = "Pasquier";
		randNom[12] = "Carlier";
		randNom[13] = "Vasseur";
		randNom[14] = "Weber";
		randNom[15] = "Muller";
		randNom[16] = "Aubert";
		randNom[17] = "Fabre";
		randNom[18] = "Schneider";
		randNom[19] = "Hernandez";
		randNom[20] = "Leger";
		randNom[21] = "Millet";
		randNom[22] = "Pereira";
		randNom[23] = "Gonzalez";
		randNom[24] = "Coste";
		randNom[25] = "Bourdon";
		randNom[26] = "Seguin";
		randNom[27] = "De la Fontaine";
		randNom[28] = "Lunda";
		randNom[29] = "Sabia";
		
		
	//...Initialisation de la police........
		
		Font font = new Font("Arial",Font.BOLD,40);
		Font font2 = new Font("Ubuntu", Font.BOLD, 20);
		Font font3 = new Font("Ubuntu", Font.BOLD, 30);
		
	//.....Initialisation du panel............
		
		persCreationPane = new JPanel();
		persCreationPane.setLayout(new GridLayout(1, 2));
		persoCrea = new JLabel("Cr�ation d'un personnage");
		persoCrea.setFont(font);
		main = new JPanel();
		
	//...Inistialisation de Left Panel..........
		
		sexe = new JLabel();
		sexe.setText("Sexe");
		sexe.setFont(font2);
		newsexe = new JComboBox<>();
		newsexe.addItem("Masculin");
		newsexe.addItem("Feminin");
				
		nom = new JLabel();
		nom.setText("Nom");
		nom.setFont(font2);
		newnom = new JTextField();
		newnom.setFont(font2);
				
		prenom = new JLabel();
		prenom.setText("Prenom");
		prenom.setFont(font2);
		newprenom = new JTextField();
		newprenom.setFont(font2);
				
		age = new JLabel();
		age.setText("Age");
		age.setFont(font2);
		newage = new JSpinner();
				
		left = new JPanel();
		left.add(sexe);
		left.add(newsexe);
		left.add(nom);
		left.add(newnom);
		left.add(prenom);
		left.add(newprenom);
		left.add(age);
		left.add(newage);
		left.setLayout(new BoxLayout(left, 1));
		persCreationPane.add(left);
		
	//...Initialisation de topRight Panel....
		
		list = new JList<>();
		list.setFont(font3);
		mod  = new DefaultListModel<>();
		topRight = new JPanel();
		topRight.add(list);
		
	//...Initiamlisation de bottomRight.....
		
		creer = new JButton("Creer");
		creer.addActionListener(this);
		aleatoire = new JButton("Creer personnage al�atoirment");
		aleatoire.addActionListener(this);
		bottomRight = new JPanel();
		bottomRight.add(creer);
		bottomRight.add(aleatoire);
		bottomRight.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		creer.setPreferredSize(new Dimension(87, 53));
		aleatoire.setPreferredSize(new Dimension(250, 53));
		
	//....Iniitialisation right..........
		
		right = new JPanel();
		right.add(topRight);
		right.add(bottomRight);
		right.setLayout(new BoxLayout(right, 1));
				
		persCreationPane.add(right);
		
	//....Initialisation panel priincipale et son layout...
		
		jouer = new JButton("Commencer la partie");
				
		main.add(persoCrea);
		main.add(persCreationPane);
		main.add(jouer);
		main.setLayout(new BoxLayout(main, 1));
		jouer.setPreferredSize(new Dimension(87, 70));
				
	//...Initialisation du JComboBox......
		
		newsexe = new JComboBox<>();
		newsexe.addItem("Masculin");
		newsexe.addItem("Feminin");
		newsexe.setSelectedIndex(0);
	}		
	
	/**
	 * Add a character to the game
	 * 
	 * @see JTextField#getText()
	 * @see JSpinner#getValue()
	 * @see DefaultListModel#addElement(Object)
	 * @see JList#setModel(javax.swing.ListModel)
	 */
	public void ajout() {
		String info;
		info = newprenom.getText()+" "+newnom.getText()+", "+newage.getValue()+" ans";
		mod.addElement(info);
		list.setModel(mod);
	}
	
	/**
	 * Add a random character to the game
	 * @param nom
	 * @param prenom
	 * @param age
	 * @see DefaultListModel#addElement(Object)
	 * @see JList#setModel(javax.swing.ListModel)
	 */
	public void ajout_aleatoire(String nom, String prenom, int age) {
		String info = prenom+" "+nom+", "+age+" ans";
		mod.addElement(info);
		list.setModel(mod);
	}
	
	/**
	 * Return the JButton jouer in the character creation frame
	 * @return jouer
	 */
	public JButton getJouer() {
		return jouer;
	}
	
	/**
	 * set the JButton jouer in the character creation frame
	 * @param jouer
	 */
	public void setJouer(JButton jouer) {
		this.jouer = jouer;
	}
	
	/**
	 * Wait an action to be performed, react to the action to click on add a character or add a random character
	 * 
	 * @see ActionEvent#getSource()
	 * @see World#getAllCitizens()
	 * @see ArrayList#size()
	 * @see JTextField#getText()
	 * @see JComboBox#getSelectedItem()
	 * @see Object#toString()
	 * @see ArrayList#add(Object)
	 * @see Random#nextInt(int)
	 * @see PersoCreation#ajout_aleatoire(String, String, int)
	 */
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == creer) {
			
			if(world.getAllCitizens().size() <5) {
				ajout();
				Personnage perso = new Personnage(newnom.getText(), newprenom.getText(), newsexe.getSelectedItem().toString(), 45,146,167, 159, 156);
				world.getAllCitizens().add(perso);
			}
			else {
				System.out.println("Le nombre maximal de personnage est atteint");
			}
		}
		
		if(e.getSource() == aleatoire) {
			
			if(world.getAllCitizens().size() <5) {
				
				if(rand.nextInt(2) == 1) {
					String fname = randPrenomM[rand.nextInt(20)];
					String name = randNom[rand.nextInt(30)];
					String sex = "Masculin";
				    int age = 18 + rand.nextInt(80);
				    ajout_aleatoire(name, fname, age);
					Personnage perso = new Personnage(fname, name, sex, age);
					world.getAllCitizens().add(perso);
					
				}
				else {
					String fname = randPrenomF[rand.nextInt(20)];
					String name = randNom[rand.nextInt(30)];
					String sex = "Feminin";
					int age = 18 + rand.nextInt(80);
					ajout_aleatoire(name, fname, age);
					Personnage perso = new Personnage(fname, name, sex, age);
					world.getAllCitizens().add(perso);
					
				}
				
			}
			else {
				System.out.println("Le nombre maximal de personnage est atteint");
			}
		}
		
	}
	
	/**
	 * Return the object World
	 * @return world
	 */
	public World getWorld() {
		return world;
	}

	/**
	 * Set the object World
	 * @param world
	 */
	public void setWorld(World world) {
		this.world = world;
	}
	
	/**
	 * Return the JPanel main, the JPanel of the character creation frame 
	 * @return main
	 */
	public JPanel getMain() {
		return main;
	}

	/**
	 * Set the JPanel main, the JPanel of the character creation frame
	 * @param main
	 */
	public void setMain(JPanel main) {
		this.main = main;
	}

	/**
	 * Return the persCreationPane
	 * @return persCreationPane
	 */
	public JPanel getPersCreationPane() {
		return persCreationPane;
	}
	
	/**
	 * Set the persCreationPane
	 * @param persCreationPane
	 */
	public void setPersCreationPane(JPanel persCreationPane) {
		this.persCreationPane = persCreationPane;
	}
	
	
}

	
