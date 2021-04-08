package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.AgentieComposite;
import ro.ase.cts.composite.clase.FilialaLeaf;

public class Main {

	public static void main(String[] args) {
		
		AgentieComposite agentie1 = new AgentieComposite();
		AgentieComposite agentie2 = new AgentieComposite();
		AgentieComposite agentie3 = new AgentieComposite();
		
		FilialaLeaf filiala1 = new FilialaLeaf("Filiala 1");
		FilialaLeaf filiala2 = new FilialaLeaf("Filiala 2");
		FilialaLeaf filiala3 = new FilialaLeaf("Filiala 3");
		FilialaLeaf filiala4 = new FilialaLeaf("Filiala 4");
		
		agentie1.addNod(filiala1);
		agentie1.addNod(filiala2);
		
		agentie2.addNod(filiala3);
		agentie3.addNod(filiala4);
		
		agentie1.addNod(agentie3);
		
		agentie1.afiseazaDescriere();
		System.out.println();
		agentie2.afiseazaDescriere();
		System.out.println();
		
		agentie1.removeNod(agentie3);
		agentie2.removeNod(filiala4);
		agentie1.addNod(filiala4);
		
		agentie1.afiseazaDescriere();
		System.out.println();
		agentie2.afiseazaDescriere();
	}

}
