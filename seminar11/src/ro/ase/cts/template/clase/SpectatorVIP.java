package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract{

	private String nume;

	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		// TODO Auto-generated method stub
		System.out.println(this.nume + " nu a mai stat la coada ptc e VIP.");
	}

	@Override
	public void prezentareBilet() {
		// TODO Auto-generated method stub
		System.out.println(this.nume + " a prezentat un bilet VIP.");
	}

	@Override
	public void realizareControlCorporal() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+ " a fost controlat.");
	}

	@Override
	public void ocupareLoc() {
		// TODO Auto-generated method stub
		System.out.println(this.nume + " si-a ocupat locul VIP.");
	}

}
