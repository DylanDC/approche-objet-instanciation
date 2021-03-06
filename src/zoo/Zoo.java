package zoo;



public class Zoo {
	private String nom;
	private Zone savaneAfr;
	private Zone carnivore;
	private Zone aquarium;
	private Zone fermeReptiles;
	private Zone voliere;
	
		public Zoo(String nom){
			this.nom=nom;
			savaneAfr = new Zone("Savane Africaine");
			carnivore = new Zone ("Zone Carnivore");
			aquarium = new Zone ("Aquarium");
			fermeReptiles = new Zone("La ferme aux reptiles");
			voliere = new Zone ("La voliere");
		
			
		}
		

			public void addAnimal(Animal animal) {
				if (animal.getfamille().equals("Mammif�re")&& animal.getRegimeAlimentaire().equals("carnivore")) {
					 carnivore.addAnimal(animal);
					
				}else if (animal.getfamille().equals("Mammif�re")&& animal.getRegimeAlimentaire().equals("herbivore")) {
					 savaneAfr.addAnimal(animal);
					
				}else if (animal.getfamille().equals("Reptile")) {
					 fermeReptiles.addAnimal(animal);
					
				}else if (animal.getfamille().equals("Poisson")) {
					 aquarium.addAnimal(animal);
					
				}
			}
			
			public void listerAnnimaux() {
				savaneAfr.listerAnnimaux();
				carnivore.listerAnnimaux();
				aquarium.listerAnnimaux();
				fermeReptiles.listerAnnimaux();
				voliere.listerAnnimaux();
				
				
				
			}
			
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public Zone getSavaneAfr() {
			return savaneAfr;
		}

		public void setSavaneAfr(Zone savaneAfr) {
			this.savaneAfr = savaneAfr;
		}

		public Zone getCarnivore() {
			return carnivore;
		}

		public void setCarnivore(Zone carnivore) {
			this.carnivore = carnivore;
		}

		public Zone getAquarium() {
			return aquarium;
		}

		public void setAquarium(Zone aquarium) {
			this.aquarium = aquarium;
		}

		public Zone getFermeReptiles() {
			return fermeReptiles;
		}

		public void setFermeReptiles(Zone fermeReptiles) {
			this.fermeReptiles = fermeReptiles;
		}

		public Zone getVoliere() {
			return voliere;
		}

		public void setVoliere(Zone voliere) {
			this.voliere = voliere;
		}

}