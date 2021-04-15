package ro.ase.cts.decorator.clase;

public class DecoratorCuLaMultiAni extends DecoratorAbstract{

	public DecoratorCuLaMultiAni(INota nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: La multi ani!");
	}

	@Override
	public void printeaza() {
		// TODO Auto-generated method stub
		super.printeaza();
		System.out.println("La multi ani!");
	}
	
}
