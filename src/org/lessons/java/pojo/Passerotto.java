package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Passerotto extends Animale {
	
	final static String VERSO = "Chirp";
	final static String MANGIARE = "Semini";

	public Passerotto(String nome) {
		
		super(nome);
		
	}

	@Override
	public void getVerso() {
		
		System.out.println("Il verso del passerotto è = " + VERSO);
		
	}

	@Override
	public void getMangia() {
		
		System.out.println("Il passerotto mangia i " + MANGIARE);
		
	}

}
