package ro.ase.cts.command.clase;

public class ComandaOcupare extends Comanda{

	public ComandaOcupare(Masa masa) {
		super(masa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.masa.ocupaMasa();
	}

}
