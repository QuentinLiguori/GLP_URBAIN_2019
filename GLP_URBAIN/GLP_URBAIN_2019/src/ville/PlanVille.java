package ville;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

import javax.swing.text.html.HTMLDocument.Iterator;

import data.Point;

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
	private BatimentCible bureau1;
	private Point hgBureau2;
	private Point bdBureau2;
	private BatimentCible bureau2;
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
	private Point hgParc2;
	private Point bdParc2;
	private BatimentCible parc2;
	
	public PlanVille() {
		
		batiments = new ArrayList<BatimentCible>();
//******************Creation des batiments****************************************//
		hgHome1 = new Point(331,0);
		bdHome1 = new Point(499,148);
		Home1 = new BatimentCible("Home1","Energie",1,4,5,23,hgHome1,bdHome1,500,311,74);
		batiments.add(Home1);
		hgHome2 = new Point(509,0);
		bdHome2 = new Point(677,148);
		home2 = new BatimentCible("Home2","Energie",1,4,5,23,hgHome2,bdHome2,350,677,74);
		batiments.add(home2);
		hgHome3 = new Point(0,523);
		bdHome3 = new Point(168,602);
		home3 = new BatimentCible("Home3","Energie",1,4,5,23,hgHome3,bdHome3,350,84,503);
		batiments.add(home3);
		hgHome4 = new Point(0,612);
		bdHome4 = new Point(168,750);
		Home4 = new BatimentCible("Home4","Energie",1,4,5,23,hgHome4,bdHome4,350,168,676);
		batiments.add(Home4);
		hgHome5 = new Point(247,612);
		bdHome5 = new Point(415,750);
		Home5 = new BatimentCible("Home5","Energie",1,4,5,23,hgHome5,bdHome5,350,227,676);
		batiments.add(Home5);
		hgHome6 = new Point(425,612);
		bdHome6 = new Point(593,750);
		Home6 = new BatimentCible("Home6","Energie",1,4,5,23,hgHome6,bdHome6,350,593,676);
		batiments.add(Home6);
		hgHome7 = new Point(0,760);
		bdHome7 = new Point(168,893);
		Home7 = new BatimentCible("Home7","Energie",1,4,5,23,hgHome7,bdHome7,350,168,823);
		batiments.add(Home7);
		hgHome8 = new Point(247,760);
		bdHome8 = new Point(415,893);
		Home8 = new BatimentCible("Home8","Energie",1,4,5,23,hgHome8,bdHome8,350,227,823);
		batiments.add(Home8);
		hgHome9 = new Point(425,760);
		bdHome9 = new Point(593,893);
		Home9 = new BatimentCible("Home9","Energie",1,4,5,23,hgHome9,bdHome9,350,593,823);
		batiments.add(Home9);
		hgResto1 = new Point(593,380);
		bdResto1 = new Point(761,528);
		resto1 = new BatimentCible("RestoChinoi","Faim",0,50,11,23,hgResto1,bdResto1,500,680,528);
		batiments.add(resto1);
		hgResto2 = new Point(1428,419);
		bdResto2 = new Point(1596,656);
		resto2 = new BatimentCible("RestoItalien","Faim",0,50,11,23,hgResto2,bdResto2,300,1408,520);
		batiments.add(resto2);
		hgCinema = new Point(0,222);
		bdCinema = new Point(336,449);
		cinema = new BatimentCible("Cinema","Divertissement",0,80,10,22,hgCinema,bdCinema,500,336,310);
		batiments.add(cinema);
		hgBar1 = new Point(593,222);
		bdBar1 = new Point(761,370);
		bar1 = new BatimentCible("Bar","Social",0,60,12,23,hgBar1,bdBar1,500,660,202);
		batiments.add(bar1);
		hgParc = new Point(1260,0);
		bdParc = new Point(1596,409);
		parc = new BatimentCible("Parc","Social",0,100,10,22,hgParc,bdParc,239,1240,40);
		batiments.add(parc);
		hgBureau1 = new Point(756,0);
		bdBureau1 = new Point(1176,148);
		bureau1 = new BatimentCible("Bureau1","Social",0,40,7,17,hgBureau1,bdBureau1,180,885,148);
		batiments.add(bureau1);
		hgBureau2 = new Point(415,222);
		bdBureau2 = new Point(583,370);
		bureau2 = new BatimentCible("Bureau2","Social",0,20,7,17,hgBureau2,bdBureau2,180,500,202);
		batiments.add(bureau2);
		hgFFood1 = new Point(835,222);
		bdFFood1 = new Point(919,370);
		fastFood1 = new BatimentCible("FastFood1","Faim",0,39,11,23,hgFFood1,bdFFood1,240,815,300);
		batiments.add(fastFood1);
		hgFFood2 = new Point(247,523);
		bdFFood2 = new Point(331,602);
		fastFood2 = new BatimentCible("FastFood2","Faim",0,25,11,23,hgFFood2,bdFFood2,240,227,530);
		batiments.add(fastFood2);
		hgHotel = new Point(672,612);
		bdHotel = new Point(1092,893);
		hotel = new BatimentCible("Hotel","Energie",0,80,5,23,hgHotel,bdHotel,310,1000,598);
		batiments.add(hotel);
		hgBar2 = new Point(1186,489);
		bdBar2 = new Point(1357,647);
		bar2 = new BatimentCible("Bar2","Social",0,52,12,23,hgBar2,bdBar2,230,1250,647);
		batiments.add(bar2);
		hgDisco = new Point(929,222);
		bdDisco = new Point(1181,370);
		disco = new BatimentCible("Discotheque","Divertissement",1,68,5,23,hgDisco,bdDisco,350,1160,202);
		batiments.add(disco);
		hgMairie = new Point(835,380);
		bdMairie = new Point(1176,528);
		mairie = new BatimentCible("Mairie","Social",1,50,5,23,hgMairie,bdMairie,350,970,528);
		batiments.add(mairie);
		hgVilla = new Point(0,0);
		bdVilla = new Point(252,148);
		villa = new BatimentCible("Villa","Energie",1,90,5,23,hgVilla,bdVilla,350,126,148);
		batiments.add(villa);
		hgTheatre = new Point(1176,735);
		bdTheatre = new Point(1596,893);
		theatre = new BatimentCible("Theatre","Divertissement",1,70,5,23,hgTheatre,bdTheatre,350,1300,715);
		batiments.add(theatre);
		hgParc2 = new Point(415,380);
		bdParc2 = new Point(583,528);
		parc2 = new BatimentCible("Statut","Divertissement",1,70,5,23,hgParc2,bdParc2,350,395,450);
		batiments.add(parc2);
		
		
	}
	public ArrayList<BatimentCible> getBatiments() {
		return batiments;
	}





	public void setBatiments(ArrayList<BatimentCible> batiments) {
		this.batiments = batiments;
	}
	
	



	public Point getHgHome1() {
		return hgHome1;
	}





	public Point getBdHome1() {
		return bdHome1;
	}





	public BatimentCible getHome1() {
		return Home1;
	}





	public Point getHgHome2() {
		return hgHome2;
	}





	public Point getBdHome2() {
		return bdHome2;
	}





	public BatimentCible getHome2() {
		return home2;
	}





	public Point getHgHome3() {
		return hgHome3;
	}





	public Point getBdHome3() {
		return bdHome3;
	}





	public BatimentCible getHome3() {
		return home3;
	}





	public Point getHgHome4() {
		return hgHome4;
	}





	public Point getBdHome4() {
		return bdHome4;
	}





	public BatimentCible getHome4() {
		return Home4;
	}





	public Point getHgHome5() {
		return hgHome5;
	}





	public Point getBdHome5() {
		return bdHome5;
	}





	public BatimentCible getHome5() {
		return Home5;
	}





	public Point getHgHome6() {
		return hgHome6;
	}





	public Point getBdHome6() {
		return bdHome6;
	}





	public BatimentCible getHome6() {
		return Home6;
	}





	public Point getHgHome7() {
		return hgHome7;
	}





	public Point getBdHome7() {
		return bdHome7;
	}





	public BatimentCible getHome7() {
		return Home7;
	}





	public Point getHgHome8() {
		return hgHome8;
	}





	public Point getBdHome8() {
		return bdHome8;
	}





	public BatimentCible getHome8() {
		return Home8;
	}





	public Point getHgHome9() {
		return hgHome9;
	}





	public Point getBdHome9() {
		return bdHome9;
	}





	public BatimentCible getHome9() {
		return Home9;
	}





	public Point getHgResto1() {
		return hgResto1;
	}





	public Point getBdResto1() {
		return bdResto1;
	}





	public BatimentCible getResto1() {
		return resto1;
	}





	public Point getHgResto2() {
		return hgResto2;
	}





	public Point getBdResto2() {
		return bdResto2;
	}





	public BatimentCible getResto2() {
		return resto2;
	}





	public Point getHgCinema() {
		return hgCinema;
	}





	public Point getBdCinema() {
		return bdCinema;
	}





	public BatimentCible getCinema() {
		return cinema;
	}





	public Point getHgBar1() {
		return hgBar1;
	}





	public Point getBdBar1() {
		return bdBar1;
	}





	public BatimentCible getBar1() {
		return bar1;
	}





	public Point getHgParc() {
		return hgParc;
	}





	public Point getBdParc() {
		return bdParc;
	}





	public BatimentCible getParc() {
		return parc;
	}





	public Point getHgBureau1() {
		return hgBureau1;
	}





	public Point getBdBureau1() {
		return bdBureau1;
	}





	public BatimentCible getBureau1() {
		return bureau1;
	}





	public Point getHgBureau2() {
		return hgBureau2;
	}





	public Point getBdBureau2() {
		return bdBureau2;
	}





	public BatimentCible getBureau2() {
		return bureau2;
	}





	public Point getHgFFood1() {
		return hgFFood1;
	}





	public Point getBdFFood1() {
		return bdFFood1;
	}





	public BatimentCible getFastFood1() {
		return fastFood1;
	}





	public Point getHgFFood2() {
		return hgFFood2;
	}





	public Point getBdFFood2() {
		return bdFFood2;
	}





	public BatimentCible getFastFood2() {
		return fastFood2;
	}





	public Point getHgHotel() {
		return hgHotel;
	}





	public Point getBdHotel() {
		return bdHotel;
	}





	public BatimentCible getHotel() {
		return hotel;
	}





	public Point getHgBar2() {
		return hgBar2;
	}





	public Point getBdBar2() {
		return bdBar2;
	}





	public BatimentCible getBar2() {
		return bar2;
	}





	public Point getHgDisco() {
		return hgDisco;
	}





	public Point getBdDisco() {
		return bdDisco;
	}





	public BatimentCible getDisco() {
		return disco;
	}





	public Point getHgMairie() {
		return hgMairie;
	}





	public Point getBdMairie() {
		return bdMairie;
	}





	public BatimentCible getMairie() {
		return mairie;
	}





	public Point getHgVilla() {
		return hgVilla;
	}





	public Point getBdVilla() {
		return bdVilla;
	}





	public BatimentCible getVilla() {
		return villa;
	}





	public Point getHgTheatre() {
		return hgTheatre;
	}





	public Point getBdTheatre() {
		return bdTheatre;
	}





	public BatimentCible getTheatre() {
		return theatre;
	}





	public Point getHgParc2() {
		return hgParc2;
	}





	public Point getBdParc2() {
		return bdParc2;
	}





	public BatimentCible getParc2() {
		return parc2;
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
	public BatimentCible searchBat(String name) throws NoSuchElementException {
		BatimentCible result = null;
		for (BatimentCible b : batiments) {
			if (b.getNom().equals(name)) {
				result = b;
			}
		}
		if (result == null) {
			throw new NoSuchElementException("Bat does not exists.");
		} else {
			return result;
		}
}
	public BatimentCible searchByName(String name) {
		BatimentCible result = null;
        for (int index = 0; index < batiments.size(); index++) {
                BatimentCible bat = batiments.get(index);
                if (bat.getNom().equals(name)) {
    				result = bat;
    			}
        }
        if (result == null) {
			System.out.println("Bat " + name + " does not exists.");
			return result;
		} else {
			return result;
		}
    }
}
