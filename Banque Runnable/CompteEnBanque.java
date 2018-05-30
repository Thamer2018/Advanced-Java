/**
 * @author thame
 *
 */
public class CompteEnBanque {
	private int solde = 100;

	/**
	 * @return this.solde
	 */
	public int getSolde() {
		if (this.solde < 0)
			System.out.println("Vous êtes à découvert !");

		return this.solde;
	}

	/**
	 * @param retrait
	 */
	public synchronized void retraitArgent(int retrait) {
		solde = solde - retrait;
		System.out.println("Solde = " + solde);
	}
}