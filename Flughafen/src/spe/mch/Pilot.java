package spe.mch;

import java.util.Objects;

public class Pilot extends Person {

	public Pilot(String vorname, String nachname, boolean kapitaen) {
		super(vorname, nachname);
		this.kapitaen = kapitaen;
	}

	private boolean kapitaen;

	public Pilot(boolean kapitaen) {
		super();
		this.kapitaen = kapitaen;
	}
	public Pilot() {}
	
	public boolean isKapitaen() {
		return kapitaen;
	}
	public void setKapitaen(boolean kapitaen) {
		this.kapitaen = kapitaen;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Pilot [kapitaen=" + kapitaen + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(kapitaen);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilot other = (Pilot) obj;
		return kapitaen == other.kapitaen;
	}
	
	
	
}
