package ro.ase.cts.main;

import ro.ase.cts.clase.FactoryAsistent;
import ro.ase.cts.clase.FactoryInfirmier;
import ro.ase.cts.clase.FactoryPersonal;
import ro.ase.cts.clase.IFactory;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.TipPersonal;
import ro.ase.cts.prototype.Reteta;

public class Main {
	
	public static void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
		PersonalSpital personalSpital = factory.getPersonal(nume);
		System.out.println(personalSpital.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryPersonal factoryPersonal = new FactoryPersonal();
		
		PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "David");
		PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic, "Razvan");

		System.out.println(asistent);
		System.out.println(medic);
		
		afisareInformatiiPersonalSpital(new FactoryAsistent(),"Mircea");
		afisareInformatiiPersonalSpital(new FactoryAsistent(),"Mihai");
		afisareInformatiiPersonalSpital(new FactoryInfirmier(),"Ana");
	;
		Reteta reteta = new Reteta("Paracetamol",250);
		Reteta reteta1 = (Reteta) reteta.copiaza();
		
		System.out.println();
		System.out.println(reteta);
		System.out.println(reteta1);
	}

}
