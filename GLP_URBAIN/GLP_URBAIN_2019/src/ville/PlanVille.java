package ville;

import java.util.ArrayList;
import java.util.HashMap;
import donnee.Point;

public class PlanVille {
	private ArrayList<BatimentCible> batiments;
	private HashMap<String,Route> routes;
	
	private Point hgHome1;
	private Point bdHome1;
	private BatimentCible Home1;
	private Point hgHome2;
	private Point bdHome2;
	private BatimentCible home2;
	private Point hgHome3;
	private Point bdHome3;
	private BatimentCible home3;
	private Point hgHome4;
	private Point bdHome4;
	private BatimentCible Home4;
	private Point hgHome5;
	private Point bdHome5;
	private BatimentCible Home5;
	private Point hgHome6;
	private Point bdHome6;
	private BatimentCible Home6;
	private Point hgHome7;
	private Point bdHome7;
	private BatimentCible Home7;
	private Point hgHome8;
	private Point bdHome8;
	private BatimentCible Home8;
	private Point hgHome9;
	private Point bdHome9;
	private BatimentCible Home9;
	private Point hgResto1;
	private Point bdResto1;
	private BatimentCible resto1;
	private Point hgResto2;
	private Point bdResto2;
	private BatimentCible resto2;
	private Point hgCinema;
	private Point bdCinema;
	private BatimentCible cinema;
	private Point hgBar1;
	private Point bdBar1;
	private BatimentCible bar1;
	private Point hgParc;
	private Point bdParc;
	private BatimentCible parc;
	private Point hgBureau1;
	private Point bdBureau1;
	private BatimentCible burau1;
	private Point hgBureau2;
	private Point bdBureau2;
	private BatimentCible burau2;
	private Point hgFFood1;
	private Point bdFFood1;
	private BatimentCible fastFood1;
	private Point hgFFood2;
	private Point bdFFood2;
	private BatimentCible fastFood2;
	private Point hgHotel;
	private Point bdHotel;
	private BatimentCible hotel;
	private Point hgBar2;
	private Point bdBar2;
	private BatimentCible bar2;
	private Point hgDisco;
	private Point bdDisco;
	private BatimentCible disco;
	private Point hgMairie;
	private Point bdMairie;
	private BatimentCible mairie;
	private Point hgVilla;
	private Point bdVilla;
	private BatimentCible villa;
	private Point hgTheatre;
	private Point bdTheatre;
	private BatimentCible theatre;
	private Point hgStatut;
	private Point bdStatut;
	private BatimentCible statut;
	
