/**
 * 
 */

/**
 * @author Thameur/ ce programme sert à effectuer differentes opération sur les
 *         wagons d'un train simplement chainée.
 *
 */
public class SinglyLinkedList {
	// private ListNode debut; // head node to hold the list
	// It contains a static inner class ListNode

	private static class ListNode {

		private int element;
		private ListNode suivant;

		public ListNode(int element) {
			this.element = element;
			this.suivant = null;
		}
	}

	// fournir la liste
	public static void affichage(ListNode debut) {
		if (debut == null) {// Liste est vide
			return;
		}

		// création d'un noeud temporaire pour parcourir la liste
		ListNode positionCourante = debut;

		// looper tous les éléments jusqu'à la fin de la liste.

		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1

		while (positionCourante != null) {
			// la fin de la liste pas atteinte
			System.out.print(positionCourante.element + " --> ");
			// afficher l'element de la position courante
			positionCourante = positionCourante.suivant;
			// se positionner sur le noeud suivant

			// Insert image 2
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1

			// Insert image 3
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1

			// Insert image 4
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1

		}
		System.out.println(positionCourante);
		// ici positionCourante devra etre null

	}

	public ListNode InsererAuDepart(ListNode debut, int element) {
		ListNode newNode = new ListNode(element);
		// on crée un nouveau noeud qui à par défaut so suvant à null (ref ligne 21)
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1

		if (debut == null) {
			// si la liste est vide
			return newNode;
			// on retourne la nouvelle liste
		}
		newNode.suivant = debut;
		// on pointe le suivant du newNode à inserer à la tete de la liste existante

		// Insert image 2
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1

		debut = newNode;

		// on pointe la tete de la liste vers le nouveau noeud récement crée

		// Insert image 3
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1

		// on retourne la tete de liste qui réfère à toute la nouvelle liste.
		return debut;

	}

	public ListNode insererAlaFin(ListNode debut, int element) {
		ListNode newNode = new ListNode(element);
		// on crée un nouveau noeud qui à par défaut so suvant à null (ref ligne 21)
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1

		if (debut == null) {

			// si la liste est vide
			return newNode;
			// on retourne la nouvelle liste
		}
		// créé un noeud temporaire pour parcourir la liste
		ListNode positionCourante = debut;
		// on pointe le noeud au début de la liste

		// Insert image 2
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1

		while (positionCourante.suivant != null) {
			// tantque la fin de la liste n'est pas atteinte
			positionCourante = positionCourante.suivant;
			// on deplace le noeud temporaire au suivant.

			// Insert image 3
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1

			// Insert image 4
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1

			// Insert image 5
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1

		}
		// si la fin est atteinte
		positionCourante.suivant = newNode;
		// on pointe le suivant du noeud temporaire sur le newNode

		// Insert image 6
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1

		return debut;
		// on retourne la tete de notre liste

	}

	public ListNode InsererAt(ListNode debut, int element, int position) {
		// perform boundary chech
		// vérifier si la position est plus grande que la longeur de la liste
		int size = length(debut);
		if (position > size) {
			System.out.println("position invalide ");
			return debut;
		}

		ListNode newNode = new ListNode(element);
		if (position == 1) {
			newNode.suivant = debut;
			return newNode;
		}

		else {
			ListNode precedent = debut;
			int compteur = 1;

			while (compteur < position - 1) {
				precedent = precedent.suivant;
				compteur++;

			}

			ListNode PositionCourrante = precedent.suivant;
			newNode.suivant = PositionCourrante;
			precedent.suivant = newNode;
			return debut;

		}
	}

	// Debut de la liste est fournit
	public int length(ListNode debut) {

		if (debut == null) {
			return 0;
		}

		// creer un compteur pour recevoir la longeur
		int compteur = 0;
		// looper la liste et incrémenter le compteur jusqu'a la fin
		ListNode PositionCourrante = debut;
		// noued temporaire pour parcourir la liste;

		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1
		// Insert image 1

		while (PositionCourrante != null) {
			compteur++;// incrémenter compteur
			PositionCourrante = PositionCourrante.suivant;
			// passer au noued suivant;

			// Insert image 2
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1

			// Insert image 3
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1

			// Insert image 4
			// Insert image 1
			// Insert image 1
			// Insert image 1
			// Insert image 1

		}

		return compteur;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// création d'une liste simplement chainée: 10-->8-->1-->11

		ListNode Wagon1 = new ListNode(10);
		ListNode Wagon2 = new ListNode(8);
		ListNode Wagon3 = new ListNode(1);
		ListNode Wagon4 = new ListNode(11);

		// attacher les noeuds pour former une liste

		Wagon1.suivant = Wagon2; // 10-->8
		Wagon2.suivant = Wagon3;// 10-->8-->1
		Wagon3.suivant = Wagon4;// 10-->8-->1-->11

		// création de la liste
		SinglyLinkedList train = new SinglyLinkedList();
		// affichage de la liste
		System.out.println("L'ancienne liste est : ");
		train.affichage(Wagon1);
		// insertion aprés le wagon 1
		Wagon1 = train.InsererAt(Wagon1, 15, 4);
		// affichage de la nouvelle liste
		System.out.println("La nouvelle Lsite est : ");
		train.affichage(Wagon1);

		// affichage de la longeur de la liste
		System.out.println("la longeur de la liste est - " + train.length(Wagon1));

	}

}
