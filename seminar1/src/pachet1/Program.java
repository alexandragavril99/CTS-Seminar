package pachet1;

import clase.Giraffe;
import clase.Zoo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zoo zoo = new Zoo();
		
		Giraffe g1 = new Giraffe("Girafa 1");
		Giraffe g2 = new Giraffe("Girafa 2");

		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		zoo.feedAnimals();
	}

}
