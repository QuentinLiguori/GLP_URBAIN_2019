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
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setFaim(bes.getFaim()+bat.getValeur()/**"temps"*/);
			bes.setFaim(bes.besoinMaxMin(bes.getFaim()));
			perso.setBesoin(bes);	
		}
	}
	public void dormir(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setEnergie(bes.getEnergie()+bat.getValeur()/**"temps"*/);
			bes.setEnergie(bes.besoinMaxMin(bes.getEnergie()));
			perso.setBesoin(bes);			
		}
	}
	public void divertir(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setDivertissement((bes.getDivertissement()+bat.getValeur()/**"temps"*/));
			bes.setDivertissement(bes.besoinMaxMin(bes.getDivertissement()));
			perso.setBesoin(bes);			
		}
	}
	public void social(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setSocial((bes.getSocial()+bat.getValeur()/**"temps"*/));
			bes.setSocial(bes.besoinMaxMin(bes.getSocial()));
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
