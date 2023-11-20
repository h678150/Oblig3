package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable
	private String tekst;
	
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		this.setBruker(bruker);
		this.setDato(dato);
		this.setId(id);
		this.setTekst(tekst);
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		this.setBruker(bruker);
		this.setDato(dato);
		this.setId(id);
		this.setLikes(likes);
		this.setTekst(tekst);
	}
	
	public String getTekst() {
		return tekst;
		

	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		
		return "TEKST" + "\n"  + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + tekst + "\n";

	}
	
}

