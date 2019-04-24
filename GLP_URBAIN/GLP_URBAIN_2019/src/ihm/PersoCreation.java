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

public class PersoCreation implements ActionListener{
	
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
	
	public PersoCreation() {
		
		world = new World();
		
	//...Initialisation de la police........
		
		Font font = new Font("Arial",Font.BOLD,40);
		Font font2 = new Font("Ubuntu", Font.BOLD, 20);
		Font font3 = new Font("Ubuntu", Font.BOLD, 30);
		
	//.....Initialisation du panel............
		
		persCreationPane = new JPanel();
		persCreationPane.setLayout(new GridLayout(1, 2));
		persoCrea = new JLabel("Création d'un personnage");
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
				
		prenom = new JLabel();
		prenom.setText("Prenom");
		prenom.setFont(font2);
		newprenom = new JTextField();
				
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
		aleatoire = new JButton("Creer personnage aléatoirment");
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
	
	public void ajout() {
		String info;
		info = newprenom.getText()+" "+newnom.getText()+", "+newage.getValue()+" ans";
		mod.addElement(info);
		list.setModel(mod);
	}
	
	public void ajout_aleatoire(String nom, String prenom, int age) {
		String info = prenom+" "+nom+", "+age+" ans";
		mod.addElement(info);
		list.setModel(mod);
	}
	public JButton getJouer() {
		return jouer;
	}

	public void setJouer(JButton jouer) {
		this.jouer = jouer;
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == creer) {
			
			if(world.getAllCitizens().size() <5) {
				ajout();
				Personnage perso = new Personnage(newnom.getText(), newprenom.getText(), newsexe.getSelectedItem().toString(), 45,146,167, 159, 156);
				world.getAllCitizens().add(perso);
				System.out.println(world.getAllCitizens());
			}
			else {
				System.out.println("Le nombre maximal de personnage est atteint");
			}
		}
		
		if(e.getSource() == aleatoire) {
			
			if(world.getAllCitizens().size() <5) {
				String fname = "Jack";
				String name = "Peralta";
				String sex = "Masculin";
			    int age = 30;
			    ajout_aleatoire(name, fname, age);
				Personnage perso = new Personnage(fname, name, sex, age);
				world.getAllCitizens().add(perso);
				System.out.println(world.getAllCitizens());

				
			}
			else {
				System.out.println("Le nombre maximal de personnage est atteint");
			}
		}
		
	}
	
	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public JPanel getMain() {
		return main;
	}

	public void setMain(JPanel main) {
		this.main = main;
	}

	public JPanel getPersCreationPane() {
		return persCreationPane;
	}

	public void setPersCreationPane(JPanel persCreationPane) {
		this.persCreationPane = persCreationPane;
	}
	
	
}

	
