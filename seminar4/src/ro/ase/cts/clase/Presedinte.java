package ro.ase.cts.clase;

public class Presedinte {
	private String nume;
	private int varsta;
	private int mandat;
	
	private Presedinte() {
		this.nume="Putin";
		this.varsta=68;
		this.mandat=10;
	}

	private Presedinte(String nume, int varsta, int mandat) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}

	//de obicei - private, la eager initialization se poate lasa public
	private static Presedinte instance = new Presedinte();

	public static Presedinte getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Presedinte [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", mandat=");
		builder.append(mandat);
		builder.append("]");
		return builder.toString();
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setMandat(int mandat) {
		this.mandat = mandat;
	}

	public static void setInstance(Presedinte instance) {
		Presedinte.instance = instance;
	}
	
	
}
