package ro.ase.cts.clase;

public class Infirmier extends PersonalSpital{
	
	public Infirmier(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nInfirmier: " + super.getNume();
	}
}
