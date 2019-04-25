package perso;

public class Besoin {
	private int faim;
	private int energie;
	private int divertissement;
	private int social;
	
	
	public Besoin() {
		
		faim = 500;
		energie = 500;
		divertissement = 500;
		social = 500;
	}
	public Besoin(int faim,int energie,int divertissement,int social) {
		
		this.faim = faim;
		this.divertissement = divertissement;
		this.energie = energie;
		this.social = social;
	}
	
	public int besoinMaxMin(int bes) {
		
		if (bes > 500) {
			
			bes = 500;
		}
		else if(bes < 0) {
			
			bes = 0;
		}
		return bes;
	}
	
	
	public int getFaim() {
		return faim;
	}

	public void setFaim(int faim) {
		this.faim = faim;
	}

	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public int getDivertissement() {
		return divertissement;
	}

	public void setDivertissement(int divertissement) {
		this.divertissement = divertissement;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}
	public void updateBesoin(int temps) {
		if(temps <= 1) {
			setFaim(besoinMaxMin(getFaim() - 1));
			setDivertissement(besoinMaxMin(getDivertissement() - 1));
			setSocial(besoinMaxMin(getSocial() - 1));
			setEnergie(besoinMaxMin(getEnergie() - 1));
		}
	}
	
}
