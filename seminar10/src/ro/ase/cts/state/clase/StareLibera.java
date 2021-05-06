package ro.ase.cts.state.clase;

public class StareLibera implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Nu putem elibera masa.");
		} else {
			masa.setStare(this);
			System.out.println("Masa cu nr "+ masa.getNumar() + " a fost ocupata.");
		}
	}

}
