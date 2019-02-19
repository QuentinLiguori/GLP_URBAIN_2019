package perso;

import ville.BatimentCible;

public class Personnage {
	private String nom;
	private String prenom;
	private int positionX;
	private int positionY;
	private String sexe;
	private int age;
	private BatimentCible adress;
	private Emotion emotion;
	private Besoin besoin;
	private Comportement comportement;
	private ListeAction planningjournee;
	
	public Personnage(String nom, String prenom, String sexe, int age) {
		
		besoin = new Besoin();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
				
	}
	public Personnage(String nom, String prenom, String sexe, int age, int energy, int divertissement, int social, int hunger) {
		
		besoin = new Besoin(hunger, energy, divertissement, social);
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
				
	}
	
	public String getPrenomNom() {
		
		return prenom+" "+ nom;
	}
	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public String getNom() {
		
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public Emotion getEmotion() {
		return emotion;
	}

	public void setEmotion(Emotion emotion) {
		this.emotion = emotion;
	}

	public Besoin getBesoin() {
		return besoin;
	}

	public void setBesoin(Besoin besoin) {
		this.besoin = besoin;
	}

	public Comportement getComportement() {
		return comportement;
	}

	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}

	public ListeAction getPlanningjournee() {
		return planningjournee;
	}

	public void setPlanningjournee(ListeAction planningjournee) {
		this.planningjournee = planningjournee;
	}
	
}
