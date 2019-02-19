package world;

import java.util.ArrayList;

import perso.Personnage;

public class World {
	
	private ArrayList<Personnage> allCitizens;
	
	public ArrayList<Personnage> getAllCitizens(){
		
		return allCitizens;
	}
	public World() {
		
		Personnage jeanDuche = new Personnage("Duche","Jean", "masculin",54,367,247,189,91);
		Personnage robertPate = new Personnage("Pate", "Robert", "masculin", 45,12,34,467,236);
		Personnage christianeDupont = new Personnage("Dupont", "Christiane", "feminin", 39, 409, 394,158,100);
		
		allCitizens = new ArrayList<>();
		allCitizens.add(jeanDuche);
		allCitizens.add(robertPate);
		allCitizens.add(christianeDupont);
		
	}
}
