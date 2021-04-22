package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.Flyweight;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1 = new Rezervare(10,5,15);
		Rezervare rezervare2 = new Rezervare(42,7,10);
		Rezervare rezervare3 = new Rezervare(19,2,14);
		Rezervare rezervare4 = new Rezervare(15,1,20);
		
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight client1 = factory.getFlyweight("0712341234");
		client1.printeazaRezervare(rezervare1);
		
		factory.getFlyweight("0712341234").printeazaRezervare(rezervare2);
		factory.getFlyweight("0712341299").printeazaRezervare(rezervare3);
		factory.getFlyweight("0712341299").printeazaRezervare(rezervare4);

	}

}
