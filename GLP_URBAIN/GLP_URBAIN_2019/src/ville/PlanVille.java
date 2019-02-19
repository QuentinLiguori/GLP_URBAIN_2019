package ville;

import java.util.ArrayList;
import java.util.HashMap;
import donnee.Point;

public class PlanVille {
	private ArrayList<BatimentCible> batiments;
	private HashMap<String,Route> routes;
	
	public PlanVille() {
		
		batiments = new ArrayList<BatimentCible>();
//******************Creation des batiments****************************************//
		Point hgHomme1 = new Point(120,60);
		Point bgHomme1 = new Point(300,160);
		BatimentCible home1 = new BatimentCible("Home1","Habitation",1,4,5,23,hgHomme1,bgHomme1,350);
		batiments.add(home1);
		Point hgHomme2 = new Point(120,220);
		Point bgHomme2 = new Point(300,320);
		BatimentCible home2 = new BatimentCible("Home2","Habitation",1,4,5,23,hgHomme2,bgHomme2,350);
		batiments.add(home2);
		Point hgHomme3 = new Point(360,60);
		Point bgHomme3 = new Point(540,160);
		BatimentCible home3 = new BatimentCible("Home3","Habitation",1,4,5,23,hgHomme3,bgHomme3,11);
		batiments.add(home3);
		Point hgResto1 = new Point(360,220);
		Point bgResto1 = new Point(540,320);
		BatimentCible resto1 = new BatimentCible("RestoIndien","Manger",0,50,11,23,hgResto1,bgResto1,15);
		batiments.add(resto1);
		Point hgResto2 = new Point(120,450);
		Point bgResto2 = new Point(300,550);
		BatimentCible resto2 = new BatimentCible("RestoItalien","Manger",0,50,11,23,hgResto2,bgResto2,15);
		batiments.add(resto2);
		Point hgResto3 = new Point(360,450);
		Point bgResto3 = new Point(540,550);
		BatimentCible resto3 = new BatimentCible("RestoChinoi","Manger",0,50,11,23,hgResto3,bgResto3,15);
		batiments.add(resto3);
		Point hgCinema = new Point(120,590);
		Point bgCinema = new Point(300,590);
		BatimentCible cinema = new BatimentCible("Cinema","Detente",0,45,10,22,hgCinema,bgCinema,12);
		batiments.add(cinema);
		Point hgBar1 = new Point(360,590);
		Point bgBar1 = new Point(540,690);
		BatimentCible bar1 = new BatimentCible("Bar","Detente",0,52,12,23,hgBar1,bgBar1,14);
		batiments.add(bar1);
		Point hgParc = new Point(840,450);
		Point bgParc = new Point(1020,550);
		BatimentCible parc = new BatimentCible("Parc","Social",0,45,10,22,hgParc,bgParc,12);
		batiments.add(parc);
		Point hgBurreau1 = new Point(1080,450);
		Point bgBurreau1 = new Point(1260,550);
		BatimentCible burrau1 = new BatimentCible("Burreau1","Travail",0,30,7,17,hgBurreau1,bgBurreau1,15);
		batiments.add(burrau1);
		Point hgBurreau2 = new Point(840,590);
		Point bgBurreau2 = new Point(1020,690);
		BatimentCible burrau2 = new BatimentCible("Burreau2","Travail",0,30,7,17,hgBurreau2,bgBurreau2,15);
		batiments.add(burrau2);
		Point hgFFood1 = new Point(1080,590);
		Point bgFFood1 = new Point(1260,690);
		BatimentCible fastFood1 = new BatimentCible("FastFood1","Manger",0,25,11,23,hgFFood1,bgFFood1,15);
		batiments.add(fastFood1);
		Point hgFFood2 = new Point(840,60);
		Point bgFFood2 = new Point(1020,160);
		BatimentCible fastFood2 = new BatimentCible("FastFood2","Manger",0,25,11,23,hgFFood2,bgFFood2,15);
		batiments.add(fastFood2);
		Point hgHotel = new Point(1080,60);
		Point bgHotel = new Point(1260,160);
		BatimentCible hotel = new BatimentCible("Hotel","Habitation",0,70,5,23,hgHotel,bgHotel,11);
		batiments.add(hotel);
		Point hgBar2 = new Point(840,220);
		Point bgBar2 = new Point(1020,320);
		BatimentCible bar2 = new BatimentCible("Bar2","Detente",0,52,12,23,hgBar2,bgBar2,14);
		batiments.add(bar2);
		Point hgFFood3 = new Point(1080,220);
		Point bgFFood3 = new Point(1260,320);
		BatimentCible fastFood3 = new BatimentCible("FastFood3","Manger",0,25,11,23,hgFFood3,bgFFood3,15);
		batiments.add(fastFood3);
		
		
	}
		


	

	public ArrayList<BatimentCible> getBatiments() {
		return batiments;
	}





	public void setBatiments(ArrayList<BatimentCible> batiments) {
		this.batiments = batiments;
	}





	public HashMap<String, Route> getRoutes() {
		return routes;
	}

	public void setRoutes(HashMap<String, Route> routes) {
		this.routes = routes;
	}

}
