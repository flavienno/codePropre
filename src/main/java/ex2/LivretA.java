package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur de la classe LivretA qui hérite de CompteBancaire
	 * 
	 * @param solde
	 * @param decouvert
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle() {

		this.solde = getSolde() + getSolde() * getTauxRemuneration() / 100;

	}

	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > 0) {
			this.solde = getSolde() - montant;
		} else {
			System.out.println("Vous ne pouvez pas être à découvert");
		}
	}

	/**
	 * Getter
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Getter
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

}
