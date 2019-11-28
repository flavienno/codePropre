package ex1;

import java.util.Date;

public class Entreprise {
	/**
	 * Siret d'une entreprise
	 */
	private int Siret;
	/**
	 * nom de l'entreprise
	 */
	private String nom;
	/**
	 * adresse de l'entreprise
	 */
	private String adresse;
	/**
	 * date de création de l'entreprise
	 */
	private Date date_Creation;
	/**
	 * capital de l'entreprise
	 */

	public static final int capitalMax = 3000000;

	public void afficherStatut() {

	}

	/**
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param date_Creation
	 */
	public Entreprise(int siret, String nom, String adresse, Date date_Creation) {
		super();
		Siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.date_Creation = date_Creation;
	}

	/** Getter
	 * @return the siret
	 */
	public int getSiret() {
		return Siret;
	}

	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		Siret = siret;
	}

	/** Getter
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

	/** Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter
	 * @return the date_Creation
	 */
	public Date getDate_Creation() {
		return date_Creation;
	}

	/** Setter
	 * @param date_Creation the date_Creation to set
	 */
	public void setDate_Creation(Date date_Creation) {
		this.date_Creation = date_Creation;
	}

	/** Getter
	 * @return the capitalmax
	 */
	public static int getCapitalmax() {
		return capitalMax;
	}

}
