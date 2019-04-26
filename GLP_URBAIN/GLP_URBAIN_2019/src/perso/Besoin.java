package perso;

/**
 * Contains the need of a character
 * @author Quentin Liguori
 *
 */
public class Besoin {
	private int faim;
	private int energie;
	private int divertissement;
	private int social;
	
	/**
	 * Constructor of Besoin, Initialize the needs to the maximum
	 */
	public Besoin() {
		
		faim = 500;
		energie = 500;
		divertissement = 500;
		social = 500;
	}
	
	/**
	 * Constructor of Besoin, Initialise the needs to the value in parameters
	 * @param faim
	 * @param energie
	 * @param divertissement
	 * @param social
	 */
	public Besoin(int faim,int energie,int divertissement,int social) {
		
		this.faim = faim;
		this.divertissement = divertissement;
		this.energie = energie;
		this.social = social;
	}
	
	/**
	 * Prend en paramètre un besoin, vérifie qu'il se trouve bien entre 0 et 500
	 * @param bes
	 * @return bes
	 */
	public int besoinMaxMin(int bes) {
		
		if (bes > 500) {
			
			bes = 500;
		}
		else if(bes < 0) {
			
			bes = 0;
		}
		return bes;
	}
	
	/**
	 * Return the value of faim
	 * @return faim
	 */
	public int getFaim() {
		return faim;
	}
	
	/**
	 * Set the value of faim
	 * @param faim
	 */
	public void setFaim(int faim) {
		this.faim = faim;
	}

	/**
	 * Return the value of energie
	 * @return energie
	 */
	public int getEnergie() {
		return energie;
	}
	
	/**
	 * Set the value of energie
	 * @param energie
	 */
	public void setEnergie(int energie) {
		this.energie = energie;
	}
	
	/**
	 * Return the value of divertissement
	 * @return divertissement
	 */
	public int getDivertissement() {
		return divertissement;
	}
	
	/**
	 * Set the value of divertissement
	 * @param divertissement
	 */
	public void setDivertissement(int divertissement) {
		this.divertissement = divertissement;
	}

	/**
	 * Return the value of Social
	 * @return social
	 */
	public int getSocial() {
		return social;
	}

	/**
	 * Set the Value of social
	 * @param social
	 */
	public void setSocial(int social) {
		this.social = social;
	}
	
	/**
	 * Update needs every seconds
	 * @param temps
	 * 
	 * @see Besoin#besoinMaxMin(int)
	 * @see Besoin#getFaim()
	 * @see Besoin#setFaim(int)
	 * @see Besoin#getDivertissement()
	 * @see Besoin#setDivertissement(int)
	 * @see Besoin#getSocial()
	 * @see Besoin#setSocial(int)
	 * @see Besoin#getEnergie()
	 * @see Besoin#setEnergie(int)
	 */
	public void updateBesoin(int temps) {
		if(temps <= 1) {
			setFaim(besoinMaxMin(getFaim() - 1));
			setDivertissement(besoinMaxMin(getDivertissement() - 1));
			setSocial(besoinMaxMin(getSocial() - 1));
			setEnergie(besoinMaxMin(getEnergie() - 1));
		}
	}
	
}
