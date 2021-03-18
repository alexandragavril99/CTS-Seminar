package ro.ase.cts.clase;

public class Gara {
	private int nrTrenuri;
	private String oras;
	private float pretMaximBilet;
	private static Gara instance = null;
	
	private Gara(int nrTrenuri, String oras, float pretMaximBilet) {
		super();
		this.nrTrenuri = nrTrenuri;
		this.oras = oras;
		this.pretMaximBilet = pretMaximBilet;
	}
	
	private Gara() {
		this.nrTrenuri = 5;
		this.oras = "Bucuresti";
		this.pretMaximBilet = 80.5f;
	}
	
	public static synchronized Gara getInstance(int nrTrenuri, String oras, float pretMaximBilet) {
		if(instance == null) {
			instance = new Gara(nrTrenuri,oras,pretMaximBilet);
		}
		return instance;
	}

	public void setNrTrenuri(int nrTrenuri) {
		this.nrTrenuri = nrTrenuri;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public void setPretMaximBilet(float pretMaximBilet) {
		this.pretMaximBilet = pretMaximBilet;
	}


	public static void setInstance(Gara instance) {
		Gara.instance = instance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gara [nrTrenuri=");
		builder.append(nrTrenuri);
		builder.append(", oras=");
		builder.append(oras);
		builder.append(", pretMaximBilet=");
		builder.append(pretMaximBilet);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
