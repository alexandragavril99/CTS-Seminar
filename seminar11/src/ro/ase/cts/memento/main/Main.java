package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.Meci;
import ro.ase.cts.memento.clase.Memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meci meci = new Meci("EchipaGazda", "EchipaOaspecti",200,200,10,5);
		
		ManagerMemento managerMemento = new ManagerMemento();
		managerMemento.adaugaMemento(meci.creeazaMemento());
		
		meci.setNrSpectatori(180);
		managerMemento.adaugaMemento(meci.creeazaMemento());
		
		System.out.println(meci.toString());
		
		meci.seteazaMemento(managerMemento.cereMemento(1));
		
		System.out.println(meci.toString());
		
		meci.seteazaMemento(managerMemento.cereUltimulMemento());
		
		System.out.println(meci.toString());
	}

}