	public PlanVille() {
		
		batiments = new ArrayList<BatimentCible>();
//******************Creation des batiments****************************************//
		hgHome1 = new Point(331,0);
		bdHome1 = new Point(499,148);
		Home1 = new BatimentCible("Home1","Habitation",1,4,5,23,hgHome1,bdHome1,350);
		batiments.add(Home1);
		hgHome2 = new Point(509,0);
		bdHome2 = new Point(677,148);
		home2 = new BatimentCible("Home2","Habitation",1,4,5,23,hgHome2,bdHome2,350);
		batiments.add(home2);
		hgHome3 = new Point(0,523);
		bdHome3 = new Point(168,602);
		home3 = new BatimentCible("Home3","Habitation",1,4,5,23,hgHome3,bdHome3,350);
		batiments.add(home3);
		hgHome4 = new Point(0,612);
		bdHome4 = new Point(168,750);
		Home4 = new BatimentCible("Home4","Habitation",1,4,5,23,hgHome4,bdHome4,350);
		batiments.add(Home4);
		hgHome5 = new Point(247,612);
		bdHome5 = new Point(415,750);
		Home5 = new BatimentCible("Home5","Habitation",1,4,5,23,hgHome5,bdHome5,350);
		batiments.add(Home5);
		hgHome6 = new Point(425,612);
		bdHome6 = new Point(593,750);
		Home6 = new BatimentCible("Home6","Habitation",1,4,5,23,hgHome6,bdHome6,350);
		batiments.add(Home6);
		hgHome7 = new Point(0,760);
		bdHome7 = new Point(168,893);
		Home7 = new BatimentCible("Home7","Habitation",1,4,5,23,hgHome7,bdHome7,350);
		batiments.add(Home7);
		hgHome8 = new Point(247,760);
		bdHome8 = new Point(415,893);
		Home8 = new BatimentCible("Home8","Habitation",1,4,5,23,hgHome8,bdHome8,350);
		batiments.add(Home8);
		hgHome9 = new Point(425,760);
		bdHome9 = new Point(593,893);
		Home9 = new BatimentCible("Home9","Habitation",1,4,5,23,hgHome9,bdHome9,350);
		batiments.add(Home9);
		hgResto1 = new Point(593,380);
		bdResto1 = new Point(761,528);
		resto1 = new BatimentCible("RestoChinoi","Manger",0,50,11,23,hgResto1,bdResto1,300);
		batiments.add(resto1);
		hgResto2 = new Point(1428,419);
		bdResto2 = new Point(1596,656);
		resto2 = new BatimentCible("RestoItalien","Manger",0,50,11,23,hgResto2,bdResto2,300);
		batiments.add(resto2);
		hgCinema = new Point(0,222);
		bdCinema = new Point(336,449);
		cinema = new BatimentCible("Cinema","Detente",0,80,10,22,hgCinema,bdCinema,200);
		batiments.add(cinema);
		hgBar1 = new Point(593,222);
		bdBar1 = new Point(761,370);
		bar1 = new BatimentCible("Bar","Social",0,60,12,23,hgBar1,bdBar1,230);
		batiments.add(bar1);
		hgParc = new Point(1260,0);
		bdParc = new Point(1596,409);
		parc = new BatimentCible("Parc","Social",0,100,10,22,hgParc,bdParc,239);
		batiments.add(parc);
		hgBureau1 = new Point(756,0);
		bdBureau1 = new Point(1176,148);
		burau1 = new BatimentCible("Bureau1","Travail",0,40,7,17,hgBureau1,bdBureau1,180);
		batiments.add(burau1);
		hgBureau2 = new Point(415,222);
		bdBureau2 = new Point(583,370);
		burau2 = new BatimentCible("Bureau2","Travail",0,20,7,17,hgBureau2,bdBureau2,180);
		batiments.add(burau2);
		hgFFood1 = new Point(835,222);
		bdFFood1 = new Point(919,370);
		fastFood1 = new BatimentCible("FastFood1","Manger",0,39,11,23,hgFFood1,bdFFood1,240);
		batiments.add(fastFood1);
		hgFFood2 = new Point(247,523);
		bdFFood2 = new Point(331,602);
		fastFood2 = new BatimentCible("FastFood2","Manger",0,25,11,23,hgFFood2,bdFFood2,240);
		batiments.add(fastFood2);
		hgHotel = new Point(672,612);
		bdHotel = new Point(1092,893);
		hotel = new BatimentCible("Hotel","Habitation",0,80,5,23,hgHotel,bdHotel,310);
		batiments.add(hotel);
		hgBar2 = new Point(1186,489);
		bdBar2 = new Point(1357,647);
		bar2 = new BatimentCible("Bar2","Social",0,52,12,23,hgBar2,bdBar2,230);
		batiments.add(bar2);
		hgDisco = new Point(929,222);
		bdDisco = new Point(1181,370);
		disco = new BatimentCible("Discotheque","Detente",1,68,5,23,hgDisco,bdDisco,350);
		batiments.add(disco);
		hgMairie = new Point(835,380);
		bdMairie = new Point(1176,528);
		mairie = new BatimentCible("Mairie","Travail",1,50,5,23,hgMairie,bdMairie,350);
		batiments.add(mairie);
		hgVilla = new Point(0,0);
		bdVilla = new Point(252,148);
		villa = new BatimentCible("Villa","Habitation",1,90,5,23,hgVilla,bdVilla,350);
		batiments.add(villa);
		hgTheatre = new Point(1176,735);
		bdTheatre = new Point(1596,893);
		theatre = new BatimentCible("Theatre","Detente",1,70,5,23,hgTheatre,bdTheatre,350);
		batiments.add(theatre);
		hgStatut = new Point(415,380);
		bdStatut = new Point(583,528);
		statut = new BatimentCible("Statut","Detente",1,70,5,23,hgStatut,bdStatut,350);
		batiments.add(statut);
		
		
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
	
	public boolean Exist(BatimentCible a) {
		if(batiments.contains(a)) {
			return true;
		}
		else {
			return false;
		}
	}

}
