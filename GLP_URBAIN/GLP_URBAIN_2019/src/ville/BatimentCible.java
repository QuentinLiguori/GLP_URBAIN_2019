package ville;

import donnee.Point;

public class BatimentCible {
	private Point hautGauche;
	private Point basDroite;
	private String fonction;
	private int capacite;
	private int capacitemax;
	private String nom;
	private int ouverture;
	private int fermeture;
	private int valeur;
	
	public BatimentCible(String nom, String fonction, int capacite, int capacitemax, int ouverture, int fermeture, Point hautGauche, Point basDroite, int valeur) {
		this.nom = nom;
		this.fonction = fonction;
		this.capacite = capacite;
		this.capacitemax = capacitemax;
		this.ouverture = ouverture;
		this.fermeture = fermeture;
		this.valeur = valeur;
		this.basDroite = basDroite;
		this.hautGauche = hautGauche;
		
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public BatimentCible() {
		
	}
	
	public Point getHautGauche() {
		return hautGauche;
	}
	public void setHautGauche(Point hautGauche) {
		this.hautGauche = hautGauche;
	}
	public Point getBasDroite() {
		return basDroite;
	}
	public void setBasDroite(Point basDroite) {
		this.basDroite = basDroite;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public int getCapacitemax() {
		return capacitemax;
	}
	public void setCapacitemax(int capacitemax) {
		this.capacitemax = capacitemax;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getOuverture() {
		return ouverture;
	}
	public void setOuverture(int ouverture) {
		this.ouverture = ouverture;
	}
	public int getFermeture() {
		return fermeture;
	}
	public void setFermeture(int fermeture) {
		this.fermeture = fermeture;
	}
	
}
