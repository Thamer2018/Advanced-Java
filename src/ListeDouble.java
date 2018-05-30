
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

	// Référence sur la position où sont effectué les opération.
	private Noeud positionCourante;

	// Maintenu à jour après une insertion ou une suppresion.
	private int nbElements;

	/**
	 * Crée une liste vide.
	 */
	public ListeDouble() {

		/**
		 * STRATÉGIE : On initialise explicitement les valeurs plutôt que d'utiliser
		 * l'initialisation automatique de l'environnement.
		 */
		debut = null;
		fin = null;
		positionCourante = null;
		nbElements = 0;

	}

	public boolean estVide() {

		/*
		 * STRATÉGIE : On retourne simplement l'évaluation booléenne de la comparaison
		 * du nombre d'éléments avec 0.
		 */
		return nbElements == 0;
	}

	public void setPosSuivant() {

		/*
		 * STRATÉGIE : Si c'est la fin, on ne déplace pas, sinon on passe au suivant.
		 */
		if (positionCourante.suivant != null) {

			positionCourante = positionCourante.suivant;

		}

	}

	/**
	 * Met la position courante au début de la liste.
	 *
	 * Conséquent : position == debut.
	 */
	public void setPosDebut() {

		/*
		 * STRATÉGIE : On déplace la position courante au noeud pointé par début.
		 */
		positionCourante = debut;

	}

	public void setPosFin() {

		/*
		 * STRATÉGIE : On déplace la position courante au noeud pointé par le pointeur
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

		// Sinon, il faut ajuste le précédent de l'ancien début.
		else
			debut.suivant.precedent = debut;

		// On place la position courante sur le nouveau noeud en tête de liste.
		positionCourante = debut;

		// Un élément de plus.
		nbElements++;
	}

	public void insererFin(Object element) {

		if (nbElements == 0)
			insererDebut(element);

		// Sinon on insère après le dernier.
		else {

			// Création du nouveau noeud lié après la fin avec chaînage sur
			// l'ancienne fin
			fin.suivant = new Noeud(element, null, fin);

			// Déplace le pointeur de fin.
			fin = fin.suivant;

			// Place la position courante à la fin.
			positionCourante = fin;

			// Un élément de plus.
			nbElements++;
		}
	}

	public void insererApres(Object element) {

		if (nbElements == 0 || positionCourante == fin)
			insererFin(element);

		else {

			// Ajuste le précédent du suivant de la position courante.
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

		// On effectue le chaînage avec le nouveau noeud, des deux côtés.
		else {

			// On pourrait utiliser une variable temporaire aussi mais cest inutile.
			positionCourante.precedent.suivant = new Noeud(element, positionCourante, positionCourante.precedent);

			// On ajuste le précédent de D3 à D2.
			positionCourante.precedent = positionCourante.precedent.suivant;

			// On déplace la position courante sur le nouveau noeud (D2).
			positionCourante = positionCourante.precedent.suivant;

			nbElements++;
		}
	}

	public Object getElement() {

		/*
		 * STRATÉGIE : Retourne simplement l'élément du noeud à la position courante.
		 */
		return positionCourante.element;
	}

	public int getNbElements() {

		return nbElements;
	}

	// La suppression de chaînage double vous est laissée en exercice.

}