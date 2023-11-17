package org.lessons.java;

import java.util.Iterator;

import org.lessons.java.pojo.Aquila;
import org.lessons.java.pojo.Cane;
import org.lessons.java.pojo.Delfino;
import org.lessons.java.pojo.Passerotto;
import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.IVolante;
import org.lessons.java.pojo.inter.INuotante;

public class Main {
	
	public static void faiVolare(IVolante volante) {
		volante.vola();
	};
	public static void faiNuotare(INuotante nuotante) {
		nuotante.nuota();
	};

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
			an.dormi();
			an.getVerso();
			an.getMangia();
			
		}
		
		IVolante[] volanti = new IVolante[2];
		
		volanti[0] = p;
		volanti[1] = a;
		
		for (int i = 0; i < volanti.length; i++) {
			
			IVolante volante = volanti[i];
			
			faiVolare(volante);
		}
		
		INuotante[] nuotanti = new INuotante[2];
		
		nuotanti[0] = c;
		nuotanti[1] = d;
		
		for (int i = 0; i < nuotanti.length; i++) {
			
			INuotante nuotante = nuotanti[i];
			
			faiNuotare(nuotante);
		}

	}

}
