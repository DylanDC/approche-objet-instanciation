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
	
	
	
	public String toString() {
		String chaine = "Nom de la zone : "+ nom +"\n";
		for (int i = 0; i<animaux.length;i++) {
			if  (animaux[i]!=null) {
				chaine += animaux[i]+"\n";
			}
			
		}
		return chaine;
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(animaux);
		result = prime * result + compteur;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zone other = (Zone) obj;
		if (!Arrays.equals(animaux, other.animaux))
			return false;
		if (compteur != other.compteur)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
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



	public void listerAnnimaux() {
		// TODO Auto-generated method stub
		System.out.println("Nom de la zone" + nom);
		for(int i = 0; i<animaux.length; i++) {
			if (animaux[i]!=null) {
				System.out.println(animaux[i]);
			}
		}
	}
	 
 }

	
