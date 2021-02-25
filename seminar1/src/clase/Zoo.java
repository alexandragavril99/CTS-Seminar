package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{
	private Zookeeper zookeeper;
	private List<Animal> animalList;
	
	public Zoo() {
		super();
		this.zookeeper = new Zookeeper("Ion");
		this.animalList = new ArrayList<>();
	}
	
	public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
		super();
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal a : animalList) {
			zookeeper.feed(a);
		}
	}
	
}
