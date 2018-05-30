
public class CartesAffaire extends Cartes {

	private boolean couleur;
	private boolean photo;

	public CartesAffaire() {

		super();
		couleur = false;
		photo = false;

	}

	public CartesAffaire(int prix, double hauteur, double largeur, int numEmplacement, String compagnieDist,
			boolean couleur, boolean photo) {

		super(prix, hauteur, largeur, numEmplacement, compagnieDist);
		this.couleur = couleur;
		this.photo = photo;
	}

}
