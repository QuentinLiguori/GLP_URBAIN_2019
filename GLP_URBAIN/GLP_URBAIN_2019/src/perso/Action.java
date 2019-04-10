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
		System.out.println(bat.getPosXporte());
		System.out.println(perso.getBesoin().getFaim());
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setFaim(bes.getFaim()+bat.getValeur()/**"temps"*/);
			perso.setBesoin(bes);	
			System.out.println(perso.getBesoin().getFaim());
		}
	}
	public void dormir(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setEnergie(bes.getEnergie()+bat.getValeur()/**"temps"*/);
			perso.setBesoin(bes);			
		}
	}
	public void divertir(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setDivertissement((bes.getDivertissement()+bat.getValeur()/**"temps"*/));
			perso.setBesoin(bes);			
		}
	}
	public void social(BatimentCible bat, Personnage perso) {
		if(bat.getPosXporte() == perso.getPositionX() && bat.getPosYporte() == perso.getPositionY()) {
			Besoin bes = perso.getBesoin();
			bes.setSocial((bes.getSocial()+bat.getValeur()/**"temps"*/));
			perso.setBesoin(bes);			
		}
	}
	public void deplacer(BatimentCible bat, Personnage perso) {
		perso.setPositionX(bat.getPosXporte());
		perso.setPositionY(bat.getPosYporte());
		System.out.println(perso.getPositionX());
		System.out.println(perso.getPositionY());
	}
	public String toString() {
		return "Action [type=" + type + "]";
	}
}
