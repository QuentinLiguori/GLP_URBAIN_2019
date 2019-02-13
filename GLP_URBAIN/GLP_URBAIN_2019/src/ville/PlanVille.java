package ville;

import java.util.HashMap;

public class PlanVille {
	private int[][] plan;
	private int horizontal;
	private int vertical;
	private int dimHorizontale = 60;
	private int dimVerticale = 29;
	private HashMap<String,BatimentCible> batiments;
	private HashMap<String,Route> routes;
	
	public PlanVille(int horizontal, int vertical,int dimHorizontale,int dimVerticale) {
		this.horizontal = horizontal;
		this.vertical = vertical;
		this.dimHorizontale = dimHorizontale;
		this.dimVerticale = dimVerticale;
		plan = new int [dimVerticale][dimHorizontale];
		
//******************Creation des batiments****************************************//
		BatimentCible resto2 = new BatimentCible("RestoItalien","Manger",8,0,50,11,23,15);
		batiments.put("RestoItalien",resto2);
		BatimentCible home1 = new BatimentCible("Home1","Habitation", 1,1,4,5,23,11);
		batiments.put("Home1",home1);
		BatimentCible home2 = new BatimentCible("Home2","Habitation", 2,1,4,5,23,11);
		batiments.put("Home2",home2);
		BatimentCible home3 = new BatimentCible("Home3","Habitation", 3,1,4,5,23,11);
		batiments.put("Home3",home3);
		BatimentCible home4 = new BatimentCible("Home4","Habitation", 4,1,4,5,23,11);
		batiments.put("Home4",home4);
		BatimentCible cinema = new BatimentCible("Cinema","Détente", 7,0,45,10,22,12);
		batiments.put("Cinema",cinema);
		BatimentCible bar = new BatimentCible("Bar","Détente", 12,0,52,12,23,14);
		batiments.put("Bar",bar);
		BatimentCible parc = new BatimentCible("Parc","Détente", 3,0,45,10,22,12);
		batiments.put("Parc",parc);
		BatimentCible burrau1 = new BatimentCible("Burreau1","Travail",6,0,30,7,17,15);
		batiments.put("Burreau1",burrau1);
		BatimentCible burrau2 = new BatimentCible("Burreau2","Travail",7,0,30,7,17,15);
		batiments.put("Burreau2",burrau2);
		BatimentCible resto1 = new BatimentCible("RestoChinoi","Manger",9,0,50,11,23,15);
		batiments.put("RestoChinoi",resto1);
		BatimentCible fastFood1 = new BatimentCible("FastFood1","Manger",10,0,25,11,23,15);
		batiments.put("FastFood1",fastFood1);
		BatimentCible hotel = new BatimentCible("Hotel","Habitation",5,0,70,5,23,11);
		batiments.put("Hotel",hotel);
		BatimentCible fastFood2 = new BatimentCible("FastFood2","Manger",11,0,25,11,23,15);
		batiments.put("FastFood2",fastFood2);
		
//************Initiatlisation du tableau**************************************//
		for(vertical = 0; vertical< dimVerticale; vertical++) {
			for(horizontal=0; horizontal< dimHorizontale; horizontal++) {
				plan[vertical][horizontal] = 0;
			}
		}
		for(vertical=0;vertical<8;vertical++) {
			for(horizontal=0;horizontal<16;horizontal++) {
				plan[vertical][horizontal]=1;
			}
		}
		for(vertical=0;vertical<8;vertical++) {
			for(horizontal=0;horizontal<16;horizontal++) {
				plan[vertical][horizontal]=1;
			}
		}
		for(vertical=0;vertical<7;vertical++) {
			for(horizontal=52;horizontal<60;horizontal++) {
				plan[vertical][horizontal]=1;
			}
		}
		for(vertical=9;vertical<15;vertical++) {
			for(horizontal=52;horizontal<60;horizontal++) {
				plan[vertical][horizontal]=1;
			}
		}
		for(vertical=17;vertical<22;vertical++) {
			for(horizontal=52;horizontal<60;horizontal++) {
				plan[vertical][horizontal]=1;
			}
		}
		for(vertical=24;vertical<29;vertical++) {
			for(horizontal=52;horizontal<60;horizontal++) {
				plan[vertical][horizontal]=1;
			}
		}
		for(vertical=21;vertical<29;vertical++) {
			for(horizontal=42;horizontal<50;horizontal++) {
				plan[vertical][horizontal]=1;
			}
		}
		for(vertical=10;vertical<16;vertical++) {
			for(horizontal=16;horizontal<26;horizontal++) {
				plan[vertical][horizontal]=3;
			}
		}
		for(vertical=25;vertical<29;vertical++) {
			for(horizontal=28;horizontal<40;horizontal++) {
				plan[vertical][horizontal]=3;
			}
		}
		for(vertical=8;vertical<19;vertical++) {
			for(horizontal=44;horizontal<50;horizontal++) {
				plan[vertical][horizontal]=3;
			}
		}
		for(vertical=0;vertical<6;vertical++) {
			for(horizontal=36;horizontal<50;horizontal++) {
				plan[vertical][horizontal]=4;
			}
		}
		for(vertical=19;vertical<29;vertical++) {
			for(horizontal=0;horizontal<8;horizontal++) {
				plan[vertical][horizontal]=4;
			}
		}
		for(vertical=0;vertical<8;vertical++) {
			for(horizontal=18;horizontal<22;horizontal++) {
				plan[vertical][horizontal]=6;
			}
		}
		for(vertical=25;vertical<29;vertical++) {
			for(horizontal=16;horizontal<26;horizontal++) {
				plan[vertical][horizontal]=6;
			}
		}
		for(vertical=10;vertical<16;vertical++) {
			for(horizontal=28;horizontal<33;horizontal++) {
				plan[vertical][horizontal]=6;
			}
		}
		for(vertical=0;vertical<8;vertical++) {
			for(horizontal=24;horizontal<34;horizontal++) {
				plan[vertical][horizontal]=7;
			}
		}
		for(vertical=18;vertical<23;vertical++) {
			for(horizontal=25;horizontal<33;horizontal++) {
				plan[vertical][horizontal]=7;
			}
		}
		for(vertical=19;vertical<29;vertical++) {
			for(horizontal=10;horizontal<14;horizontal++) {
				plan[vertical][horizontal]=8;
			}
		}
		for(vertical=18;vertical<23;vertical++) {
			for(horizontal=16;horizontal<24;horizontal++) {
				plan[vertical][horizontal]=8;
			}
		}
		for(vertical=10;vertical<17;vertical++) {
			for(horizontal=0;horizontal<14;horizontal++) {
				plan[vertical][horizontal]=9;
			}
		}
		for(vertical=10;vertical<23;vertical++) {
			for(horizontal=35;horizontal<42;horizontal++) {
				plan[vertical][horizontal]=9;
			}
		}
		plan[3][16] = 5;
		
		
	}
	
	

	public int getDimHorizontale() {
		return dimHorizontale;
	}



	public void setDimHorizontale(int dimHorizontale) {
		this.dimHorizontale = dimHorizontale;
	}



	public int getDimVerticale() {
		return dimVerticale;
	}



	public void setDimVerticale(int dimVerticale) {
		this.dimVerticale = dimVerticale;
	}



	public int[][] getPlan() {
		return plan;
	}



	public void setPlan(int[][] plan) {
		this.plan = plan;
	}



	public int getHorizontal() {
		return horizontal;
	}



	public void setHorizontal(int horizontal) {
		this.horizontal = horizontal;
	}



	public int getVertical() {
		return vertical;
	}



	public void setVertical(int vertical) {
		this.vertical = vertical;
	}
	




	public HashMap<String, BatimentCible> getBatiments() {
		return batiments;
	}

	public void setBatiments(HashMap<String, BatimentCible> batiments) {
		this.batiments = batiments;
	}

	public HashMap<String, Route> getRoutes() {
		return routes;
	}

	public void setRoutes(HashMap<String, Route> routes) {
		this.routes = routes;
	}

}
