package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/**
	 * @param solde
	 * @param decouvert
	 */
    public CompteBancaire(double solde, double decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
    public boolean debiterMontant(double montant) {
        if (this.solde - montant >= -this.decouvert) {
            this.solde -= montant;
            return true;
        } else {
            return false;
        }
    }
	
    /**
     * retourne le solde
     * @return
     */
    public double getSolde() {
        return solde;
    }
    
    public void appliquerRemuAnnuelle() {
        // Cette méthode est destinée à être redéfinie par les sous-classes qui ont besoin de la rémunération annuelle.
    }
}
