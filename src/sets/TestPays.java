package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {
		Set<Pays> paysSet = new HashSet<Pays>();
        paysSet.add(new Pays("United States of America", 324_811_000, 55_805.204,0));
        paysSet.add(new Pays("France", 67_795_000, 41_180.697,0));
        paysSet.add(new Pays("Allemagne", 82_800_000, 45_888.423,0));
        paysSet.add(new Pays("UK", 65_648_100, 41_158.909,0));
        paysSet.add(new Pays("Italie", 60_589_445, 35_708,0));
        paysSet.add(new Pays("Japon", 126_451_398, 41_300,0));
        paysSet.add(new Pays("Chine", 1_415_140_963, 14_107.431,0));
        paysSet.add(new Pays("Russie", 146_880_400, 24_026,0));
        paysSet.add(new Pays("Inde", 1_281_935_911, 5_855.306,0));
        
        
     //--------------------------------------------------------
      		//mise de la liste Hashset dans une ArrayList
      		List<Pays> listSet = new ArrayList<>();
      		listSet.addAll(paysSet);
      		
    //--------------------------------------------------------	
      		//initilaisation des variables
      		double pib = listSet.get(0).getPibHabitants();
    		String nomPays = null;
    		int nbhab = 0;
    		double pibTotal= listSet.get(0).getPibHabitants()*listSet.get(0).getNbHabitants();
    		double calculPIP= listSet.get(0).getPibHabitants()*listSet.get(0).getNbHabitants();

    //---------------------------------------------------------
    		//Pays avec le plus grand PIB
    		for (int i = 0; i < listSet.size(); i++) {
    			if (pib < listSet.get(i).getPibHabitants()) {
    				pib = listSet.get(i).getPibHabitants();
    				nomPays = listSet.get(i).getNom();
    				nbhab = listSet.get(i).getNbHabitants();

    			}
    		}
    		System.out.println("Le PAYS avec le plus grand PIB est : " + nomPays + " de "+ nbhab +" habitants");
    //----------------------------------------------------------
    		//Pays avec le plus grand PIB total
    		for (int i = 0; i < listSet.size(); i++) {
    			if (pibTotal < listSet.get(i).getPibHabitants()*listSet.get(i).getNbHabitants()) {
    				pibTotal = listSet.get(i).getPibHabitants()*listSet.get(i).getNbHabitants();
    				nomPays = listSet.get(i).getNom();
    				nbhab = listSet.get(i).getNbHabitants();
    				
    			}
    		}
    		System.out.println("Le PAYS avec le plus grand PIB Totale est : " +nomPays+ " avec " +nbhab+ " habitants");
    //----------------------------------------------------------		
    		//Mise en majuscule des Pays avec le PIB totale le plus petit
    		pibTotal= listSet.get(0).getPibHabitants()*listSet.get(0).getNbHabitants();
    		for (int i = 0; i < listSet.size(); i++) {
    			if (listSet.get(i).getPibHabitants()*listSet.get(i).getNbHabitants()<pibTotal ) {
    				listSet.get(i).setNom(listSet.get(i).getNom().toUpperCase());
    			}

    		}
    		
    		
    //----------------------------------------------------------
    	// Affichage Nom + habitant + Pibtotal
    	for (int i = 0; i < listSet.size(); i++){
    		calculPIP= listSet.get(i).getPibHabitants()*listSet.get(i).getNbHabitants();
    		listSet.get(i).setCalculPIB(calculPIP);
    	}
    		System.out.println(listSet);
    	
    //----------------------------------------------------------
    		
    		//Resultat Pre-test
    		
    		//System.out.println(listSet);
    		
	}

}
