public class Liste {
	public static final int MAXELEMENTS = 100;

	private Object[] tab;// liste
	private int nbrElement;
	private int positionCourante;

	public Liste() {

		tab = new Object[MAXELEMENTS];
		nbrElement = 0;
		positionCourante = 0;

	}

	public void inserer(Object element) {

		if (nbrElement == 0) {

			tab[0] = element;
			nbrElement++;
			positionCourante++;

		}

		else {

			// decalerDroite();

			tab[positionCourante] = element;
			nbrElement++;
			positionCourante++;
		}

	}
}
