package spe.mch;

import java.io.Serializable;

public abstract class Person implements Serializable{
	private String vorname;
	private String nachname;
	
	public Person(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public Person() {}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + "]";
	}

}
