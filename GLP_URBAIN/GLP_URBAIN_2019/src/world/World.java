package world;

import java.util.ArrayList;

import perso.Personnage;

public class World {
	
	private ArrayList<Personnage> allCitizens;
	
	public ArrayList<Personnage> getAllCitizens(){
		
		return allCitizens;
	}
	public World() {
		
		allCitizens = new ArrayList<>();
	}
	public Personnage searchCitizen(int index) {
		
		return getAllCitizens().get(index);
	}
}
