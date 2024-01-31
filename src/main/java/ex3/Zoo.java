package ex3;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class Zoo {

	private String nom;
	private List<Animal> animaux = new ArrayList<>();
	
	/**
	 * Constructeur du Zoo
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/**
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}
	
	/**
	 * Afficher la liste des animaux présent dans la zoo
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
	}
	
	/**
	 * @return
	 */
	public int taille() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
