
public class ListeDouble {

	private class Noeud {

		// La liste peut les utiliser directement via un objet (classe interne)
		// donc pas besoin d'accesseurs et de mutateurs.
		private Object element;
		private Noeud suivant;
		private Noeud precedent;

		// Constructeur par copie d'attributs.
		private Noeud(Object element, Noeud suivant, Noeud precedent) {
			this.element = element;
			this.suivant = suivant;
			this.precedent = precedent;
		}
	}

	// Pointeur sur le premier et le dernier noeud (null lorsque la liste est vide).
	private Noeud debut;
	private Noeud fin;

	// R�f�rence sur la position o� sont effectu� les op�ration.
	private Noeud positionCourante;

	// Maintenu � jour apr�s une insertion ou une suppresion.
	private int nbElements;

	/**
	 * Cr�e une liste vide.
	 */
	public ListeDouble() {

		/**
		 * STRAT�GIE : On initialise explicitement les valeurs plut�t que d'utiliser
		 * l'initialisation automatique de l'environnement.
		 */
		debut = null;
		fin = null;
		positionCourante = null;
		nbElements = 0;

	}

	public boolean estVide() {

		/*
		 * STRAT�GIE : On retourne simplement l'�valuation bool�enne de la comparaison
		 * du nombre d'�l�ments avec 0.
		 */
		return nbElements == 0;
	}

	public void setPosSuivant() {

		/*
		 * STRAT�GIE : Si c'est la fin, on ne d�place pas, sinon on passe au suivant.
		 */
		if (positionCourante.suivant != null) {

			positionCourante = positionCourante.suivant;

		}

	}

	/**
	 * Met la position courante au d�but de la liste.
	 *
	 * Cons�quent : position == debut.
	 */
	public void setPosDebut() {

		/*
		 * STRAT�GIE : On d�place la position courante au noeud point� par d�but.
		 */
		positionCourante = debut;

	}

	public void setPosFin() {

		/*
		 * STRAT�GIE : On d�place la position courante au noeud point� par le pointeur
		 * de fin.
		 */
		positionCourante = fin;

	}

	public void setPosPrecedent() {

		if (positionCourante != debut) {

			positionCourante = positionCourante.precedent;

		}

	}

	public void insererDebut(Object element) {

		debut = new Noeud(element, debut, null);

		// La liste est vide, on place le pointeur de fin.
		if (nbElements == 0)
			fin = debut;

		// Sinon, il faut ajuste le pr�c�dent de l'ancien d�but.
		else
			debut.suivant.precedent = debut;

		// On place la position courante sur le nouveau noeud en t�te de liste.
		positionCourante = debut;

		// Un �l�ment de plus.
		nbElements++;
	}

	public void insererFin(Object element) {

		if (nbElements == 0)
			insererDebut(element);

		// Sinon on ins�re apr�s le dernier.
		else {

			// Cr�ation du nouveau noeud li� apr�s la fin avec cha�nage sur
			// l'ancienne fin
			fin.suivant = new Noeud(element, null, fin);

			// D�place le pointeur de fin.
			fin = fin.suivant;

			// Place la position courante � la fin.
			positionCourante = fin;

			// Un �l�ment de plus.
			nbElements++;
		}
	}

	public void insererApres(Object element) {

		if (nbElements == 0 || positionCourante == fin)
			insererFin(element);

		else {

			// Ajuste le pr�c�dent du suivant de la position courante.
			positionCourante.suivant.precedent = new Noeud(element, positionCourante.suivant, positionCourante);

			// Le suivant de la position courantepointe aussi sur le nouveau noeud.
			positionCourante.suivant = positionCourante.suivant.precedent;

			// On place la position courante sur le suivant.
			positionCourante = positionCourante.suivant;

			nbElements++;
		}
	}

	public void insererAvant(Object element) {

		if (nbElements <= 1 || positionCourante == debut)
			insererDebut(element);

		// On effectue le cha�nage avec le nouveau noeud, des deux c�t�s.
		else {

			// On pourrait utiliser une variable temporaire aussi mais cest inutile.
			positionCourante.precedent.suivant = new Noeud(element, positionCourante, positionCourante.precedent);

			// On ajuste le pr�c�dent de D3 � D2.
			positionCourante.precedent = positionCourante.precedent.suivant;

			// On d�place la position courante sur le nouveau noeud (D2).
			positionCourante = positionCourante.precedent.suivant;

			nbElements++;
		}
	}

	public Object getElement() {

		/*
		 * STRAT�GIE : Retourne simplement l'�l�ment du noeud � la position courante.
		 */
		return positionCourante.element;
	}

	public int getNbElements() {

		return nbElements;
	}

	// La suppression de cha�nage double vous est laiss�e en exercice.

}