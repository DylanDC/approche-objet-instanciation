package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne b = new Personne();
		b.nom = "Djamel";
		b.prenom = "Djamel";
		b.adresse = new AdressePostale();
		b.adresse.numeroRue = 5;
		b.adresse.libelleRue = "rue de ..";
		b.adresse.codePostale = 44000;
		b.adresse.ville = "Nantes";
		
				

	}

}
