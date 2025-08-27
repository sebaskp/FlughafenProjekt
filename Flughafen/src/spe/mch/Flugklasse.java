package spe.mch;

public class Flugklasse {
	String klasse;

	

	public void setFlugklasse(String klasse) {
	    switch (klasse.toLowerCase()) {
	        case "economy":
	            this.klasse = "Economy";
	            break;
	        case "business":
	            this.klasse = "Business";
	            break;
	        case "first":
	            this.klasse = "First";
	            break;
	        default:
	            throw new IllegalArgumentException("Ungültige Flugklasse: " + klasse);
	    }
	}
	@Override
    public String toString() {
        return klasse;
    }


}
