package listes;

import java.util.ArrayList;
import java.util.Arrays;



public class TestVille {

	public static void main(String[] args) {
		ArrayList<Ville> listVille = new ArrayList<Ville>();
		listVille.add(new Ville("Nice", 343000));
		listVille.add(new Ville("Carcassonne", 47800));
		listVille.add(new Ville("Narbonne", 53400));
		listVille.add(new Ville("Lyon", 484000));
		listVille.add(new Ville("Foix", 9700));
		listVille.add(new Ville("Pau", 77200));
		listVille.add(new Ville("Marseille", 850700));
		listVille.add(new Ville("Tarbes", 40600));

		int z = 100000;
		int y = listVille.get(0).getNbHabitants();
		String nomVilleP = "";
		int nbhabP = 0;
		String nomVilleG = "";
		int nbhabG = 0;


		//ville plus grande

		for(int i=0;i<listVille.size();i++) {
			if (y<listVille.get(i).getNbHabitants()) {

				nomVilleG=listVille.get(i).getNom();
				nbhabG = listVille.get(i).getNbHabitants();

			}

			//ville plus petite

			for(int w=0;w<listVille.size();w++) {
				if (y>listVille.get(w).getNbHabitants()) {
					nomVilleP=listVille.get(w).getNom();
					nbhabP = listVille.get(w).getNbHabitants();


				}
			}

			for (int j=0;j<listVille.size();j++) {
				if (z<listVille.get(j).getNbHabitants()) {}
				listVille.toString().toUpperCase();



			}
		}
		for (int k=0;k<listVille.size();k++) {


			System.out.println(listVille.get(k).getNom() + " "+listVille.get(k).getNbHabitants());
		}
		System.out.println("La plus grande ville est :"+nomVilleG + " avec "+nbhabG+ " Habitants");
		System.out.println("La plus petite ville est :"+nomVilleP + " avec "+nbhabP+ " Habitants");
	}
}
