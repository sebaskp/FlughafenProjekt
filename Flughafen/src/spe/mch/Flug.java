package spe.mch;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flug {

	private LocalDateTime startzeit;
	private LocalDateTime landezeit;
	private String startflughafen;
	private String zielflughafen;
	private Flugzeug flugzeug;
	private ArrayList<Pilot> piloten;
	private ArrayList<Flugbegleiter> flugbegleiter;
	private ArrayList<Fluggast> fluggaeste;
	
	public ArrayList<Fluggast> getFluggaeste() {
		return fluggaeste;
	}
	public void setFluggaeste(ArrayList<Fluggast> fluggaeste) {
		this.fluggaeste = fluggaeste;
	}
	public Flug(LocalDateTime startzeit, LocalDateTime landezeit, String startflughafen, String zielflughafen) {
		super();
		this.startzeit = startzeit;
		this.landezeit = landezeit;
		this.startflughafen = startflughafen;
		this.zielflughafen = zielflughafen;
	}
	public Flug() {}
	
	public LocalDateTime getStartzeit() {
		return startzeit;
	}
	public void setStartzeit(LocalDateTime startzeit) {
		this.startzeit = startzeit;
	}
	public LocalDateTime getLandezeit() {
		return landezeit;
	}
	public void setLandezeit(LocalDateTime landezeit) {
		this.landezeit = landezeit;
	}
	public String getStartflughafen() {
		return startflughafen;
	}
	public void setStartflughafen(String startflughafen) {
		this.startflughafen = startflughafen;
	}
	public String getZielflughafen() {
		return zielflughafen;
	}
	public void setZielflughafen(String zielflughafen) {
		this.zielflughafen = zielflughafen;
	}
	public Flugzeug getFlugzeug() {
		return flugzeug;
	}
	public void setFlugzeug(Flugzeug flugzeug) {
		this.flugzeug = flugzeug;
	}
	public ArrayList<Pilot> getPiloten() {
		return piloten;
	}
	public void setPiloten(ArrayList<Pilot> piloten) {
		this.piloten = piloten;
	}
	public ArrayList<Flugbegleiter> getFlugbegleiter() {
		return flugbegleiter;
	}
	public void setFlugbegleiter(ArrayList<Flugbegleiter> flugbegleiter) {
		this.flugbegleiter = flugbegleiter;
	}
	
	public boolean addPilot(Pilot pilot) {
		if(piloten.size()<2) {
			piloten.add(pilot);
			return true;
		} else {
			System.out.println("Pilot konnte nicht hinzugefuegt werden, da bereits 2 vorhanden sind");
			return false;
			
		}
	}
	
	public boolean deletePilot(Pilot pilot) {
		if (piloten.size()>0) {
			piloten.remove(pilot);
			return true;
		} else {
			System.out.println("Vorgang nicht moeglich, es gibt keine Piloten zum Entfernen");
			return false;
		}
	}

	public boolean addFluggast(Fluggast fluggast) {
		if (this.fluggaeste.size() < 300){
			fluggaeste.add(fluggast);
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteFluggast(Fluggast fluggast) {
		if(this.fluggaeste.size()<1) {
			fluggaeste.remove(fluggast);
			return true;
		} else {
			return false;
		}
	}
	 
	public boolean addFlugbegleiter(Flugbegleiter flugbegleiter) {
		if (this.flugbegleiter.size() <3) {
			this.flugbegleiter.add(flugbegleiter);
			return true;
		} else {
			System.out.println("Vorgang nicht moglich, maximaler Anzahl erreicht");return false;
		}
	}
	
	public boolean deleteFlugbegleiter(Flugbegleiter flugbegleiter) {
		if (this.flugbegleiter.size()>0) {
			this.flugbegleiter.remove(flugbegleiter);
			return true;
		} else {
			System.out.println("Flugbegleiter kann nicht entfernt werden, da keine vorhanden sind");
			return false;
		}
	}
	
	public int anzahlGaeste() {
		int summe = 0;
		for (Fluggast a : fluggaeste) {
			summe += 1;
		} 
		return summe;
	}
	
	
	
	
	
}

