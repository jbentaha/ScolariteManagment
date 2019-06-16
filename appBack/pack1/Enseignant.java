package pack1;

import java.util.ArrayList;
import java.util.List;
import pack2.Personne;
import services.EtudiantsService;

public class Enseignant extends Personne{
	
	private EtudiantsService etudiants = new EtudiantsService();
	
	public Enseignant(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}
	
	public void addMatieresAEtudiant(String cne, List<Matiere> ms) {
		List<Matiere> mCloned = new ArrayList<Matiere>(ms.size());
		for(Matiere m : ms) {
			Matiere mc = (Matiere)m.clone();
			mCloned.add(mc);
		}
		for (Etudiant etud : etudiants.getEtudiants()) {
			if(etud.getCne().equals(cne)) {
				etud.setMatieres(mCloned);
			}
		}
	}
	
	public void addMatiereAEtudiant(String cne, Matiere m) {
		for (Etudiant etud : etudiants.getEtudiants()) {
			if(etud.getCne().equals(cne)) {
				etud.addMatiere(m);
			}
		}
	}
	
	public List<Etudiant> getEtudiants(){
		return etudiants.getEtudiants();
	}

	public void giveNote(String cne, String matiere, double note) {
		Etudiant currentEtud = etudiants.getEtudiant(cne);
		if(currentEtud != null) {
			for(Matiere m : currentEtud.getMatieres()){
				if(m.getNom().equals(matiere))
					m.setNote(note);
			}
		}
		else
			System.out.println("vous essayez d'attribuer la note "+note+" en "+matiere+" pour un étudiant inconnue !");
	}

}
