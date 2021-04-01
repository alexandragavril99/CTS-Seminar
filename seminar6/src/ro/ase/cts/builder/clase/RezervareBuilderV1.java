package ro.ase.cts.builder.clase;

public class RezervareBuilderV1 implements AbstractBuilder{
	private Rezervare rezervare;
	
	public RezervareBuilderV1() {
		this.rezervare = new Rezervare(0,false,false,false,false,"notFound");
	}
	
	public RezervareBuilderV1(int codRezervare) {
		this.rezervare = new Rezervare(codRezervare,false,false,false,false,"notFound");
	}
	
	public RezervareBuilderV1 setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	
	public RezervareBuilderV1 setAreMancare(boolean areMancare) {
		rezervare.setAreMancare(areMancare);
		return this;
	}
	
	public RezervareBuilderV1 setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	
	public RezervareBuilderV1 setAreBautura(boolean areBautura) {
		rezervare.setAreBautura(areBautura);
		return this;
	}
	
	public RezervareBuilderV1 setAreMuzica(boolean areMuzica) {
		rezervare.setAreMuzicaAmbientala(areMuzica);
		return this;
	}

	public RezervareBuilderV1 setGenMuzical(String genMuzical) {
		rezervare.setGenMuzica(genMuzical);
		return this;
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return rezervare;
	}
	
	
}
