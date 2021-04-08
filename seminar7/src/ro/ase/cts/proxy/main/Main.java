package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.Moneda;
import ro.ase.cts.proxy.clase.OperatorCredite;
import ro.ase.cts.proxy.clase.OperatorCrediteProxy;

public class Main {

	public static void main(String[] args) {
		OperatorCredite operator = new OperatorCredite();
		operator.creareCredit(Moneda.EUR, 4000);
		
		OperatorCrediteProxy proxy = new OperatorCrediteProxy(operator);
		proxy.creareCredit(Moneda.EUR, 4000);
		proxy.creareCredit(Moneda.RON, 10000);
	}

}
