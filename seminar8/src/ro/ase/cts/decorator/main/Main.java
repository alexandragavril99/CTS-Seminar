package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorUrarePaste;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		
		NotaDePlata notaInitiala = new NotaDePlata(55);
		notaInitiala.printeaza();
		System.out.println();
		
		DecoratorAbstract decoratorLaMultiAni = new DecoratorCuLaMultiAni(notaInitiala);
		decoratorLaMultiAni.printeazaFelicitare();
		System.out.println();
		decoratorLaMultiAni.printeaza();
		System.out.println();
		
		DecoratorAbstract decoratorPaste = new DecoratorUrarePaste(notaInitiala);
		decoratorPaste.printeaza();
		System.out.println();
		
		NotaDePlata notaDePlata = new NotaDePlata(150);
		DecoratorAbstract decoratorLaMultiAni2 = new DecoratorCuLaMultiAni(notaDePlata);
		DecoratorAbstract decoratorUrarePaste2 = new DecoratorUrarePaste(decoratorLaMultiAni2);
		decoratorUrarePaste2.printeaza();
	}

}
