package perso;

import java.util.Stack;

import ihm.MainWindow;
import ville.BatimentCible;

/**
 * @author Quentin Liguori
 * Contains all the data on a character
 */
public class Personnage {
	private String nom;
	private String prenom;
	private int positionX;
	private int positionY;
	private String sexe;
	private int age;
	private Besoin besoin;
	private Comportement comportement;
	private ListeAction planningjournee;
	public  Stack<Action> stack = new Stack<Action>();
	public boolean occuped;

	/**
	 * Constructor of Personnage with premade Needs
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param age
	 */
	public Personnage(String nom, String prenom, String sexe, int age) {
		
		besoin = new Besoin();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
		positionX = 100;
		positionY = 100;
				
	}
	
	/**
	 * Constructor of Personnage with personnalized needs
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param age
	 * @param energy
	 * @param divertissement
	 * @param social
	 * @param hunger
	 */
	public Personnage(String nom, String prenom, String sexe, int age, int energy, int divertissement, int social, int hunger, boolean occuped) {
		
		besoin = new Besoin(hunger, energy, divertissement, social);
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
		occuped = false;
				
	}
	public Stack<Action> getStack() {
		return stack;
	}

	public void setStack(Stack<Action> stack) {
		this.stack = stack;
	}
	public void setOccuped(boolean occuped) {
		this.occuped = occuped;
	}

	public boolean isOccuped() {
		return occuped;
	}

	/**
	 * Get the Name and the FirstName and return it in one String
	 * @return Prenomnom
	 */
	public String getPrenomNom() {
		
		return prenom+" "+ nom;
	}
	
	/**
	 * Return the position in X
	 * @return positionX
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * Set the position in X
	 * @param positionX
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	/**
	 * Return the position in Y
	 * @return positionY
	 */
	public int getPositionY() {
		return positionY;
	}

	/**
	 * Set the position in Y
	 * @param positionY
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	/**
	 * Get the name of the character
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Set the name of the character
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Get the firstname of the character
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Set the firstname of the character
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Get the sex of the character
	 * @return sexe
	 */
	public String getSexe() {
		return sexe;
	}
	
	/**
	 * Set the sex of the character
	 * @param sexe
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	/**
	 * Get the age of the character
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Set the age of the character
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Get the needs of the character
	 * @return besoin
	 */
	public Besoin getBesoin() {
		return besoin;
	}
	
	/**
	 * Set the needs of the character
	 * @param besoin
	 */
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
	public String affDay() {
		stack = planningjournee.createDay();
		String day = "";
		Action act;
		while(planningjournee.see()!= null) {
			act = planningjournee.see();
			day = act.toString();
		}
		return day;
	}
	public boolean searchByNamePerso(String name) {
		boolean result = false;
        for (int index = 0; index < MainWindow.occupedPerso.size(); index++) {
                Personnage perso = MainWindow.occupedPerso.get(index);
                if (perso.getPrenomNom().equals(name)) {
    				result = true;
    			}
        }
        if (result == false) {
			System.out.println("Perso " + name + " not occuped.");
			return result;
		} else {
			return result;
		}
	}
}
