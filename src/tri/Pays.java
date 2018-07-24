package tri;

public abstract class Pays implements Comparable<Pays> {
	private String nom;
	private int nbHabitants;
	private double pibHabitants;
	private double calculPIB;
	
	//--------------------------------------------
			//Constructeur
	public Pays(String nom, int nbHabitants, double pibHabitants,double calculPIB) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHabitants = pibHabitants;
		this.calculPIB=calculPIB;
	}
	
	
	//--------------------------------------------
	//To String [formatage en sortie]
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pibHabitants=" + pibHabitants + "PIB du pays = "+ calculPIB+"]";
	}

	//--------------------------------------------
	//Getter and Setter
	
	public String getNom() {
		return nom;
	}


	public double getCalculPIB() {
		return calculPIB;
	}


	public void setCalculPIB(double calculPIB) {
		this.calculPIB = calculPIB;
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


	public void setPibHabitants(double pibHabitants) {
		this.pibHabitants = pibHabitants;
	}
	
	
	

}
