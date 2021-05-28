package ro.ase.cts.teste;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;

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
	
	@Test
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<10; i++) {
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<5; i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.66f, grupa.getPromovabilitate(), 0.1);
	}
	
	@Test
	public void testGetPromovabilitateLimitataInferioare() {
		Grupa grupa = new Grupa(1001);
		for(int i=0; i<5; i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	public void testGetPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<10; i++) {
			IStudent student = new Student();
			student.adaugaNota(6);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1050);
		grupa.getPromovabilitate();
	}
	
	@Test
	public void testGetPromovabilitateCardinality1() {
		Grupa grupa = new Grupa(1081);
		IStudent stud = new Student();
		stud.adaugaNota(5);
		stud.adaugaNota(6);
		grupa.adaugaStudent(stud);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
}
