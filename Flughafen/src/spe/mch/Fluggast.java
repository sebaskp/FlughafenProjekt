package spe.mch;

import java.util.Objects;

public class Fluggast extends Person{
   private Flugklasse klasse; 
   
	public Fluggast(String vorname, String nachname, Flugklasse klasse) {
	super(vorname, nachname);
	this.klasse = klasse;
}
	public Fluggast(Object importFluggaeste) {
		
	}
	public Flugklasse getKlasse() {
		return klasse;
	}
	public void setKlasse(Flugklasse klasse) {
		this.klasse = klasse;
	}
	@Override
	public String toString() {
		return super.toString() + "Fluggast [klasse=" + klasse + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(klasse);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fluggast other = (Fluggast) obj;
		return Objects.equals(klasse, other.klasse);
	}

	


}