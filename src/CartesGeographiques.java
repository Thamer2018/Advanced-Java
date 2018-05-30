
public class CartesGeographiques extends Cartes {

	private String nomCarte;
	private String superficie;

	public CartesGeographiques() {

		super();
		nomCarte = null;
		superficie = null;

	}

	public CartesGeographiques(int prix, double hauteur, double largeur, int numEmplacement, String compagnieDist,
			String nomCarte, String superficie) {

		super(prix, hauteur, largeur, numEmplacement, compagnieDist);
		this.nomCarte = nomCarte;
		this.superficie = superficie;
	}

}
