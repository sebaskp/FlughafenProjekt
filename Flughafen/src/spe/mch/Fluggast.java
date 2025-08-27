package spe.mch;

import java.util.Objects;

public class Fluggast extends Person{
   private String klasse; 
   
	public Fluggast(String vorname, String nachname,String klasse) {
		super(vorname, nachname);
		
	}
	public Fluggast() {}
	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
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
