package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {

	private List<Comanda> comenzi;
	
	public Operator() {
		this.comenzi = new ArrayList<Comanda>();
	}
	
	public void invoca(Comanda comanda) {
		this.comenzi.add(comanda);
	}
	
	public void executaComanda() {
		comenzi.get(0).executa();
		comenzi.remove(0);
	}
}
