package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne b = new Personne("ddc","Dylan",new AdressePostale(20,"rue de la liberation",17260,"Gemozac"));
		/*
		//methode modification sortie
		String nomMaj = b.getidentite();
		System.out.println(nomMaj);


		b.setNomModif("hey");
		System.out.println(b);

		b.setPrenomModif("yo");
		System.out.println(b);

		AdressePostale d = new AdressePostale(5,"foret",00000,"test");
		b.setAdressePostale (d);
		System.out.println(b);

		//System.out.println(nomModif);



		//methode retour 	

		AdressePostale adresseb = b.getAdressePostale();
		System.out.println(adresseb);


		String Nom = b.getNom();
		System.out.println(Nom);

		String prenom = b.getPrenom();
		System.out.println(prenom);

		 */
		//Personne valorise = new Personne("abc","123",new AdressePostale(20,"rue de la liberation",17260,"Gemozac"));
		b.setNomModif("Durand");
		b.setPrenomModif("David");
		AdressePostale david = new AdressePostale(5,"foret",00000,"test");
		b.setAdressePostale (david);
		System.out.println(b);

	}

}
