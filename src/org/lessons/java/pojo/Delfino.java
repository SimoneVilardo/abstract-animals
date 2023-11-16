package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Delfino extends Animale {
	
	final static String VERSO = "Clicks";
	final static String MANGIARE = "Pesci";

	public Delfino(String nome) {
		
		super(nome);
		
	}

	@Override
	public void getVerso() {
		
		System.out.println("Il verso del delfino è = " + VERSO);
		
	}

	@Override
	public void getMangia() {
		
		System.out.println("Il delfino mangia i " + MANGIARE);
		
	}

}
