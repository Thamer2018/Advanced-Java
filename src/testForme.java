/**
 * 
 * @author <a href="mailto:Pierre.Belisle@etsmtl.ca">Pierre Belisle</a>
 * @version aout 2005
 */
public class testForme {

	/**
	 * Programme qui test les m�thodes des classes Cercle et Rectangle en utilisant
	 * le polymorphisme
	 */
	public static void main(String[] args) {

		// Cr�ation d'un cercle
		Cercle unCercle = new Cercle();

		// on affiche la position du cercle avec sa superficie et son p�rim�tre
		// afficherForme(unCercle);

		// on change le cercle de position et de rayon
		unCercle.setX(15);
		unCercle.setY(20);
		unCercle.setRayon(10);

		// on affiche le nouveau cercle
		afficherForme(unCercle);

		// un rectangle de hauteur 10, de largeur 15 � la position (-5,-2)
		Rectangle unRectangle = new Rectangle(10, 15, -5, -2);

		// on affiche la position du rectangle avec sa superficie et son p�rim�tre
		afficherForme(unRectangle);

		// on change le rectangle de position et de taille
		unRectangle.setX(15);
		unRectangle.setY(20);
		unRectangle.setHauteur(5);
		unRectangle.setLargeur(7);

		// on l'affiche encore
		afficherForme(unRectangle);
	}

	// Remarquer ici qu'on peut recevoir soit un cercle soit un rectangle
	// C'est cela le polymorphisme
	public static void afficherForme(InterfaceForme uneForme) {

		// on affiche la position, la superficie et le p�rim�tre
		// en �tant certain que ces m�thodes existent.
		System.out.println("position " + uneForme + " superficie = " + uneForme.getSuperficie() + " perimetre = "
				+ uneForme.getPerimetre());

	}

}
