package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiecte;
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareRaspunsProiect(Proiect proiect){
//		if(punctaj >= proiect.getPragDeAcceptare())
//			System.out.println("Aplicantul "+nume+" "+prenume+" a fost acceptat.");
//		else
//			System.out.println("Aplicantul "+nume+" "+prenume+" nu a fost acceptat.");
		boolean esteAcceptat= punctaj >= proiect.getPragDeAcceptare();
		StringBuilder stringBuilder = new StringBuilder("Aplicantul ").append(nume).append(" ").append(prenume).append(" ");
		stringBuilder.append(esteAcceptat ? " a fost acceptat." : " a fost respins");
		System.out.println(stringBuilder.toString());
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = denumireProiect;
	}
	public int getnrProiecte() {
		return nrProiecte;
	}
	public void setnrProiecte(int nrProiecte) {
		this.nrProiecte = nrProiecte;
	}
	
	public String[] getDenumiriProiecte() {
		return denumiriProiecte;
	}
	public void setDenumiriProiecte(String[] denumiriProiecte) {
		this.denumiriProiecte = denumiriProiecte;
	}
	
	public void setVectorDenumiri(String[] denumiriProiecte, int nrProiecte) {
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}
	
	public abstract float getSumaFinantare();
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nrProiecte=");
		builder.append(nrProiecte);
		builder.append(", denumiriProiecte=");
		builder.append(Arrays.toString(denumiriProiecte));
		return builder.toString();
	}
	
	
}
