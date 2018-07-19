package zoo;

public class GestionZoo {

	public static void main(String[] args) {
		Zoo zoo1 = new Zoo("Tp");
		zoo1.getAquarium().addAnimal(new Animal("toto", "poisson"));
		zoo1.getAquarium().addAnimal(new Animal("dent de la mer","Requin"));
		zoo1.getCarnivore().addAnimal(new Animal("cour plus vite", "Lion"));
		zoo1.getCarnivore().addAnimal(new Animal("bipbip", "jaguar"));

		for(int i =0;i<1; i++){
			if (zoo1.getZone.animaux[i]!=null){
				System.out.println(zoo1.getCarnivore());
				System.out.println(zoo1.getAquarium());

			}}
	}

}
