/**
 * Module utilitaire qui contient quelques fonctions mathématiques demandées
 * dans le cadre du laboratoire numéro 2.
 * 
 * pgcd(a,b) : Le plus grand commun diviseur entre a et b ppcm(a,b) : Le plus
 * petit commun multiple entre a et b factoriel(n) : Le factoriel de n
 * (n*n-1*n-2*...*1) racineCarree(a) : L'équivalent de Math.sqrt(a) et
 * Math.pow(a,0.5)
 * 
 * 
 * @author pbelisle
 * @version hiver 2016
 *
 */
public class UtilitaireMath {

	/**
	 * Description : Calcul et retourne le factoriel d'une valeur reçue
	 * 
	 * @param valeur
	 *            contient le nombre pour lequel ont veux le factoriel
	 * @return valeur * factoriel(valeur - 1)
	 */
	public static int factoriel(int valeur) {

		/*
		 * Strategie : Le calcul du fatoriel se réalise en mettant VALEUR_DEPART dans
		 * une variable i et dans une boucle WHILE, toutes les valeurs que prendra la
		 * variable i sont multipliés entre elles jusqu'à ce que i soit plus grand que
		 * la valeur reçue
		 * 
		 * Le résultat sera mis dans une variable factoriel initialisée à 1 au départ.
		 *
		 */
		final int VALEUR_DEPART = 2;

		// sert au calcul du factoriel
		int factoriel = 1;

		// on commence à deux pour sauver une multiplication inutile par 1.
		int i = VALEUR_DEPART;

		// On cumule le produit de toutes les valeurs entre elles
		while (i <= valeur) {
			factoriel = factoriel * i;

			// on prend soin de faire varier la variable-compteur (ou itérateur)
			i++;
		}

		return factoriel;
	}

	/**
	 * Description : Calcule et retourne la racine carrée de a
	 * 
	 * @param a
	 *            la valeur pour lequel on calcule la racine
	 * @param precision
	 *            : Un nombre réel pour la précision de la réponse
	 * @return la racine carrée de a
	 */
	public static double racineCarree(double a, double precision) {

		/***********************************************
		 * Stratégie : Le calcul est fait selon la méthode de Newton (voir "racine
		 * carrée" sur Wikipédia)
		 **********************************************/
		// contiendra la racine carrée de a
		double x;

		// au départ x == a et on cherche que x^2 - a = 0 (ou presque)
		x = a;

		// Tant qu'on a pas atteint la précision voulue, on effectue
		//
		// x = x a
		// --- + ----
		// 2 2x
		// (méthode de Newton)
		while (x * x - a > precision) {
			x = x / 2 + a / (x + x);
		}

		return x;
	}

	// ******************
	// PGCD
	// ******************
	/*
	 * Calcule le plus grand commun diviseur
	 * 
	 * @param entier1 La première valeur à considérer
	 * 
	 * @param entier2 La deuxième valeur à considérer
	 * 
	 * @return Le pgcd entre entier1 et entier2
	 */
	public static int pgcd(int entier1, int entier2) {

		/*
		 * Stratégie : On utilise l'algorithme d'Euclide qui fait une suite de
		 * soustraction pour trouver le pgcd.
		 * 
		 * Nous utilisons un while pour arrêter lorsque l'un ou l'autre des entiers
		 * reçus est à 0. Selon celui qui tombe à 0, on retourne l'autre qui est le
		 * pgcd.
		 */
		// tantque les deux entiers sont différents de 0
		while (entier1 != 0 && entier2 != 0) {

			// on soustrait le plus petit entier au plus grand
			if (entier1 > entier2)
				entier1 = entier1 - entier2;
			else
				entier2 = entier2 - entier1;
		}

		// Si l'entier1 est égale a 0, c'est entier2 qui contient le pgcd sinon c'est
		// entier1
		return (entier1 == 0) ? entier2 : entier1;

	}

	// ******************
	// PPCM
	// ******************
	/*
	 * Calcule le plus petit commun multiple
	 * 
	 * @param entier1 La première valeur à considérer
	 * 
	 * @param entier2 La deuxième valeur à considérer
	 * 
	 * @return Le ppcm entre entier1 et entier2
	 */
	public static int ppcm(int entier1, int entier2) {

		/*
		 * Stratégie : On utilise la fonction pgcd(). On prend l'entier1 divisé par le
		 * pgcd entre entier1 et entier2 multiplié par entier2.
		 * 
		 * Note : Celui qui m'a expliqué cette stratégie s'appelle Hugues Saulnier et il
		 * est chargé de cours en informatique à l'Éts.
		 * 
		 * Sous toutes réserves nous attribuons cet algorithme aussi à Euclide.
		 */
		return entier1 / pgcd(entier1, entier2) * entier2;
	}

}