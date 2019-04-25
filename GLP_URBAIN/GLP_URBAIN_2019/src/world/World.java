package world;

import java.util.ArrayList;

import perso.Personnage;

/**
 * Contains all the citizens in the city
 * @author Quentin Liguori
 *
 */
public class World {
	
	private ArrayList<Personnage> allCitizens;
	
	public ArrayList<Personnage> getAllCitizens(){
		
		return allCitizens;
	}
	
	/**
	 * Constructor of World, initialize the ArrayList who contain all the characters
	 */
	public World() {
		
		allCitizens = new ArrayList<>();
	}
	
	/**
	 * Return the search Citizens in the ArrayList
	 * @param index
	 * @return Personnage
	 */
	public Personnage searchCitizen(int index) {
		
		return getAllCitizens().get(index);
	}
}
