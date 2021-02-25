package clase;

//o clasa abstracta nu poate fi instantiata
//poate mosteni alte clase si poate fi mostenita de alte clase
public abstract class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
