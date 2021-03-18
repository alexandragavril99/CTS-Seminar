package ro.ase.cts.clase;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static float sumaFinantare = 30;

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public float getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Student: ").append(super.toString()).append("Clasa= ").append(clasa).append("Tutore= ")
				.append(tutore);
		return stringBuilder.toString();
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect,
			int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public static float getSumaFinantata() {
		return sumaFinantare;
	}

}
