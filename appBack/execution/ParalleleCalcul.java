package execution;

import java.util.ArrayList;
import java.util.List;

import pack1.Matiere;

public class ParalleleCalcul{

	List<Matiere> matieres = new ArrayList<>();
	
	public ParalleleCalcul(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	public double getMoyenne() {
		double somme = 0;
		double moyenne = (0.00D);
		int coefs = 0;
		for(Matiere m : matieres) {
			coefs += m.getCoef();
			somme += (m.getNote() * m.getCoef());
		}
		moyenne = somme / coefs;	
		
		return moyenne;
	}

}
