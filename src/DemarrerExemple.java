import java.util.Scanner;

/**
 * Cette classe fait partie de la solution du deuxième laboratoire, celui sur
 * les sous-programmes (voir énoncé).
 * 
 * Elle contient un programme principal qui test différentes fonctions définies
 * dans le module UtilitaireMath.
 * 
 * 
 * @author pbelisle
 * @version hiver 2016
 */

public class DemarrerExemple {

	/*
	 * NOTE : La plupart des chaînes de caractères sont en constantes mais votre
	 * solution n'avait pas besoin d'en avoir. En d'autres mots, ce n'est pas une
	 * exigence pour ce cours
	 * 
	 * J'ai mis entierValide localement mais il devrait être dans un module. Je vous
	 * laisse le faire en exercice si ce n'est pas déjà fait. Créez un module
	 * UtilitaireValidation et mettez y la fonction entierValide.
	 * 
	 * Posez-vous la question si nous pourrions encore découper en SP?
	 * 
	 * Comment appeleriez-vous le module qui contiendrait ces SP ? (oups la réponse
	 * de la question précédente:)?
	 * 
	 */
	// *****************************************
	// Déclaration du tampon de clavier
	// *****************************************
	public static Scanner clavier = new Scanner(System.in);

	// *****************************************
	// Constantes
	// *****************************************
	// détermine le niveau de précision voulue dans la réponse
	// pour la racineCarree
	public static final double PRECISION = 0.0000001;

	public static final String LIAISON = " est ";

	// Caractères spéciaux d'affichage
	public static final String EFFACE_ECRAN = "\f";
	public static final String SAUTE_LIGNE = "\n";

	// messages
	public static final String MSG_SOL_FACTORIEL = "\nVeuillez entrer la valeur dont on souhaite calculer le factoriel : ";

	public static final String MSG_SOL_CARREE = "\nVeuillez entrer la valeur dont on souhaite calculer la racine : ";

	public static final String MSG_SOL_ENTIER_VALIDE = "\nVeuillez entrer un entier valide ";

	public static final String MSG_ERR_ENTIER = "\nDésolé entier invalide...";

	public static final String LIGNE_ENTETE = "**********************************************************************";

	public static final String TITRE = "*                         LA RACINE CARÉE D'UN NOMBRE                *";

	public static final String MSG_BIENVENU = "\n\nBienvenu au programme de calcul de la racine carrée";

	public static final String MSG_RESULTAT_FACTO = "Le factoriel de ";

	public static final String MSG_RESULTAT_CARREE = "\nLa racine carrée de ";

	public static final String MSG_RESULTAT_PGCD = "\nLe pgcd de ";

	public static final String MSG_RESULTAT_PPCM = "\nLe ppcm de ";

	public static final String MSG_RECOMMENCE = "\n\nVoulez-vous faire une autre demande de calcul ?";

	public static final String MSG_TAPEZ_UNE_TOUCHE = "\nTapez 'n' pour quitter suivi de <enter>: ";

	public static final String MSG_CONFIRMATION = "\n\nConfirmer votre réponse svp ";

	public static final String MSG_FIN = "\nMerci et à la prochaine....\n";

	// Réponse pour quitter
	public static final String CAR_FIN = "n";

	// Les limites fournies dans l'énoncé de labo
	public static final int MIN = 1;
	public static final int MAX = 1000;

	/*********************************************************
	 * PROGRAMME PRINCIPAL
	 *
	 * Ce programme permet de calculer et d'afficher le factoriel, la racine carrée
	 * d'un nombre entré par l'utilisateur. ainsi que le ppcm et le pgcd entre deux
	 * valeures entières validées.
	 *****************************************************/
	public static void main(String[] args) {

		// *****************************************
		// variables
		// *****************************************
		int n; // nombre saisi pour le factoriel
		double a; // nombre saisi pour la racine carrée

		// Les deux valeurs saisit pour tester le pgcd et le ppcm
		int v1;
		int v2;

		// on saisit la valeur pour le factoriel
		System.out.print(MSG_SOL_FACTORIEL);
		n = clavier.nextInt();

		// on saisit la valeur pour la racine carrée
		System.out.print(MSG_SOL_CARREE);
		a = clavier.nextDouble();

		// on fait appel à une fonction locale pour le calcul
		// de la racine carree et on affiche la valeur retournée (pas formaté)
		System.out.println(MSG_RESULTAT_CARREE + a + LIAISON + UtilitaireMath.racineCarree(a, PRECISION));

		// L'affichage du factoriel
		System.out.println();
		System.out.println(MSG_RESULTAT_FACTO + a + LIAISON + UtilitaireMath.factoriel(n));

		// La validation de nombre en MIN et MAX pour affecter v1 et v2 et
		// tester pgcd et ppcm à l'aide de entierValide
		v1 = entierValide(MSG_SOL_ENTIER_VALIDE, MIN, MAX, MSG_ERR_ENTIER);

		v2 = entierValide(MSG_SOL_ENTIER_VALIDE, MIN, MAX, MSG_ERR_ENTIER);

		// L'affichage du pgcd
		System.out.println();
		System.out.println(MSG_RESULTAT_PGCD + v1 + "," + v2 + LIAISON + UtilitaireMath.pgcd(v1, v2));

		// L'affichage du ppcm
		System.out.println();
		System.out.println(MSG_RESULTAT_PPCM + v1 + "," + v2 + LIAISON + UtilitaireMath.ppcm(v1, v2));

		// le programme est fini(devrait être un SP)
		System.out.print(SAUTE_LIGNE);
		System.out.print(LIGNE_ENTETE);
		System.out.println(MSG_FIN);
		System.out.print(LIGNE_ENTETE);
	}

	/******************************************************
	 * lit et valide une annee plus grande que ANNEMAX retour : un entier valide
	 *******************************************************/
	public static int entierValide(String msgSollic, int min, int max, String msgErreur) {

		/*
		 * STRATÉGIE : On lit d'abord un entier et on utilise un while pour la
		 * validation car si la valeur est déjà valide, on n'entre pas dans la boucle.
		 */

		int entier; // sert a la saisit de l'entier

		System.out.print(msgSollic);
		entier = clavier.nextInt();

		//// lit tant que ce n'est pas valide
		while (entier < min || entier > max) {
			System.out.print(msgErreur + msgSollic + "(" + min + "," + max + ")");
			entier = clavier.nextInt();
		}

		return entier;
	}
}
