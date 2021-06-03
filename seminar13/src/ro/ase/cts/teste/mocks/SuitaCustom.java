package ro.ase.cts.teste.mocks;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.teste.TesteGrupaFixture;
import ro.ase.cts.teste.TesteGrupaMock;
import ro.ase.cts.teste.categorii.ConstructorGrupaCategory;
import ro.ase.cts.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.teste.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)
@Suite.SuiteClasses({
	TesteGrupaMock.class,
TesteGrupaMock.class,
TesteGrupaFixture.class
})
//@Categories.IncludeCategory({GetPromovabilitateCategory.class, TesteGrupaFixture.class})
@Categories.ExcludeCategory({GetPromovabilitateCategory.class, ConstructorGrupaCategory.class})
public class SuitaCustom {

}
