package web;

public enum Keywords {
	CASCO("Helmet"),	
	ESCUDO("shield armor"),
	PECHERA("vest armor"),
	GUANTES("gloves armor"),
	PANTALONES("pants"),
	ESPADA("sword"),
	HACHA("axe"),
	ARCO("bow"),
	BACULOMAGICO("staff"),
	POCION("beverages");

	String keyword;
	
	Keywords(String string) {
		this.keyword = string;
	}
	
	

	
}
