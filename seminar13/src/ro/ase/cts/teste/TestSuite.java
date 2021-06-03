package ro.ase.cts.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TesteGrupa.class,
	TesteGrupaMock.class,
	TesteGrupaFixture.class
})
public class TestSuite {

}
