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
	
	public int faimMaxMin(int faim) {
		
		if (faim > 500) {
			
			faim = 500;
		}
		else if(faim < 0) {
			
			faim = 0;
		}
		return faim;
	}
	
	public int energieMaxMin(int energie) {
		
		if (energie> 500) {
			
			energie = 500;
		}
		else if(energie < 0) {
			
			energie = 0;
		}
		return energie;
	}
	
	public int divertissementMaxMin(int divertissement) {
		
		if (divertissement > 500) {
			
			divertissement = 500;
		}
		else if(divertissement < 0) {
			
			divertissement = 0;
		}
		return divertissement;
	}
	
	public int socialMaxMin(int social) {
		
		if (social > 500) {
			
			social = 500;
		}
		else if(social < 0) {
			
			social = 0;
		}
		return social;
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
		if(temps <= 5) {
			setFaim(getFaim() - 1);
			setDivertissement(getDivertissement() - 1);
			setSocial(getSocial() - 1);
			setEnergie(getEnergie() - 1);
		}
	}
	
}
