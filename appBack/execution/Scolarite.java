package execution;

import java.util.List;

import pack1.Enseignant;
import pack1.Etudiant;
import services.MatieresService;

public class Scolarite implements Runnable{

	private Etudiant e = null;
	MatieresService mService = new MatieresService();
	Enseignant boucelma = new Enseignant("Boucelma", "Omar", 57);
	
	public Scolarite() {}
	
	public Scolarite(Etudiant e) {
		this.e = e;
	}

	@Override 
	public void run() {
		ParalleleCalcul pc = new ParalleleCalcul(e.getMatieres());
		e.setMoyenne(pc.getMoyenne());
	}
	
	public void saisirInfos() {
		boucelma.addMatieresAEtudiant("bj24", mService.getMatieres());
		boucelma.addMatieresAEtudiant("mz23", mService.getMatieres());
		boucelma.addMatieresAEtudiant("ki23", mService.getMatieres());
		boucelma.addMatieresAEtudiant("lz25", mService.getMatieres());
		
		boucelma.giveNote("bj24", "JEE", 13.0);
		boucelma.giveNote("bj24", "ANDROID", 14.5);
		boucelma.giveNote("bj24", "CLOUD", 11.0);
		boucelma.giveNote("bj24", "WEB SERVICE", 11.5);
		boucelma.giveNote("bj24", "COMMUNICATION", 13.0);
		boucelma.giveNote("bj24", "ENGLISH", 9.0);
		boucelma.giveNote("bj24", "BIG DATA", 12.0);
		
		boucelma.giveNote("mz23", "JEE", 15.5);
		boucelma.giveNote("mz23", "CLOUD", 17.0);
		boucelma.giveNote("mz23", "WEB SERVICE", 13.5);
		boucelma.giveNote("mz23", "COMMUNICATION", 15.0);
		boucelma.giveNote("mz23", "ANDROID", 18.0);
		boucelma.giveNote("mz23", "ENGLISH", 19.0);
		boucelma.giveNote("mz23", "BIG DATA", 16.0);
		
		boucelma.giveNote("ki23", "JEE", 13.89);
		boucelma.giveNote("ki23", "COMMUNICATION", 14.56);
		boucelma.giveNote("ki23", "CLOUD", 13.0);
		boucelma.giveNote("ki23", "WEB SERVICE", 16.5);
		boucelma.giveNote("ki23", "ANDROID", 16.6);
		boucelma.giveNote("ki23", "ENGLISH", 18.5);
		boucelma.giveNote("ki23", "BIG DATA", 14.0);
		
		boucelma.giveNote("lz25", "JEE", 12.5);
		boucelma.giveNote("lz25", "CLOUD", 12.0);
		boucelma.giveNote("lz25", "WEB SERVICE", 11.5);
		boucelma.giveNote("lz25", "COMMUNICATION", 12.5);
		boucelma.giveNote("lz25", "ANDROID", 14.0);
		boucelma.giveNote("lz25", "ENGLISH", 10.0);
		boucelma.giveNote("lz25", "BIG DATA", 12.0);
	}
	
	public int getNbEtudiants() {
		return boucelma.getEtudiants().size();
	}
	
	public List<Etudiant> getEtudiants(){
		return this.boucelma.getEtudiants();
	}

}
