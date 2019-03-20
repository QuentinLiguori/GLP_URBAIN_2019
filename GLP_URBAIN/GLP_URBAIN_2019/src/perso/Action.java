package perso;

import ville.BatimentCible;
public class Action {
	public Action(String type) {
		super();
		this.type = type;
	}	
	private String type;
	
	public Action() {
		
	}
	public void manger(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY() && type.equals(bat.getFonction())) {
			Besoin bes = perso.getBesoin();
			bes.setFaim(bes.getFaim()+bat.getValeur()/**"temps"*/);
			perso.setBesoin(bes);			
		}
	}
	public void dormir(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY() && type.equals(bat.getFonction())) {
			Besoin bes = perso.getBesoin();
			bes.setEnergie(bes.getEnergie()+bat.getValeur()/**"temps"*/);
			perso.setBesoin(bes);			
		}
	}
	public void divertir(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY() && type.equals(bat.getFonction())) {
			Besoin bes = perso.getBesoin();
			bes.setDivertissement((bes.getDivertissement()+bat.getValeur()/**"temps"*/));
			perso.setBesoin(bes);			
		}
	}
	public void social(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY() && type.equals(bat.getFonction())) {
			Besoin bes = perso.getBesoin();
			bes.setSocial((bes.getSocial()+bat.getValeur()/**"temps"*/));
			perso.setBesoin(bes);			
		}
	}
	public void deplacer(BatimentCible bat, Personnage perso) {
		perso.setPositionX(bat.getPosXporte());
		perso.setPositionY(bat.getPosYporte());
	}
	public String toString() {
		return "Action [type=" + type + "]";
	}
}
