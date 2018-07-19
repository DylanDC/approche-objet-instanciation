package zoo;

import java.util.Arrays;

public class Zone {
	private String nom;
	private Animal[] animaux; 
	private int compteur;
	public Zone (String nom){
		this.nom=nom;
		animaux = new Animal[100];
	 }
	
	
	@Override
	public String toString() {
		return "Zone [nom=" + nom + ", animaux=" + Arrays.toString(animaux) + ", compteur=" + compteur + "]";
	}


	public void addAnimal(Animal animal){
		for (int i = 0; i<animaux.length; i++){
			if (animaux[i]==null){
				animaux[i]=animal;
				compteur++;
				break;
				
			}
			
		}
		
		
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Animal[] getAnimaux() {
		return animaux;
	}

	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}
	 
 }

	
