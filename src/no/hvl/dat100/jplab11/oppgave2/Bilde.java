package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.setBruker(bruker);
		this.setDato(dato);
		this.setId(id);
		this.setTekst(tekst);
		this.setUrl(url);
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.setBruker(bruker);
		this.setDato(dato);
		this.setId(id);
		this.setLikes(likes);
		this.setTekst(tekst);
		this.setUrl(url);
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		
		return "BILDE" + "\n"  + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + url + "\n";

	}
	
}