package ro.ase.cts.program;

import ro.ase.cts.clase.Gara;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {

	public static void main(String[] args) {
		
		//presedinteEager
		Presedinte presedinte1 = Presedinte.getInstance();
		Presedinte presedinte2 = Presedinte.getInstance();

		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		presedinte1.setNume("Basescu");
		presedinte2.setMandat(3);
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		//presedinteLazy
		PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("Presedinte Lazy 1",40,4);
		PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("Presedinte Lazy 2",58,1);

		System.out.println(presedinteLazy1.toString());
		System.out.println(presedinteLazy2.toString());
		
		//garaLazy
		Gara gara1 = Gara.getInstance(6, "Bacau", 90.5f);
		Gara gara2 = Gara.getInstance(14, "Bucuresti", 86.7f);
		
		System.out.println(gara1.toString());
		System.out.println(gara2.toString());
		System.out.println();
		
		gara1.setOras("Pitesti");
		gara2.setNrTrenuri(10);
		System.out.println(gara1.toString());
		System.out.println(gara2.toString());
	}

}
