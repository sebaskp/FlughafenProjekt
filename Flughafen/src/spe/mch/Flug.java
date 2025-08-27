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
	
	
	public Flug(LocalDateTime startzeit, LocalDateTime landezeit, String startflughafen, String zielflughafen) {
		super();
		this.startzeit = startzeit;
		this.landezeit = landezeit;
		this.startflughafen = startflughafen;
		this.zielflughafen = zielflughafen;
	}
	public Flug() {}
	
	
	
	
	
}
