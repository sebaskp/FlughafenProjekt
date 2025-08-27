package spe.mch;

import java.io.Serializable;

public class Flugzeug implements Serializable{
//	Konstruktoren
	private String type;
	private int anzahlPlaetze;
	private boolean tankVoll;
	
	private Flugzeug(String type,int anzahlPlaetze, boolean tankVoll) {
		this.type=type;
		this.anzahlPlaetze=anzahlPlaetze;
		this.tankVoll=false;
	}
	private Flugzeug() {
		
	}
	public int getAnzahlPlaetze() {
		return anzahlPlaetze;
	}
	public void setAnzahlPlaetze(int anzahlPlaetze) {
		this.anzahlPlaetze = anzahlPlaetze;
	}
	public boolean isTankVoll() {
		return tankVoll;
	}
	public void setTankVoll(boolean tankVoll) {
		this.tankVoll = tankVoll;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Flugzeug [type=" + type + ", anzahlPlaetze=" + anzahlPlaetze + ", tankVoll=" + tankVoll + "]";
	}
//	Methoden
	
	public void tanken() {
		if(!tankVoll) {
			tankVoll=true;
		}
	}
	
	public void VerbraucheTreibstoff() {
		if(tankVoll) {
			tankVoll=false;
		}
	}
	
	public boolean istTankVoll() {
	
		return tankVoll;	
}
	
}
