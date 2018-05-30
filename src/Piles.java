public class Piles {

	public static final int MAXELEMENTS = 100;
	public static final int VIDE = -1;

	// Attributs
	private static int[] Tab;
	private static int Sommet;

	public Piles() {// Constructeurs

		Tab = new int[MAXELEMENTS];
		Sommet = VIDE;
	}

	public void empiler(int Element) throws Exception {

		if (MAXELEMENTS == Sommet) {
			throw new Exception("La pile est pleine");
		}

		Tab[++Sommet] = Element;
		System.out.println("Le contenu de la Pile est " + Tab[Sommet]);

	}

	public void desempiler() throws Exception {

		if (Sommet == VIDE) {

			throw new Exception("La pile est vide");
		}

		System.out.println("Le contenu de la Pile est " + Tab[Sommet--]);
	}

}
