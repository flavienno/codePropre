package ex1;

/**
 * Classe qui réalise des opérations arythmétiques
 * 
 * @author DIGINAMIC
 */
public class Calcul {

	/**
	 * variable a de type int
	 */
	private int a;
	/**
	 * variable b de type int
	 */
	private int b;

	/**
	 * Méthode qui retourne l'addition des paramètres a et b
	 * 
	 * @param a
	 *            paramètre a
	 * @param b
	 *            paramètre b
	 * @return int
	 */
	public int addition(int a, int b) {
		return a + b;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int get2(int a, int b) {
		return a - b;
	}

	/**
	 * @param a
	 * @param b
	 */
	public Calcul(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	/**
	 * Getter
	 * 
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * Setter
	 * 
	 * @param a
	 *            the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * Getter
	 * 
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * Setter
	 * 
	 * @param b
	 *            the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
}
