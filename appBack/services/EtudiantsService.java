package services;

import java.util.ArrayList;
import java.util.List;

import pack1.Etudiant;

public class EtudiantsService {

	private List<Etudiant> etudiants = new ArrayList<>();
	
	public EtudiantsService() {
		Etudiant jaouadEtud = new Etudiant("bentahar", "jaouad", 24, "bj24");
		Etudiant zakariaEtud = new Etudiant("moumene", "zakaria", 23, "mz23");
		Etudiant ivanEtud = new Etudiant("kovarin", "ivan", 23, "ki23");
		Etudiant zackEtud = new Etudiant("lahrach", "zakarya", 24, "lz25");
		
		etudiants.add(jaouadEtud);
		etudiants.add(zakariaEtud);
		etudiants.add(ivanEtud);
		etudiants.add(zackEtud);
	}
	
	public List<Etudiant> getEtudiants(){
		return this.etudiants;
	}
	
	public Etudiant getEtudiant(String cne) {
		Etudiant ifFound = null;
		for (Etudiant etudiant : etudiants) {
			if(etudiant.getCne().equals(cne))
				ifFound = etudiant;
		}
		
		return ifFound;
	}

	public void addEtudiant(Etudiant etudiant) {
		etudiants.add(etudiant);
	}
}
