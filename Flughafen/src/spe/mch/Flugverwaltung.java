package spe.mch;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Flugverwaltung {

	public static void importFluggaeste(String fileName,Flug f) {
		String zeile="";
		String[] ga=null;
		Fluggast flugga=null;
		
		try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
			while((zeile=br.readLine())!=null) {
				ga=zeile.split(";");
				flugga=new Fluggast(ga[0],ga[1],ga[2]);
				f.addFluggast(flugga);
			
			
		}
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	}
}


