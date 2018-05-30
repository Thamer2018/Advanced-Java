/**
 * @author thame
 *
 */
public class TestBanqueRunnable {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CompteEnBanque cb = new CompteEnBanque();

		Thread t = new Thread(new RunImpl(cb, "Cysboy"));
		Thread t2 = new Thread(new RunImpl(cb, "Zéro"));
		t.start();
		t2.start();
	}
}