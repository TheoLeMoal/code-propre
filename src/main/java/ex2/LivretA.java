package ex2;

/**
 * 
 */
public class LivretA extends CompteBancaire {

	private double tauxRemuneration;
	
	/**
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0); // Le découvert est toujours 0 pour un livret A
        this.tauxRemuneration = tauxRemuneration;
    }
	
    @Override
    public void appliquerRemuAnnuelle() {
        double interet = getSolde() * tauxRemuneration / 100;
        ajouterMontant(interet); // Ajoute l'intérêt au solde
    }
}
