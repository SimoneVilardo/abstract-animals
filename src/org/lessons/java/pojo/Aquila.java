package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Aquila extends Animale {
	
	final static String VERSO = "Screech";
	final static String MANGIARE = "Topi";

	public Aquila(String nome) {
		
		super(nome);
		
	}

	@Override
	public void getVerso() {
		
		System.out.println("Il verso dell'aquila è = " + VERSO);
		
	}

	@Override
	public void getMangia() {
		
		System.out.println("L'aquila mangia i " + MANGIARE);
		
	}

}
