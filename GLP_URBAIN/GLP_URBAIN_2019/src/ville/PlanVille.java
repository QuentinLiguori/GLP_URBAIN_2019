package ville;

import java.util.HashMap;

public class PlanVille {
	private HashMap<String,BatimentCible> batiments;
	private HashMap<String,Route> routes;
	
	public PlanVille() {
		
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
