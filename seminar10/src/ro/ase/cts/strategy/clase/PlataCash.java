package ro.ase.cts.strategy.clase;

public class PlataCash implements IPlata {

	@Override
	public void plateste(float suma) {
		System.out.println("A fost realizata plata cash pentru suma " + suma + " lei.");
	}

}
