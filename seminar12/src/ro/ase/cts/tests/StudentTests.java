package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Costica";
		Student student = new Student(nume);
		
		assertEquals("Costica", student.getNume());
		assertNotNull("Atributul note nu a fost initializat", student.getNote());
	}
	
	@Test
	public void testConstructorFaraParametrii() {
		Student student = new Student();
		
		assertNotNull(student.getNote());
		assertNotNull(student.getNume());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 5;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testAdaugaNotaDimensiune() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(8);
		
		assertEquals(2, student.getNote().size());
	}
	
	@Test
	public void calculeazaMedieNote() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(8);
		
		assertEquals(6.5f, student.calculeazaMedie(), 0.1);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		
		assertEquals(0, student.calculeazaMedie(), 0.1);
	}
	
	@Test
	public void testCalculeazaMedieCuNota() {
		Student student = new Student();
		student.adaugaNota(5);
		
		assertEquals(5, student.calculeazaMedie(), 0.1);
	}
	
	@Test 
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(3);
		
		 assertTrue(student.areRestante());
	}
	
	@Test 
	public void testNuAreRestanteFals() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);
		
		 assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaExceptie() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);

		//1
		try {
			//2
			student.getNota(5);
			//3
			fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie.");
		} catch (IndexOutOfBoundsException e) {
			//4
		} catch(Exception e) {
			fail("Metoda arunca o alta exceptie");
		}
		//5
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaExceptieV4() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);
		
		student.getNota(5);
	}
	
	//junit5
	@Test
	public void testGetNotaExceptieV5() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);
		
		assertThrows(IndexOutOfBoundsException.class, () -> {student.getNota(5);});
	}
}
