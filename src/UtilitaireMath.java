/**
 * Module utilitaire qui contient quelques fonctions math�matiques demand�es
 * dans le cadre du laboratoire num�ro 2.
 * 
 * pgcd(a,b) : Le plus grand commun diviseur entre a et b ppcm(a,b) : Le plus
 * petit commun multiple entre a et b factoriel(n) : Le factoriel de n
 * (n*n-1*n-2*...*1) racineCarree(a) : L'�quivalent de Math.sqrt(a) et
 * Math.pow(a,0.5)
 * 
 * 
 * @author pbelisle
 * @version hiver 2016
 *
 */
public class UtilitaireMath {

	/**
	 * Description : Calcul et retourne le factoriel d'une valeur re�ue
	 * 
	 * @param valeur
	 *            contient le nombre pour lequel ont veux le factoriel
	 * @return valeur * factoriel(valeur - 1)
	 */
	public static int factoriel(int valeur) {

		/*
		 * Strategie : Le calcul du fatoriel se r�alise en mettant VALEUR_DEPART dans
		 * une variable i et dans une boucle WHILE, toutes les valeurs que prendra la
		 * variable i sont multipli�s entre elles jusqu'� ce que i soit plus grand que
		 * la valeur re�ue
		 * 
		 * Le r�sultat sera mis dans une variable factoriel initialis�e � 1 au d�part.
		 *
		 */
		final int VALEUR_DEPART = 2;

		// sert au calcul du factoriel
		int factoriel = 1;

		// on commence � deux pour sauver une multiplication inutile par 1.
		int i = VALEUR_DEPART;

		// On cumule le produit de toutes les valeurs entre elles
		while (i <= valeur) {
			factoriel = factoriel * i;

			// on prend soin de faire varier la variable-compteur (ou it�rateur)
			i++;
		}

		return factoriel;
	}

	/**
	 * Description : Calcule et retourne la racine carr�e de a
	 * 
	 * @param a
	 *            la valeur pour lequel on calcule la racine
	 * @param precision
	 *            : Un nombre r�el pour la pr�cision de la r�ponse
	 * @return la racine carr�e de a
	 */
	public static double racineCarree(double a, double precision) {

		/***********************************************
		 * Strat�gie : Le calcul est fait selon la m�thode de Newton (voir "racine
		 * carr�e" sur Wikip�dia)
		 **********************************************/
		// contiendra la racine carr�e de a
		double x;

		// au d�part x == a et on cherche que x^2 - a = 0 (ou presque)
		x = a;

		// Tant qu'on a pas atteint la pr�cision voulue, on effectue
		//
		// x = x a
		// --- + ----
		// 2 2x
		// (m�thode de Newton)
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
	 * @param entier1 La premi�re valeur � consid�rer
	 * 
	 * @param entier2 La deuxi�me valeur � consid�rer
	 * 
	 * @return Le pgcd entre entier1 et entier2
	 */
	public static int pgcd(int entier1, int entier2) {

		/*
		 * Strat�gie : On utilise l'algorithme d'Euclide qui fait une suite de
		 * soustraction pour trouver le pgcd.
		 * 
		 * Nous utilisons un while pour arr�ter lorsque l'un ou l'autre des entiers
		 * re�us est � 0. Selon celui qui tombe � 0, on retourne l'autre qui est le
		 * pgcd.
		 */
		// tantque les deux entiers sont diff�rents de 0
		while (entier1 != 0 && entier2 != 0) {

			// on soustrait le plus petit entier au plus grand
			if (entier1 > entier2)
				entier1 = entier1 - entier2;
			else
				entier2 = entier2 - entier1;
		}

		// Si l'entier1 est �gale a 0, c'est entier2 qui contient le pgcd sinon c'est
		// entier1
		return (entier1 == 0) ? entier2 : entier1;

	}

	// ******************
	// PPCM
	// ******************
	/*
	 * Calcule le plus petit commun multiple
	 * 
	 * @param entier1 La premi�re valeur � consid�rer
	 * 
	 * @param entier2 La deuxi�me valeur � consid�rer
	 * 
	 * @return Le ppcm entre entier1 et entier2
	 */
	public static int ppcm(int entier1, int entier2) {

		/*
		 * Strat�gie : On utilise la fonction pgcd(). On prend l'entier1 divis� par le
		 * pgcd entre entier1 et entier2 multipli� par entier2.
		 * 
		 * Note : Celui qui m'a expliqu� cette strat�gie s'appelle Hugues Saulnier et il
		 * est charg� de cours en informatique � l'�ts.
		 * 
		 * Sous toutes r�serves nous attribuons cet algorithme aussi � Euclide.
		 */
		return entier1 / pgcd(entier1, entier2) * entier2;
	}

}