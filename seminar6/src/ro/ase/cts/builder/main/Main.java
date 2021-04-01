package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilderV1;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Rezervare rezervare1;
	
	RezervareBuilderV1 rezervareBuilder = new RezervareBuilderV1();
	rezervareBuilder.setCodRezervare(100).setAreMancare(true);
	rezervare1 = rezervareBuilder.build();
	
	Rezervare rezervare2 = new RezervareBuilderV1().setCodRezervare(101).setAreMuzica(true).build();
	
	Rezervare rezervare3 = new Rezervare(102,true,false,true,true,"Pop");

	Rezervare rezervare4;
	rezervareBuilder.setCodRezervare(104).setAreMuzica(true).setAreScaunErgonomic(true);
	rezervare4 = rezervareBuilder.build();
	
	System.out.println(rezervare1.toString());
	System.out.println(rezervare2.toString());
	System.out.println(rezervare3.toString());
	System.out.println(rezervare4.toString());
	
	//versiunea 1 de builder are shallow-copy - de mai sus
	
	RezervareBuilderV2 rbv2 = new RezervareBuilderV2().setAreMancare(true).setAreBautura(true).setAreScaunErgonomic(true);	
	Rezervare rezervare5 = rbv2.setCodRezervare(140).build();
	Rezervare rezervare6 = rbv2.setCodRezervare(150).build();
	
	
	}

}
