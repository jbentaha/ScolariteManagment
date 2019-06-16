package pack1;

public class Matiere {
	
	private String nom;
	private String description;
	private int vHoraire;
	private int nbEtudiants;
	private double note;
	private int coef;

	public Matiere(String nom, int coef) {
		this.nom = nom;
		this.coef = coef;
	}
	
	public double getNote() {
		return note;
	}

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

	public void setNote(double note) {
		this.note = note;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getvHoraire() {
		return vHoraire;
	}
	
	public void setvHoraire(int vHoraire) {
		this.vHoraire = vHoraire;
	}
	
	public int getNbEtudiants() {
		return nbEtudiants;
	}
	
	public void setNbEtudiants(int nbEtudiants) {
		this.nbEtudiants = nbEtudiants;
	}
	
	@Override
	public Matiere clone() {
		return new Matiere(this.getNom(), this.getCoef());
	}
}
