package TestZoo;

import zoo.Mammifère;
import zoo.Poisson;
import zoo.Reptile;
import zoo.Zoo;

public class GestionZoo {

	public static void main(String[] args) {
		Zoo zoo1 = new Zoo("Tp");
		zoo1.addAnimal(new Poisson("toto", "poisson", "vegetarien"));
		zoo1.addAnimal(new Poisson("dent de la mer","Requin", "carnivore"));
		zoo1.addAnimal(new Mammifère("cour plus vite", "Lion", "carnivore"));
		zoo1.addAnimal(new Mammifère("1", "Lion", "carnivore"));
		zoo1.addAnimal(new Mammifère("2", "Lion", "carnivore"));
		zoo1.addAnimal(new Mammifère("3", "gazelle", "herbivore"));
		zoo1.addAnimal(new Mammifère("4", "antilope", "herbivore"));
		zoo1.addAnimal(new Mammifère("5", "zèbre", "herbivore"));
		zoo1.addAnimal(new Poisson("6", "requin", "carnivore"));
		zoo1.addAnimal(new Poisson("7", "morue", "hebivore"));
		zoo1.addAnimal(new Reptile("8", "anaconda", "carnivore"));
		zoo1.addAnimal(new Reptile("9", "boa", "carnivore"));
		
		

		zoo1.listerAnnimaux();
		
	}

}
