package ro.ase.cts.decorator.clase;

public class DecoratorUrarePaste extends DecoratorAbstract{

	public DecoratorUrarePaste(INota nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitare() {
		// TODO Auto-generated method stub
		System.out.println("FELICITARE: Paste fericit!");
	}

	@Override
	public void printeaza() {
		// TODO Auto-generated method stub
		super.printeaza();
		System.out.println("Paste fericit!");
	}
	
	

}
