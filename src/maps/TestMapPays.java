package maps;

import java.util.HashMap;
import java.util.Scanner;

public class TestMapPays {




	public static void main(String[] args) {

		//--------------------------------------------------------
		//initialisation HashMap
		HashMap<String,Pays> pays = new HashMap<String,Pays>();
		pays.put("US", new Pays("United States of America", 324_811_000, 55_805.204,0));
		pays.put("FR", new Pays("France", 67_795_000, 41_180.697,0));
		pays.put("DE", new Pays("Allemagne", 82_800_000, 45_888.423,0));
		pays.put("UK", new Pays("UK", 65_648_100, 41_158.909,0));
		pays.put("IT", new Pays("Italie", 60_589_445, 35_708,0));
		pays.put("JP", new Pays("Japon", 126_451_398, 41_300,0));
		pays.put("CN", new Pays("Chine", 1_415_140_963, 14_107.431,0));
		pays.put("RU", new Pays("Russie", 146_880_400, 24_026,0));
		pays.put("IN", new Pays("Inde", 1_281_935_911, 5_855.306,0));


		//--------------------------------------------------------
		//initialisation Scanner + Variable
		Scanner sc= new Scanner(System.in);
		String choix=null;


		//--------------------------------------------------------
		//Calcul du PIB Global du pays

		for (Pays p : pays.values()){
			double calculPIP= p.getPibHabitants()*p.getNbHabitants();
			p.setCalculPIB(calculPIP);
		}


		
		
		//--------------------------------------------------------
		//Comparaison du choix utilisateur + affichage

		do{

			System.out.println("Veuillez entrer un Code pays : ");
			System.out.println("Taper : \"exit\" pour quitter ");
			choix = sc.next();
			
			if(!(choix.equals("exit"))){
			if(pays.containsKey(choix)){
				System.out.println("Nom du Pays : "+pays.get(choix).getNom());
				System.out.println("Nombre d'habitants : "+pays.get(choix).getNbHabitants());
				System.out.println("PIB/habitant : "+pays.get(choix).getPibHabitants());
				System.out.println("PIB global du Pays : "  +pays.get(choix).getCalculPIB()+"\n");
			}
			else{
				
				System.out.println("Ce code n'existe pas, veuillez réessayer \n") ;
			}
			}
			
		}while(!(choix.equals("exit")));

		System.out.println("Aurevoir !!");
	}
}
