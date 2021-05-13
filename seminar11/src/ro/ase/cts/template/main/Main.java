package ro.ase.cts.template.main;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		
		SpectatorAbstract spectator = new Spectator("Alexandra");
		SpectatorAbstract spectatorVIP = new SpectatorVIP("Delia");
		
		spectator.intrareInStadion();
		System.out.println();
		spectatorVIP.intrareInStadion();
	}
}
