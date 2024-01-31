package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", TypeAnimal.MAMMIFERE, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", TypeAnimal.MAMMIFERE, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", TypeAnimal.POISSON, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Truite dorée", TypeAnimal.POISSON, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", TypeAnimal.REPTILE, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Python", TypeAnimal.REPTILE, Comportement.CARNIVORE));
		
		System.out.println(zoo.taille());
		zoo.afficherListeAnimaux();
	}
}
