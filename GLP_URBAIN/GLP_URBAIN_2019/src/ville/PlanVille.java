package ville;

import java.util.HashMap;


public class PlanVille {
	private int[][] plan;
	private int i;
	private int j;
	private HashMap<String,BatimentCible> batiments;
	private HashMap<String,Route> routes;
	
	public PlanVille(int i, int j) {
		this.i = i;
		this.j = j;
		plan = new int [25][25];
		
		for(i = 0; i< plan.length; i++) {
			for(j=0; i< plan.length; j++) {
				plan[i][j] = 0;
				System.out.println(plan[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	

	public int[][] getPlan() {
		return plan;
	}



	public void setPlan(int[][] plan) {
		this.plan = plan;
	}



	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}



	public int getY() {
		return j;
	}



	public void setY(int j) {
		this.j = j;
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
