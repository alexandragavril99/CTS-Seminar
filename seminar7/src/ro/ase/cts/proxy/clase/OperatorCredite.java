package ro.ase.cts.proxy.clase;

public class OperatorCredite implements IOperatorCredite{

	@Override
	public void creareCredit(Moneda moneda, int suma) {
		System.out.println("A fost oferit creditul de " + suma+" "+moneda);
	}
	

}
