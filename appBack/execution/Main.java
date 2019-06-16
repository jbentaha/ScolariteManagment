package execution;

import pack1.Etudiant;

public class Main {
	
	public static void main(String[] args) {
		
		Scolarite sc = new Scolarite();
		sc.saisirInfos();
		int nbThreads = sc.getNbEtudiants();
		
		Thread t[] = new Thread[nbThreads];
		
		int i=0;
		for(Etudiant e : sc.getEtudiants()) {
			t[i] = new Thread(new Scolarite(e));
			t[i].start();
			i++;
		}
		
		for(int j=0; j<t.length; j++) {
			try {
				t[j].join();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		for (Etudiant e : sc.getEtudiants()) {
			System.out.println(e.toString());
		}
		
	}

}
