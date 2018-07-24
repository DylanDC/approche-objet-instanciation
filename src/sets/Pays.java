package sets;

public class Pays {
	private String nom;
	private int nbHabitants;
	private double pibHabitants;
	private double calculPIB;
	
	//--------------------------------------------
		//Constructeur
	public Pays(String nom, int nbHabitants, double pibHabitants, double calculPIB) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHabitants = pibHabitants;
		this.calculPIB = calculPIB;
	}
	//--------------------------------------------
		//To String [formatage en sortie]
	@Override
	public String toString() {
		return "nom=" + nom + " nbHabitants=" + nbHabitants + " pibHabitants=" + pibHabitants +  " PIB Total :"+calculPIB+ "\n";
	}
	
	//--------------------------------------------
			//Getter and Setter
	public double getCalculPIB() {
		return calculPIB;
	}

	public void setCalculPIB(double calculPIB) {
		this.calculPIB = calculPIB;
	}

	public void setPibHabitants(double pibHabitants) {
		this.pibHabitants = pibHabitants;
	}

	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	public double getPibHabitants() {
		return pibHabitants;
	}
	

}
