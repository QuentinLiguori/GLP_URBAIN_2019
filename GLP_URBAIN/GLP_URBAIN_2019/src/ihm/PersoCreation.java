package ihm;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import perso.Personnage;
import world.World;

public class PersoCreation implements ActionListener{
	
	private JButton creer;
	private JButton aleatoire;
	private JButton jouer;
	private JLabel creaPerso;
	private JLabel nom;
	private JLabel prenom;
	private JLabel age;
	private JLabel sexe;	
	private JTextField newnom;
	private JTextField newprenom;
	private JTextField newage;
	private JComboBox<String> newsexe;
	private JPanel persCreationPane;
	private JPanel topLeft;
	private JPanel topRight;
	private JPanel bottomLeft;
	private JPanel bottomRight;
	private JPanel main;
	private World world;
	
	public PersoCreation() {
		
		world = new World();
		
		// Initialisation de la police //
		
				Font font = new Font("Arial",Font.BOLD,30);
				Font font2 = new Font("Ubuntu", Font.BOLD, 20);
		// Initialisation du panel principal //
		
		persCreationPane = new JPanel();
		persCreationPane.setLayout(new GridLayout(2, 2));
		creaPerso = new JLabel();
		creaPerso.setText("Création d'un personnage");
		creaPerso.setFont(font);
		main = new JPanel();
		
		
		
		
		// Initialisation of the top left panel //
		
		nom = new JLabel();
		nom.setText("Nom");
		nom.setFont(font2);
		newnom = new JTextField();
		
		prenom = new JLabel();
		prenom.setText("Prenom");
		prenom.setFont(font2);
		newprenom = new JTextField();
		
		topLeft = new JPanel();
		topLeft.add(nom);
		topLeft.add(newnom);
		topLeft.add(prenom);
		topLeft.add(newprenom);
		topLeft.setLayout(new BoxLayout(topLeft, 1));
		persCreationPane.add(topLeft);
		
		// Initialisation of the top right panel //
		
		sexe = new JLabel();
		sexe.setText("Sexe");
		sexe.setFont(font2);
		newsexe = new JComboBox<>();
		newsexe.addItem("Masculin");
		newsexe.addItem("Feminin");
		
		age = new JLabel();
		age.setText("Age");
		age.setFont(font2);
		newage = new JTextField();
		
		topRight = new JPanel();
		topRight.add(sexe);
		topRight.add(newsexe);
		topRight.add(age);
		topRight.add(newage);
		topRight.setLayout(new BoxLayout(topRight, 1));
		persCreationPane.add(topRight);
		
		// Initialisation des Bouttons //
		
		creer = new JButton();
		creer.setText("Créer");
		creer.addActionListener(this);
		
		bottomLeft = new JPanel();
		bottomLeft.add(creer);
		persCreationPane.add(bottomLeft);
		
		aleatoire = new JButton();
		aleatoire.setText("Créer un personnage aléatoirement");
		bottomRight = new JPanel();
		bottomRight.add(aleatoire);
		persCreationPane.add(bottomRight);
		
		
		// Initialisation du panel principal et de son boxLayout //
		
		jouer = new JButton();
		jouer.setText("Jouer");
		
		main.add(creaPerso);
		main.add(persCreationPane);		
		main.add(jouer);
		main.setLayout(new BoxLayout(main, 1));
		
		
		
		// Initialisation du JComboBox //
		
		newsexe = new JComboBox<>();
		newsexe.addItem("Masculin");
		newsexe.addItem("Feminin");
		newsexe.setSelectedIndex(0);
	
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == creer) {
			
			if(world.getAllCitizens().size() <5) {
				
				Personnage perso = new Personnage(newnom.getText(), newprenom.getText(), newsexe.getSelectedItem().toString(), 45);
				world.getAllCitizens().add(perso);
			}
			else {
				System.out.println("Le nombre maximal de personnage est atteint");
			}
		}
		
		if(e.getSource() == aleatoire) {
			
			if(world.getAllCitizens().size() <5) {
				
				Personnage perso = new Personnage("Gerard", "Dupond", "Masculin", 45);
				world.getAllCitizens().add(perso);
			}
		}
		
		if(e.getSource() == jouer) {
			
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
