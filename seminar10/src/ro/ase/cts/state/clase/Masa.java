package ro.ase.cts.state.clase;

public class Masa {
	
	private Stare stare;
	private int numar;
	
	public Stare getStare() {
		return stare;
	}

	protected void setStare(Stare stare) {
		this.stare = stare;
	}

	public Masa(int numar) {
		super();
		this.numar = numar;
		this.stare = new StareLibera();
	}
	
	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

	public void rezervaMasa() {
		StareRezervata rezervata = new StareRezervata();
		rezervata.modificaStare(this);
	}
	
	public void ocupaMasa() {
		StareOcupata ocupata = new StareOcupata();
		ocupata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		StareLibera eliberata = new StareLibera();
		eliberata.modificaStare(this);
	}
	
}
