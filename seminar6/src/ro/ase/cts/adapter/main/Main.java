package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletAdapter;
import ro.ase.cts.adapter.clase.BiletAdapterClase;
import ro.ase.cts.adapter.clase.IBiletOnline;

public class Main {

	private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	
	private static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilet bilet = new Bilet(30);
		rezervaSiAfiseazaBiletLaCasa(bilet);

		System.out.println();
		
		IBiletOnline adapter = new BiletAdapter(bilet);
		rezervaSiAfiseazaBiletOnline(adapter);
		
		System.out.println();
		
		IBiletOnline adapterClase = new BiletAdapterClase(50);
		rezervaSiAfiseazaBiletOnline(adapterClase);
	}

}
