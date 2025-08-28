package spe.mch;

import java.time.LocalDateTime;

public class Main {
	
public static void main(String[] args) {
	Pilot p1=new Pilot("Hans","Mueller",true);
	Pilot p2=new Pilot("Sunane","Daugner",false);
	
	Flugbegleiter f1= new Flugbegleiter("Lena","Stenze");
	Flugbegleiter f2= new Flugbegleiter("Lea","Bierbauch");
	
	Flugzeug fz=new Flugzeug("A320neo",187,false);
	
	
	Flug s=new Flug(LocalDateTime.of(2025, 11, 20, 20, 15),
			LocalDateTime.of(2025, 11, 20, 23, 40),"Muenchen","New York");
	s.addPilot(p1);
	s.addPilot(p2);
	s.addFlugbegleiter(f1);
	s.addFlugbegleiter(f2);
	s.setFlugzeug(fz);
	fz.tanken();
	s.starten(fz);
	
		Flugverwaltung.importFluggaeste("C:/Test/fluggaeste.csv", s,fz);
		
		System.out.println(s);
		
//		Flugverwaltung.flugSpeichern(s,"C:/Test/fluggaeste.csv");
		  if (Flugverwaltung.flugSpeichern(s,"C:/Test/fluggaeste1.ser" )) {
		        System.out.println("Flug erfolgreich gespeichert!");
		    } else {
		        System.out.println("Fehler beim Speichern!");
		    }
		 Flug f= Flugverwaltung.flugLaden("C:/Test/fluggaeste1.ser" );
		 Flugverwaltung.flugAusgeben(f);
//		 Flug.ausgabeGaeste(Flug.);
}
}