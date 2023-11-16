package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.INuotante;

public class Cane extends Animale implements INuotante {
	
	final static String VERSO = "Woof";
	final static String MANGIARE = "Croccantini";

	public Cane(String nome) {
		
		super(nome);
		
	}

	@Override
	public void getVerso() {
		
		System.out.println("Il verso del cane è = " + VERSO);
		
	}

	@Override
	public void getMangia() {
		
		System.out.println("Il cane mangia i " + MANGIARE);
		
	}


	@Override
	public void nuota() {
		
		System.out.println("\n" + "il " + getNome() + " Sta nuotando!!!");
		
	}


	
}
