package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.VerificarePersoaneFacade;

public class Main {

	public static void main(String[] args) {
		Persoana pers = new Persoana("Alex","1965784561275");
		if(VerificarePersoaneFacade.isEligibile(pers)) {
			System.out.println("Persoana este eligibila");
		} else {
			System.out.println("Persoana nu este eligibila");
		}
	}

}
