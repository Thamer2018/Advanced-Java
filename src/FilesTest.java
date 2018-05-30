/**
 * @author thame
 *
 */
public class FilesTest {

	public static int NBRELEMENT = 50;
	// Attributs
	private int[] Tab;
	private int debut;
	private int fin;

	// Contstructeurs
	public Files() {

		Tab = new int[NBRELEMENT];
		debut = -1;
		fin = 0;
	}

	public void enfiler(int Element) {

		if (debut < NBRELEMENT - 1) {
			debut++;
			Tab[debut] = Element;

			System.out.println(Element + " est enfilé dans la File");

			affichage();
		}

		else {
			System.out.println("La file est pleine");
		}
	}

	public void desenfiler() {
		if (debut >= fin) {
			fin++;
			affichage();

		} else {
			System.out.println("La file est vide");
		}
	}

	public void affichage() {

		if (debut >= fin) {
			System.out.println("La File contient");
			for (int compteur = fin; compteur <= debut; compteur++) {
				System.out.println(Tab[compteur]);
			}
		}

	}

}
