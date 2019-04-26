package perso;

import ville.BatimentCible;

/**
 * Manage the action of characters
 * @author Quentin Liguori
 *
 */
public class Action {	
	private String type;
	private String batiment;
	private Personnage personnage;
	public Action(String type,String batiment) {
		super();
		this.type = type;
		this.batiment = batiment;
	}
	public String getBatiment() {
		return batiment;
	}
	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}
	public Personnage getPersonnage() {
		return personnage;
	}
	public void setPersonnage(Personnage personnage) {
		this.personnage = personnage;
	}
	public Action(String type) {
		super();
		this.type = type;
	}	
	public Action() {
		super();
	}	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * Action to eat, to eat the character need to bee in a place where he can eat
	 * @param bat
	 * @param perso
	 * 
	 * @see BatimentCible#getPosXporte()
	 * @see BatimentCible#getPosYporte()
	 * @see Personnage#getPositionX()
	 * @see Personnage#getPositionY()
	 * @see Personnage#getBesoin()
	 * @see Besoin#getFaim()
	 * @see Besoin#setFaim(int)
	 * @see BatimentCible#getValeur()
	 * @see Personnage#setBesoin(Besoin)
	 */
	public void manger(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setFaim(bes.getFaim()+bat.getValeur()/**"temps"*/);
			bes.setFaim(bes.besoinMaxMin(bes.getFaim()));
			perso.setBesoin(bes);	
		}
	}
	
	/**
	 * Action to Sleep, to eat the character need to bee in a place where he can restore Energy
	 * @param bat
	 * @param perso
	 * 
	 * @see BatimentCible#getPosXporte()
	 * @see BatimentCible#getPosYporte()
	 * @see Personnage#getPositionX()
	 * @see Personnage#getPositionY()
	 * @see Personnage#getBesoin()
	 * @see Besoin#getEnergie()
	 * @see Besoin#setEnergie(int)
	 * @see BatimentCible#getValeur()
	 * @see Personnage#setBesoin(Besoin)
	 */
	public void dormir(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setEnergie(bes.getEnergie()+bat.getValeur()/**"temps"*/);
			bes.setEnergie(bes.besoinMaxMin(bes.getEnergie()));
			perso.setBesoin(bes);			
		}
	}
	
	/**
	 * Action to have fun, to eat the character need to bee in a place where he can restore Se divertir
	 * @param bat
	 * @param perso
	 * 
	 * @see BatimentCible#getPosXporte()
	 * @see BatimentCible#getPosYporte()
	 * @see Personnage#getPositionX()
	 * @see Personnage#getPositionY()
	 * @see Personnage#getBesoin()
	 * @see Besoin#getDivertissement()
	 * @see Besoin#setDivertissement(int)
	 * @see BatimentCible#getValeur()
	 * @see Personnage#setBesoin(Besoin)
	 */
	public void divertir(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setDivertissement((bes.getDivertissement()+bat.getValeur()/**"temps"*/));
			bes.setDivertissement(bes.besoinMaxMin(bes.getDivertissement()));
			perso.setBesoin(bes);			
		}
	}
	
	/**
	 * Action to Socialize, to eat the character need to bee in a place where he can restore social
	 * @param bat
	 * @param perso
	 * 
	 * @see BatimentCible#getPosXporte()
	 * @see BatimentCible#getPosYporte()
	 * @see Personnage#getPositionX()
	 * @see Personnage#getPositionY()
	 * @see Personnage#getBesoin()
	 * @see Besoin#getSocial()
	 * @see Besoin#setSocial(int)
	 * @see BatimentCible#getValeur()
	 * @see Personnage#setBesoin(Besoin)
	 */
	public void social(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setSocial((bes.getSocial()+bat.getValeur()/**"temps"*/));
			bes.setSocial(bes.besoinMaxMin(bes.getSocial()));
			perso.setBesoin(bes);			
		}
	}
	
	/**
	 * Move the character to the building he must go
	 * @param bat
	 * @param perso
	 * 
	 * @see BatimentCible#getPosXporte()
	 * @see BatimentCible#getPosYporte()
	 * @see Personnage#getPositionX()
	 * @see Personnage#getPositionY()
	 */
	public void deplacer(BatimentCible bat, Personnage perso) {
		perso.setPositionX(bat.getPosXporte());
		perso.setPositionY(bat.getPosYporte());
	}
	
	/**
	 * 
	 */
	public String toString() {
		return "Action [type=" + type + "]";
	}
}
