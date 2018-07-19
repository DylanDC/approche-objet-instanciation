package zoo;

public class Animal {

	private String nom;
	private String type;
	
	
	public Animal (String nom,String type){
		this.nom=nom;
		this.type=type;
		
		
		
	}


	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + "]";
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
}
