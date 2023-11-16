package org.lessons.java;

import java.util.Iterator;

import org.lessons.java.pojo.Aquila;
import org.lessons.java.pojo.Cane;
import org.lessons.java.pojo.Delfino;
import org.lessons.java.pojo.Passerotto;
import org.lessons.java.pojo.abs.Animale;

public class Main {

	public static void main(String[] args) {
		
		Cane c = new Cane("Cane");
		Passerotto p = new Passerotto("Passerotto");
		Aquila a = new Aquila("Aquila");
		Delfino d = new Delfino("Delfino");
		
		Animale[] animali = new Animale[4];
		
		animali[0] = c;
		animali[1] = p;
		animali[2] = a;
		animali[3] = d;
		
		for (int i = 0; i < animali.length; i++) {
			
			Animale an = animali[i];
			
			System.out.println(an);
			an.sleep();
			an.getVerso();
			an.getMangia();
			
		}
	}

}
