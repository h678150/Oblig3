package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;



public class Blogg {

	// TODO: objektvariable
	
	private Innlegg[] innleggtabell;
	private int nesteledig = 0;
	
	
	
	public Blogg() {
		
		this.innleggtabell = new Innlegg[20];
		
	}

	public Blogg(int lengde) {
		
		this.innleggtabell = new Innlegg[lengde];
		
	}

	public int getAntall() {
		
		return this.innleggtabell.length;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for(int i = 0; i < innleggtabell.length; i++) {
			if(innleggtabell[i].erLik(innlegg)) {
				return i;}
		}
		return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		for(int i = 0; i < innleggtabell.length; i++) {
			if(innleggtabell[i].erLik(innlegg)) {
				return true;}
		}
		return false;
	}

	public boolean ledigPlass() {
		return innleggtabell[this.innleggtabell.length - 1] != null;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(!this.ledigPlass()) {
			return false;}
		if (this.finnes(innlegg)) {
			return false;
		}
		this.innleggtabell[this.nesteledig] = innlegg;
		this.nesteledig += 1;
		
		return true;
		
	}
	
	public String toString() {
		
		
		
	}
	
}