package ro.ase.cts.teste;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;

public class TesteGrupa {

	@Test
	public void testConstructorNrGrupaCorect() {
		Grupa grupa = new Grupa(1081);
		assertEquals(1081, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorExistaLista() {
		//principiul existence
		Grupa grupa = new Grupa(1081);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptieConstructorInferior() {
		Grupa grupa = new Grupa(900);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptieConstructorSuperior() {
		Grupa grupa = new Grupa(1200);
	}
	
	@Test(timeout = 500)
	public void testPerformanceConstructor() {
		Grupa grupa = new Grupa(1005);
	}
	
	//JUnit 5
//	@Test
//	public void testPerformanceConstructorV5() {
//		assertTimeout(Duration.ofMillis(500), () -> {new Grupa(1081);});;
//	}
	
}
