package spe.mch;

import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Flugverwaltung {

	public static void importFluggaeste(String fileName,Flug f, Flugzeug fz) {
		String zeile="";
		String[] ga=null;
		Fluggast flugga=null;
		Flugklasse x;
		try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
			while((zeile=br.readLine())!=null) {
				ga=zeile.split(";");
				x=Flugklasse.valueOf(ga[2]);
				flugga=new Fluggast(ga[0],ga[1],x);
				f.addFluggast(flugga, fz );
			
			
		}
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	}
	public static boolean flugSpeichern(Flug f, String s) {
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(s))){
			oos.writeObject(f);
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public static Flug flugLaden(String fileName) {
		Flug f=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName))){
			f=(Flug)ois.readObject();
		} catch (FileNotFoundException e) {	
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());	
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return f;
	}
	
	public static void flugAusgeben(Flug f) {
		System.out.println(f);
	}




}


