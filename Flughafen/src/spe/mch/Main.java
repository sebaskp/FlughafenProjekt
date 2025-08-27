package spe.mch;

import java.time.LocalDateTime;

public class Main {
public static void main(String[] args) {
	Flug s=new Flug(LocalDateTime.of(2025, 11, 20, 20, 15),LocalDateTime.of(2025, 11, 20, 23, 40),"Muenchen","New York");
		Flugverwaltung.importFluggaeste("C:/Test/fluggaeste.csv", s);

		System.out.println(s);
	}
}
