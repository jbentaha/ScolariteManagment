package services;

import java.util.ArrayList;
import java.util.List;

import pack1.Matiere;

public class MatieresService {

	private List<Matiere> matieres = new ArrayList<>();
	
	public MatieresService() {
		Matiere jee = new Matiere("JEE", 6);
		Matiere com = new Matiere("COMMUNICATION", 3);
		Matiere android = new Matiere("ANDROID", 3);
		Matiere ws = new Matiere("WEB SERVICE", 3);
		Matiere cloud = new Matiere("CLOUD", 3);
		Matiere english = new Matiere("ENGLISH", 3);
		Matiere bigData = new Matiere("BIG DATA", 3);
		
		this.matieres.add(jee);
		this.matieres.add(com);
		this.matieres.add(android);
		this.matieres.add(ws);
		this.matieres.add(cloud);
		this.matieres.add(english);
		this.matieres.add(bigData);
	}
	
	public void addMatiere(Matiere m) {
		this.matieres.add(m);
	}
	
	public List<Matiere> getMatieres(){
		return this.matieres;
	}
	
	@Override
	public boolean equals(Object o) {
		Matiere m = (Matiere) o;
		boolean res = false;
		for(Matiere ma : matieres) {
			if(ma.getNom().equals(m.getNom()) && ma.getCoef() == m.getCoef())
				res = true;
		}
		
		return res;
	}
	
}
