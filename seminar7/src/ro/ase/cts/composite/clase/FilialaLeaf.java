package ro.ase.cts.composite.clase;

public class FilialaLeaf implements ISediu{

	private String numeFiliala;
	
	public FilialaLeaf(String numeFiliala) {
		super();
		this.numeFiliala = numeFiliala;
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Este o filiala " + this.numeFiliala);
	}

	@Override
	public void addNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementat");
	}

	@Override
	public void removeNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementat");
		
	}

	@Override
	public ISediu getNod(int pozitie) throws Exception {
		throw new Exception("Nu este implementat");
	}

}
