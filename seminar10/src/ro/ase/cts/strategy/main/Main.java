package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCard;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("Alexandra");
		
		client.plateste(30);
		
		client.setTipPlata(new PlataCard());
		client.plateste(25);
		
	}

}
