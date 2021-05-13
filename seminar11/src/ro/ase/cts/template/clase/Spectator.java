package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract {
	
	private String nume;

	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println("Spectatorul " + this.nume + " s-a asezat la coada.");
	}

	@Override
	public void prezentareBilet() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul " + this.nume + " a prezentat biletul.");
	}

	@Override
	public void realizareControlCorporal() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul " + this.nume + " a fostr controlat.");
	}

	@Override
	public void ocupareLoc() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul " + this.nume + " a ocupat locul.");
	}
	
}
