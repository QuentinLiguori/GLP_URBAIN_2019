package perso;

import java.util.Random;

public class ListeAction{
	
	private static Random rand;
	private static String[] randManger;
	private static String[] randDormir;
	private static String[] randDivertir;
	private static String[] randSocial;
	public ListeAction() {		
		rand = new Random();
		
		randManger = new String[4];
		randDormir = new String [20];
		randDivertir = new String[30];
		randSocial = new String[30];
		
		
		randManger[0] = "RestoChinoi";
		randManger[1] = "RestoItalien";
		randManger[2] = "FastFood1";
		randManger[3] = "FastFood2";
		
		randDormir[0] = "Home1";
		randDormir[1] = "Home2";
		randDormir[2] = "Home3";
		randDormir[3] = "Home4";
		randDormir[4] = "Home5";
		randDormir[5] = "Home6";
		randDormir[6] = "Home7";
		randDormir[7] = "Home8";
		randDormir[8] = "Home9";
		randDormir[9] = "Hotel";
		randDormir[10] = "Villa";
		
		randDivertir[0] = "Cinema";
		randDivertir[1] = "Theatre";
		randDivertir[2] = "Statut";
		randDivertir[3] = "Discotheque";
		
		randSocial[0] = "Bar";
		randSocial[1] = "Bar2";
		randSocial[2] = "Bureau1";
		randSocial[3] = "Bureau2";
		randSocial[4] = "Parc";
		randSocial[5] = "Mairie";
	}
	public static String batManger =  "RestoChinoi";
	public static String batDormir = "Villa";
	public static String batDivertir =  "Theatre";
	public static String batSocial = "Bar" ;
	
	public static Action manger = new Action("manger", batManger);
	public static Action dormir = new Action("dormir", batDormir);
	public static Action divertir = new Action("divertir",batDivertir);
	public static Action social = new Action("social", batSocial);
}
