package entites;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Personne(String nvnom,String nvprenom, AdressePostale nvadresse ){
		nom = nvnom;
		prenom = nvprenom;
		adresse = nvadresse;


	}
	
	
//methode 
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}


	public String getNom(){
		return nom;

	}

	public String getPrenom() {
		return prenom;
	}
	
	public AdressePostale getAdressePostale(){
		return adresse;
	}
	
//methode qui modifie la valeur retournée
	public void setNomModif(String nvnom) {
		nom=nvnom;
	}


	public void setPrenomModif(String nvprenom) {
		prenom=nvprenom;
	}

	public String getidentite(){
		return nom.toUpperCase()+ ""+prenom;

	}
	
	public void setAdressePostale(AdressePostale nvAdresse){
		adresse = nvAdresse;
	}
	

}




