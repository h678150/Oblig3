package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	
	int id;
	String bruker;
	String dato;
	int likes;
	
	
	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {
		
		
		this.setBruker(bruker);
		this.setDato(dato);
		this.setId(id);
		
		likes = 0;
		

		// TODO 
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		
		this.setBruker(bruker);
		this.setDato(dato);
		this.setId(id);
		this.setLikes(likes);
		

	}
	
	public String getBruker() {
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getLikes() {
		return likes;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	public void doLike () {
		likes = likes + 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		if(id != innlegg.id) {
			return false;
		}
		if(id == innlegg.id) {
			return true;
		}
		
		
		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";

				
	}
	
}
