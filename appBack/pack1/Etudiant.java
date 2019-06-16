package pack1;

import java.util.ArrayList;
import java.util.List;

import pack2.Mention;
import pack2.Personne;

public class Etudiant extends Personne{

	private String cne;
	private double moyenne;
	private int anneeEtudes;
	private Mention mention;
	private List<Matiere> matieres;
	
	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}
	
	public Etudiant(String nom, String prenom, int age, String cne) {
		super(nom,prenom,age);
		this.setCne(cne);
		matieres = new ArrayList<Matiere>();
	}
	
	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	public void addMatiere(Matiere matiere) {
		this.matieres.add(matiere);
	}
	
	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double note) {
		this.moyenne = note;
	}

	public int getAnneeEtudes() {
		return anneeEtudes;
	}

	public void setAnneeEtudes(int anneeEtudes) {
		this.anneeEtudes = anneeEtudes;
	}

	public Mention getMention(double note) {
		setMention(note);
		return mention;
	}

	public void setMention(double note) {
		if(note < 10)
			this.mention = Mention.AJOURNEE;
		else 
			if(note>=10 && note<12)
				this.mention = Mention.PASSABLE;
			else 
				if(note>=12 && note<14)
					this.mention = Mention.ASSEZBIEN;
				else
					if(note>=14 && note<16)
						this.mention = Mention.BIEN;
					else 
						if(note>=16 && note<=20)
							this.mention = Mention.EXCELLENT;
						else {
							System.out.println("note non reconnue");
						}
		
	}
	
	@Override
	public String toString() {
		String chaine = "";
		chaine += "********* Info de "+this.getNom()+" "+this.getPrenom()+" *********"+"\n";
		for (Matiere m : this.getMatieres()) {
			chaine += m.getNom()+" ("+m.getNote()+"), ";
		}
		chaine += "\n";
		chaine += "la moyenne générale de "+this.getNom()+" est de "+this.getMoyenne()+" avec une mention de "+this.getMention(getMoyenne());
		chaine += "\n";
		
		return chaine;
	}
	
	@Override
	public boolean equals(Object o) {
		Etudiant e = (Etudiant) o;
		if(this.getNom().equals(e.getNom()) && this.getPrenom().equals(e.getPrenom()) && this.getAge() == e.getAge())
			return true;
		else
			return false;
	}
	
}
